package _2024_03_04;

public class FourElements {
    public static void main(String[] args) {
        Storage storage = new Storage();

        Producer producer = new Producer(storage);
        Consumer consumer = new Consumer(storage);
        Reservation reservation = new Reservation(storage);
        Payment payment = new Payment(storage);

        Thread prodThread = new Thread(producer);
        Thread resThread = new Thread(reservation);
        Thread consThread = new Thread(consumer);
        Thread payThread = new Thread(payment);

        prodThread.start();
        resThread.start();
        consThread.start();
        payThread.start();
    }
}

class Storage {
    private int item = 0;
    private int reservedItems = 0;
    private int payment = 0;
    private final Object lock = new Object();

    public void getItem() {
        synchronized (lock) {
            while (reservedItems < 5) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            reservedItems--;
            payment++;
            System.out.println("Customer has bought one item. Quantity: " + reservedItems);
            lock.notifyAll();
        }
    }

    public void putItem() {
        synchronized (lock) {
            while (item >= 5 || reservedItems >= 5 || payment > 1) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            item++;
            System.out.println("Factory put one item into the Storage. Quantity: " + item);
            lock.notifyAll();
        }
    }

    public void reservation() {
        synchronized (lock) {
            while (payment < 1 || reservedItems >= 5) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            reservedItems++;
            item--;
            System.out.println("Items reserved: " + reservedItems);
            lock.notifyAll();
        }
    }

    public void payment() {
        synchronized (lock) {
            while (payment < 1 || reservedItems < 1) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            payment--;
            System.out.println("Payment has been made: " + payment);
            lock.notifyAll();
        }
    }
}

class Producer implements Runnable {
    Storage storage;

    public Producer(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            storage.putItem();
        }
    }
}

class Consumer implements Runnable {
    Storage storage;

    public Consumer(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            storage.getItem();
        }
    }
}

class Reservation implements Runnable {
    Storage storage;

    public Reservation(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            storage.reservation();
        }
    }
}

class Payment implements Runnable {
    Storage storage;

    public Payment(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            storage.payment();
        }
    }
}
