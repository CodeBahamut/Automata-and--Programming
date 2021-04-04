package week2.schoolOpdracht;

import java.util.ArrayList;

public class School {

    private String naam;

    protected ArrayList<Student> studenten = new ArrayList<>();

    public School(String naam) {
        this.naam = naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }

    public ArrayList<Student> getStudenten() {
        return studenten;
    }

    public void setStudenten(ArrayList<Student> studenten) {
        this.studenten = studenten;
    }
}
