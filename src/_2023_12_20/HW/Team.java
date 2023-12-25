package _2023_12_20.HW;


import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static _2023_12_20.HW.Player.*;

public class Team<P extends Player> {
    static final Faker FAKER = new Faker();
    private String name;
    private List<Player> players;
    private int points;

    public Team(String name) {
        this.name = name;
        this.players = new ArrayList<>();
        this.points = 0;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public void addPlayer(P p) {
        players.add(p);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addPoint() {
        points++;
    }

    public int getPoints() {
        return points;
    }

    public static List<Player> createPlayers(int numPlayers) { // тут создаются игроки, по одному на каждую позицию
        List<Player> players = new ArrayList<>();              // чтобы в каждой команде было по игроку каждой позиции

        for (int i = 0; i < numPlayers; i++) {
            for (Position position : Position.values()) {
                players.add(new Player(FAKER.name().fullName(), position));
            }
        }

        return players;
    }

    public static List<Team> createTeams(List<Player> players, int numOfTeams) {
        List<Team> teams = new ArrayList<>();

        for (int i = 0; i < numOfTeams; i++) { //тут создается заданное количество команд
            Team team = new Team(FAKER.team().name());

            for (Position position : Position.values()) { // и в них добавляются игроки по одному с каждой позиции
                Player player = findPlayerByPosition(players, position); // возможно не заработает, с первого раза не заработало
                if (player != null) {
                    team.addPlayer(player);
                    players.remove(player);
                }
            }
            teams.add(team);
        }
        return teams;
    }

    public static Player findPlayerByPosition(List<Player> players, Position position) {
        for (Player player : players) {
            if (player.getPosition() == position) {
                return player;
            }
        }
        return null;
    }

    public void printTeamInfo(Team team) {
        System.out.println("Team: " + team.getName());
        System.out.println("Players:");
        for (Player player : players) {
            System.out.println("- " + player.getName() + " (" + player.getPosition() + ")");
        }
        System.out.println();
    }

    public void playGame(Team opponent) {
        Random random = new Random();
        boolean isWinner = random.nextBoolean();

        // Обработка результатов матча
        if (isWinner) {
            System.out.println(this.getName() + " wins against " + opponent.getName() + "!");
            this.addPoint();
        } else {
            System.out.println(opponent.getName() + " wins against " + this.getName() + "!");
            opponent.addPoint();
        }
    }

}
