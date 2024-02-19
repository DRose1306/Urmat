package _2023_12_20.HW.leagues;

import _2023_12_20.HW.errorMessage.SomethingWentWrongExeption;
import _2023_12_20.HW.gameLogic.Game;
import _2023_12_20.HW.gameLogic.Handler;
import _2023_12_20.HW.players_and_teams.Team;

import java.util.Set;

import static _2023_12_20.HW.gameLogic.OtherMethods.*;
import static _2023_12_20.HW.players_and_teams.Team.createTeams;

public class NCAA {
    public static void main(String[] args) throws SomethingWentWrongExeption {

        Handler handler = new Handler();

        // Генерация и добавление команд в Handler
        Set<Team> teams = Team.createTeams(25);
        for (Team command : teams) {
            handler.addCommand(command);
        }

        System.out.println("Welcome to NCAA 2023 - 2024 season!");

        handler.playAllRounds();

        System.out.println("**********************************");
        System.out.println("NCAA season is over");
        System.out.println("Our winners");
        System.out.println();
        Handler.top3();

        /********************************************/
        System.out.println();
        System.out.println("******************");
        System.out.println("Statistics of season");
        System.out.println();

        top1();
        System.out.println("Total point of seaason: " + totalPoints());
        teamsWithoutPoints();
        System.out.println("Averege Point: " + averagePoint());
        System.out.println();
        aboveAveregeTeams();

    }
}
