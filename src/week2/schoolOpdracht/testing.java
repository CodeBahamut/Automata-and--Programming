package week2.schoolOpdracht;

import java.util.ArrayList;

public class testing {
    public static void main(String[] args) {

    School hva = new School("HvA");
    School uva = new School("UvA");

    Kat grumpy = new Kat("Grumpy");
    Student thomas = new Student("Thomas", grumpy);

    Kat moe = new Kat("Moe");
    Student anouar = new Student("Anouar", moe);

    Student michal = new Student("Michal");

    Student eve = new Student("Eve");

    Kat leo = new Kat("Leo");
    Student abdelrahman = new Student("Abdelrahman", leo);

    hva.studenten.add(michal);
    hva.studenten.add(anouar);
    hva.studenten.add(eve);
    hva.studenten.add(eve);
    uva.studenten.add(thomas);

    ArrayList<Student> studenten = hva.getStudenten();

        for (Student student:studenten) {
            System.out.println(student.getNaam());
        }

    ArrayList<Student> studenten2 = uva.getStudenten();

        for (Student student:studenten2) {
        System.out.println(student.getNaam());
    }
}
}
