package _2023_12_20.HW;

import java.util.List;

import static _2023_12_20.HW.Game.findWinner;
import static _2023_12_20.HW.Team.createPlayers;
import static _2023_12_20.HW.Team.createTeams;

public class NCAA {
    public static void main(String[] args) {
        List<Player> allPlayers = createPlayers(20);

        // Создание команд
        List<Team> teams = createTeams(allPlayers, 4);

        Game game = new Game(teams);

        game.playAllRounds2(); // вызван немного переделанный метод. Отличие лишь в том, что после каждого круга не будет вывод консоль начала и конца круга

        printResults(teams.size() - 1, teams);


        Team winner = findWinner(teams);
        System.out.println("The winner is: ");
        winner.printTeamInfo(winner);

    }
//скопировал этот метод сюда чтобы таблицы выводить после всех игр, а не после каждого круга. Так для разнообразия.
    public static void printResults(int round, List<Team> teams) {
        System.out.println("Results Table After Round " + round + ":");
        System.out.println("------------------------------");
        System.out.printf("%-20s %-10s\n", "Team", "Points");
        System.out.println("------------------------------");
        for (Team team : teams) {
            System.out.printf("%-20s %-10d\n", team.getName(), team.getPoints());
        }
        System.out.println("------------------------------");
    }

}
