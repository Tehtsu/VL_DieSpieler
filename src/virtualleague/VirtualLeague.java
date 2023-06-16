/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package virtualleague;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class VirtualLeague {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Team team1 = Team.create("Germany");
        Team team2 = Team.create("Poland");
        Team team3 = Team.create("Egypt");

        printTeam(team1);
        printTeam(team2);
        printTeam(team3);


    }

    public static void printTeam(Team team) {
        System.out.println("Nation: " + team.getNation());
        System.out.println("Torwart: " + team.getGoalkeeper().getName() + " (Alter: " + team.getGoalkeeper().getAge() + ")");
        System.out.println("Feldspieler: ");
        for (Player player : team.getFieldPlayers()) {
            System.out.println("- " + player.getName() + " Alter: " + player.getAge() + ", Position: " + player.getPosition() );
        }
        System.out.println();
    }

}
