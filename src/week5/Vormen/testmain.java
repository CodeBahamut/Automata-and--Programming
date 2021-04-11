package week5.Vormen;

public class testmain {
    public static void main(String[] args) {
        Vorm cirkel = new Cirkel(3.5);
        Vorm vierkant = new Vierkant(5);
        Vorm zeshoek = new Zeshoek(4);
        Vorm driehoek = new Driehoek(3, 3);
        Vorm rechthoek = new Rechthoek(4,5);

        cirkel.berekenOppervlakte();
        vierkant.berekenOppervlakte();
        zeshoek.berekenOppervlakte();
        driehoek.berekenOppervlakte();
        rechthoek.berekenOppervlakte();
    }
}
