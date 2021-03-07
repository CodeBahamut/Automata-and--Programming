package week1;

public class RegexTest {

    public static void main(String[] args) {
        String tekst = "Dit is een stukje tekst met een telefoonnummer, namelijk 0612345678, helemaal prima!";

        boolean zitTelefoonnummerIn = tekst.matches( "[0-9]");
        System.out.println(zitTelefoonnummerIn);
    }

}
