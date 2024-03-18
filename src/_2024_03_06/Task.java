package _2024_03_06;

import com.github.javafaker.Faker;
import lombok.Getter;

import java.util.*;
import java.util.concurrent.Exchanger;

public class Task {
    private static final Exchanger<Action2> EXCHANGER = new Exchanger<>();
    private static final Faker FAKER = new Faker();
    private static final Random RANDOM = new Random();

    private static List<Action2> getListActionOf10() {
        List<Action2> actionList = new ArrayList<>();
        Action2[] actions = Action2.values();
        for (int i = 0; i < 10; i++) {
            actionList.add(actions[RANDOM.nextInt(actions.length)]);
        }
        return actionList;
    }

    private static Set<Player2> playerCreator() {
        Set<Player2> players = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            players.add(new Player2(FAKER.name().name(), EXCHANGER, getListActionOf10()));
        }
        return players;
    }

    public static void main(String[] args) {
        List<Team> teams = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            teams.add(new Team(FAKER.team().name(), playerCreator()));
        }

        for (int i = 0; i < teams.size(); i++) {
            Team team1 = teams.get(i);
            for (int j = i + 1; j < teams.size(); j++) {
                Team team2 = teams.get(j);

                Set<Player2> players1 = team1.getPlayers();
                Set<Player2> players2 = team2.getPlayers();

                //playMatches(players1, players2);
            }
        }
    }
}

class Team {
    private final String name;
    private final Set<Player2> players;

    @Getter
    public static double point;

    public Team(String name, Set<Player2> players) {
        this.name = name;
        this.players = players;
    }

    public String getName() {
        return name;
    }

    public Set<Player2> getPlayers() {
        return players;
    }

}

enum Action2 {
    SCISSORS, STONE, PAPER
}

class Player2 extends Thread {
    private final String name;
    private final Exchanger<Action2> exchanger;
    private final List<Action2> actionList;

    public Player2(String name, Exchanger<Action2> exchanger, List<Action2> actionList) {
        this.name = name;
        this.exchanger = exchanger;
        this.actionList = actionList;
    }

    private void getWinner(Action2 p1, Action2 p2) {
        if (p1 == Action2.PAPER && p2 == Action2.STONE || p1 == Action2.SCISSORS && p2 == Action2.PAPER || p1 == Action2.STONE && p2 == Action2.SCISSORS) {
            System.out.println("***WINNER: " + name + " ***");
            Team.point++;
        } else if (p1 == Action2.STONE && p2 == Action2.PAPER || p1 == Action2.PAPER && p2 == Action2.SCISSORS || p1 == Action2.SCISSORS && p2 == Action2.STONE) {
            System.out.println("***LOSER: " + name + " ***");
        } else {
            System.out.println("Draw game");
            Team.point = Team.point + 0.5;
        }
    }

    @Override
    public void run() {
        Action2 get;
        for (Action2 action : actionList) {
            try {
                Thread.sleep(1234);
                get = exchanger.exchange(action);
                getWinner(action, get);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
