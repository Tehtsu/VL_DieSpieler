/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package virtualleague;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Team extends Player {

    private String nation;
    private Player goalkeeper;
    private List<Player> fieldPlayers;

    /**
     *
     * @param name
     * @param birthday
     * @param position
     * @param nation
     * @param goalkeeper
     * @param fieldPlayers
     */
    public Team(String name, LocalDate birthday, FieldPosition position, String nation, Player goalkeeper, List<Player> fieldPlayers) {
        super(name, birthday, position);
        this.nation = nation;
        this.goalkeeper = goalkeeper;
        this.fieldPlayers = fieldPlayers;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        if (nation != null && !nation.trim().isEmpty()) {
            this.nation = nation;
        }
    }

    public Player getGoalkeeper() {
        return goalkeeper;
    }

    public void setGoalkeeper(Player goalkeeper) {
        if (goalkeeper != null && !goalkeeper.toString().isEmpty()) {
            this.goalkeeper = goalkeeper;
        }
    }

    public List<Player> getFieldPlayers() {
        return fieldPlayers;
    }

    public void setFieldPlayers(List<Player> fieldPlayers) {
        if (fieldPlayers != null && !fieldPlayers.isEmpty()) {
            this.fieldPlayers = fieldPlayers;
        }
    }

    public boolean isDefense(Player player) {
        return player.getPosition() == FieldPosition.Defense;
    }

    public boolean isMidfield(Player player) {
        return player.getPosition() == FieldPosition.Midfield;
    }

    public boolean isStrike(Player player) {
        return player.getPosition() == FieldPosition.Striker;
    }

    /**
     * creates a random year between 1987 and 2010
     * @return year
     */
    private static int year() {
        int yearMax = 1987;
        int yearMin = 2010;
        int yearRange = yearMax - yearMin + 1;
        int year = (int) (Math.random() * yearRange) + yearMin;
        return year;
    }

    /**
     * create a random month between 1 and 12
     * @return month
     */
    private static int month() {
        int monthMax = 1;
        int monthMin = 12;
        int monthRange = monthMax - monthMin + 1;
        int month = (int) (Math.random() * monthRange) + monthMin;
        return month;
    }

    /**
     * create a random day between 1 and 31
     * @return
     */
    private static int day() {
        int dayMax = 1;
        int dayMin = 31;
        int dayRange = dayMax - dayMin + 1;
        int day = (int) (Math.random() * dayRange) + dayMin;
        return day;
    }

    public static Team create(String nation) {

        Player goalkeeper = new Player("Torwart", LocalDate.of(year(), month(), day()), FieldPosition.Goalkeeper);
        List<Player> fieldPlayers = new ArrayList<>();
        Player player = null;
        for (int i = 1; i <= 10; i++) {
            FieldPosition pos;
            if (i <= 4) {
                pos = FieldPosition.Defense;
            } else if (i <= 8) {
                pos = FieldPosition.Midfield;
            } else {
                pos = FieldPosition.Striker;
            }
            player = new Player("Position: " + i, LocalDate.of(year(), month(), day()), pos);
            fieldPlayers.add(player);
        }
        Team team = new Team(player.getName(), player.getBirthday(), player.getPosition(), nation, goalkeeper, fieldPlayers);
        return team;
    }

}
