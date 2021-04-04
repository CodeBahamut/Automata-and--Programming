package week2.schoolOpdracht;

import week2.schoolOpdracht.School;

import java.util.ArrayList;

public class Student {

    private String naam;
    private Kat kat;

    public Student(String naam) {
        this.naam = naam;
    }

    public Student(String naam, Kat kat) {
        this.naam = naam;
        this.kat = kat;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setKat(Kat kat) {
        this.kat = kat;
    }

    public String getNaam() {
        return naam;
    }
}