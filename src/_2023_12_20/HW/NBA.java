package _2023_12_20.HW;

import java.util.List;

import static _2023_12_20.HW.Game.findWinner;
import static _2023_12_20.HW.Team.createPlayers;
import static _2023_12_20.HW.Team.createTeams;

public class NBA {

    public static void main(String[] args) {
        // Создание игроков
        List<Player> allPlayers = createPlayers(20);

        // Создание команд
        List<Team> teams = createTeams(allPlayers, 4);

        Game game = new Game(teams);

        game.playAllRounds();

        Team winner = findWinner(teams);
        System.out.println("The winner is: ");
        winner.printTeamInfo(winner);

    }
}
