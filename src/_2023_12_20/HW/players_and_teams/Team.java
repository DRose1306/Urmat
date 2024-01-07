package _2023_12_20.HW.players_and_teams;


import _2023_12_20.HW.enums.Position;
import com.github.javafaker.Faker;

import java.util.*;

public class Team<P extends Player> {
    static final Faker FAKER = new Faker();
    private String name;
    private Set<Player> players;

    public Team(String name) {
        this.name = name;
        this.players = new HashSet<>();
    }

    public Set<Player> getPlayers() {
        return players;
    }

    public void setPlayers(Set<Player> players) {
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


    private static Set<Player> createPlayers(int numPlayers) { // тут создаются игроки, по одному на каждую позицию
        Set<Player> players = new HashSet<>();              // чтобы в каждой команде было по игроку каждой позиции

        for (int i = 0; i < numPlayers; i++) {
            for (Position position : Position.values()) {
                players.add(new Player(FAKER.name().fullName(), position));
            }
        }

        return players;
    }


    public static Set<Team> createTeams(int numOfTeams) {
        Set<Player> players = createPlayers(numOfTeams * 5);
        Set<Team> teams = new HashSet<>();

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

    private static Player findPlayerByPosition(Set<Player> players, Position position) {
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

}
