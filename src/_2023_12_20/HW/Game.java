package _2023_12_20.HW;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Game {
    private List<Team> teams;

    public Game(List<Team> teams) {
        this.teams = teams;
    }

    /*public void playAllRounds(int numRounds) {
        for (int round = 1; round <= numRounds; round++) {
            playRound(round);
            printResults(round);
        }
    }

    private void playRound(int round) {
        System.out.println("Round " + round + " started!");
        for (int i = 0; i < teams.size(); i++) {
            for (int j = i + 1; j < teams.size(); j++) {
                Team teamA = teams.get(i);
                Team teamB = teams.get(j);

                // Играем матч
                teamA.playGame(teamB);
            }
        }
        System.out.println("Round " + round + " completed!");
    }*/

    public void playAllRounds() {
        int numTeams = teams.size();
        int totalRounds = numTeams - 1;

        for (int round = 1; round <= totalRounds; round++) {
            System.out.println("Round " + round + " started!");
            List<Team> roundTeams = new ArrayList<>(teams);
            Collections.shuffle(roundTeams);

            for (int i = 0; i < numTeams / 2; i++) {
                Team teamA = roundTeams.get(i);
                Team teamB = roundTeams.get(i + numTeams / 2);

                // Играем матч
                teamA.playGame(teamB);

            }

            System.out.println("Round " + round + " completed!");
            printResults(round);
        }
    }

    public void playAllRounds2() {
        int numTeams = teams.size();
        int totalRounds = numTeams - 1;

        for (int round = 1; round <= totalRounds; round++) {
            List<Team> roundTeams = new ArrayList<>(teams);
            Collections.shuffle(roundTeams);

            for (int i = 0; i < numTeams / 2; i++) {
                Team teamA = roundTeams.get(i);
                Team teamB = roundTeams.get(i + numTeams / 2);

                // Играем матч
                teamA.playGame(teamB);

            }
        }
    }

    public void printResults(int round) {
        System.out.println("Results Table After Round " + round + ":");
        System.out.println("------------------------------");
        System.out.printf("%-20s %-10s\n", "Team", "Points");
        System.out.println("------------------------------");
        for (Team team : teams) {
            System.out.printf("%-20s %-10d\n", team.getName(), team.getPoints());
        }
        System.out.println("------------------------------");
    }

    public static Team findWinner(List<Team> teams) {
        Team winner = null;
        int maxPoints = Integer.MIN_VALUE;

        for (Team team : teams) {
            if (team.getPoints() > maxPoints) {
                maxPoints = team.getPoints();
                winner = team;
            }
        }

        return winner;
    }

}
