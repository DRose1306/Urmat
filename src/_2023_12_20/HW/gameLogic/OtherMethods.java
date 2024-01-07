package _2023_12_20.HW.gameLogic;

import _2023_12_20.HW.players_and_teams.Team;

import java.util.*;

import static _2023_12_20.HW.gameLogic.Handler.mapSort;
import static _2023_12_20.HW.gameLogic.Handler.playGame;


public class OtherMethods {
    //Найти команду с максимальными баллами:
    public static void top1() {
        Map<Team, Double> sortedMap = mapSort();
        int count = 0;
        System.out.print("Top 1 team of season: ");
        for (Team team : sortedMap.keySet()) {
            if (count < 1) {
                System.out.println(team.getName());
                count++;
            } else {
                break;
            }
        }
    }

    //Подсчет общего количества баллов:
    public static double totalPoints() {
        Map<Team, Double> sortedMap = Handler.getResults();
        double total = 0;

        for (Double point : sortedMap.values()) {
            total += point;
        }
        return total;
    }

    //Список команд без баллов:
    public static void teamsWithoutPoints() {
        Map<Team, Double> teams = Handler.getResults();
        Set<Team> teamsWithout = new HashSet<>();

        System.out.println("List of teams without points: ");

        for (Map.Entry<Team, Double> entry : teams.entrySet()) {
            if (entry.getValue() == 0) {
                teamsWithout.add(entry.getKey());
            }
        }
        for (Team team : teamsWithout) {
            System.out.println(team.getName());
        }
    }

    //Средний возраст участников в каждой команде:
    public static void averageAge() {
        Map<Team, Double> teams = Handler.getResults();
        //не добавлял поля возраст
    }

    //Подсчет среднего балла
    public static double averagePoint() {
        return totalPoints() / 25;
    }

    //Команды с баллами выше среднего:
    public static void aboveAveregeTeams() {
        double averegePoint = averagePoint();
        Set<Team> aboveTeams = new HashSet<>();

        Map<Team, Double> teams = Handler.getResults();
        for (Map.Entry<Team, Double> entry : teams.entrySet()) {
            if (entry.getValue() > averegePoint) {
                aboveTeams.add(entry.getKey());
            }
        }
        System.out.println("Teams with point above averege points: ");
        for (Team team : aboveTeams) {
            System.out.println(team.getName());
        }
    }

    //Сортировка команд по баллам: выводится уже отсортированным

    //Команды с определенной категорией участников:
    // Вывести команды, где все участники принадлежат к одной категории (например, только Adult).
    // по логике моей домашки такое не возможно вывести

    //Команды с победами над определенной командой: Определить команды, которые выиграли у заданной команды.
    public static void getWinningTeams(Team targetTeam) {
        Set<Team> winningTeams = new HashSet<>();

        Map<Team, Double> teams = Handler.getResults();
        for (Map.Entry<Team, Double> entry : teams.entrySet()) {
            Team opponentTeam = entry.getKey();
            int result = playGame(opponentTeam, targetTeam);

            if (result == 2) {
                winningTeams.add(opponentTeam);
            }
        }

        System.out.println("Teams that won over " + targetTeam);
        for (Team team : winningTeams) {
            System.out.println(team);
        }
    }

    public static Team getRandomTeam() {
        Set<Team> teams = new HashSet<>();

        Map<Team, Double> map = Handler.getResults();
        for (Map.Entry<Team, Double> entry : map.entrySet()) {
            teams.add(entry.getKey());
        }

        Random random = new Random();
        int index = random.nextInt(teams.size());
        return teams.stream().skip(index).findFirst().orElse(null);

    }

    public static void main(String[] args) {
        //Team targetTeam = getRandomTeam();
        //getWinningTeams(targetTeam);

    }
}
