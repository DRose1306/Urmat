package _2024_02_28;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class DTex {
    private static final String USER_FILE_NAME = "userFile.txt";
    private static final String DAEMON_FILE_NAME = "daemonFile.txt";

    public static void main(String[] args) {
        System.out.println("MAIN START");

        BufferedWriter userWriter = null;
        BufferedWriter daemonWriter = null;

        try {
            userWriter = new BufferedWriter(new FileWriter(USER_FILE_NAME));
            daemonWriter = new BufferedWriter(new FileWriter(DAEMON_FILE_NAME));

            UserThread userThread = new UserThread(userWriter);
            DaemonThread daemonThread = new DaemonThread(daemonWriter);
            daemonThread.setDaemon(true);

            userThread.start();
            daemonThread.start();



            userThread.join();
            daemonThread.join();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        } finally {
            try {
                if (userWriter != null) userWriter.close();
                if (daemonWriter != null) daemonWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println("MAIN END");
    }
}

class UserThread extends Thread {
    private BufferedWriter writer;

    public UserThread(BufferedWriter writer) {
        this.writer = writer;
    }

    @Override
    public void run() {
        for (char c = '!'; c < 'z'; c++) {
            try {
                String message = "USER THREAD: " + c;
                writeToFile(message);
                System.out.println(message);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private synchronized void writeToFile(String message) throws IOException {
        writer.write(message + "\n");
        writer.flush();
    }
}

class DaemonThread extends Thread {
    private BufferedWriter writer;

    public DaemonThread(BufferedWriter writer) {
        this.writer = writer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 99; i++) {
            try {
                String message = "DAEMON: " + i;
                writeToFile(message);
                System.out.println(message);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private synchronized void writeToFile(String message) throws IOException {
        writer.write(message + "\n");
        writer.flush();
    }
}
