package _2023_12_20.HW.gameLogic;

import _2023_12_20.HW.players_and_teams.Team;

import java.util.*;

public class Handler {
    private static Set<Team> commands;
    private static Map<Team, Double> results;

    public Handler() {
        this.commands = new HashSet<>();
        this.results = new HashMap<>();
    }

    public void addCommand(Team command) {
        commands.add(command);
    }

    public static Map<Team, Double> getResults() {
        return results;
    }

    public static Set<Team> getCommands() {
        return commands;
    }

    public static int playGame(Team team1, Team opponent) {
        Random random = new Random();
        int result = random.nextInt(3);

        // Обработка результатов матча
        if (result == 2) {
            System.out.println(team1.getName() + " wins against " + opponent.getName() + "!");
        } else if (result == 0) {
            System.out.println(opponent.getName() + " wins against " + team1.getName() + "!");
        } else {
            System.out.println("The match between " + team1.getName() + " and " + opponent.getName() + " ended in a draw");
        }
        return result;
    }


    private void updateResults(Team team1, Team opponent, int result) {
        results.putIfAbsent(team1, 0.0);
        results.putIfAbsent(opponent, 0.0);

        Double currentScoreT1 = results.get(team1);
        Double currentScoreT2 = results.get(opponent);

        double newScoreT1;
        double newScoreT2;

        switch (result) {
            case 0:
                newScoreT1 = currentScoreT1;
                newScoreT2 = currentScoreT2 + 1;
                break;
            case 1:
                newScoreT1 = currentScoreT1 + 0.5;
                newScoreT2 = currentScoreT2 + 0.5;
                break;
            case 2:
                newScoreT1 = currentScoreT1 + 1;
                newScoreT2 = currentScoreT2;
                break;
            default:
                newScoreT1 = currentScoreT1;
                newScoreT2 = currentScoreT2;
        }

        results.put(team1, newScoreT1);
        results.put(opponent, newScoreT2);
    }


    public void playAllRounds() {
        int numTeams = commands.size();
        int totalRounds = numTeams - 1;

        for (int round = 1; round <= totalRounds; round++) {
            System.out.println("Round " + round + " started!");
            List<Team> roundTeams = new ArrayList<>(commands);
            Collections.shuffle(roundTeams);

            for (int i = 0; i < numTeams / 2; i++) {
                Team teamA = roundTeams.get(i);
                Team teamB = roundTeams.get(i + numTeams / 2);

                // Играем матч
                int result = playGame(teamA, teamB);
                updateResults(teamA, teamB, result);
            }

            System.out.println();
            System.out.println("Round " + round + " completed!");
            System.out.println();

            printResults(round);
        }
    }

    private void printResults(int round) {

        Map<Team, Double> sortedMap = mapSort();

        System.out.println("Results Table After Round " + round + ":");
        System.out.println("------------------------------");
        System.out.printf("%-20s %-10s\n", "Team", "Points");
        System.out.println("------------------------------");

        for (Map.Entry<Team, Double> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey().getName() + "    " + entry.getValue());
        }
        System.out.println("------------------------------");
    }

    public static Map<Team, Double> mapSort() {

        List<Map.Entry<Team, Double>> sortedResults = new ArrayList<>(results.entrySet());
        sortedResults.sort(Map.Entry.<Team, Double>comparingByValue().reversed());

        Map<Team, Double> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<Team, Double> entry : sortedResults) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }

    public static void top3() {
        Map<Team, Double> sortedMap = mapSort();
        int count = 0;

        for (Map.Entry<Team, Double> entry : sortedMap.entrySet()) {
            if (count < 3) {
                System.out.println(entry.getKey().getName() + " - " + entry.getValue());
                count++;
            } else {
                break;
            }
        }
    }
}

