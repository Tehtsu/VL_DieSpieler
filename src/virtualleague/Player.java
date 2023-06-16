package virtualleague;

import java.time.LocalDate;
import java.time.Period;

public class Player {

    enum FieldPosition {
        Goalkeeper,
        Defense,
        Midfield,
        Striker
    }

    // Variables
    private String name;
    private LocalDate birthday;
    FieldPosition position;

    // constructor
    public Player(String name, LocalDate birthday, FieldPosition position) {
        this.name = name;
        this.birthday = birthday;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        }
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        if (birthday != null && !birthday.toString().isEmpty()) {
            this.birthday = birthday;

        }
    }

    public FieldPosition getPosition() {
        return position;
    }

    public void setPosition(FieldPosition position) {
        if (position != null && !position.toString().isEmpty()) {
            this.position = position;
        }
    }
    
    public int getAge(){
        // get the actual date
        LocalDate currDate = LocalDate.now();
        // calculate
        Period period = Period.between(birthday, currDate);
        return period.getYears();
    }

}
