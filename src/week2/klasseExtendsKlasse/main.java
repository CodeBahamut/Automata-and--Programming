package week2.klasseExtendsKlasse;

public class main {
    public static void main(String[] args) {

        shoot(new Ak("BANG!"));
        shoot(new M4("PEW!"));
    }

    public static void shoot(Gun gun){

        System.out.println(gun.getSound());

    }



}
