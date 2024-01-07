package _2023_12_20.HW.gameLogic;

import _2023_12_20.HW.players_and_teams.Team;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class Game {
    private Set<Team> teams;

    public Game(Set<Team> teams) {
        this.teams = teams;
    }

    /*public void playAllRounds(int numRounds) {
        for (int round = 1; round <= numRounds; round++) {
            playRound(round);
            printResults(round);
        }
    }*/

   /* private void playRound(int round) {
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

   /* public void playAllRounds() {
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
                playGame(teamB);

            }

            System.out.println("Round " + round + " completed!");
            printResults(round);
        }
    }*/

  /*  public void playAllRounds2() { // тут просто без вывода раундов
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
    }*/
}