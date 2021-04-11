package week5.Vormen;

public class Cirkel extends Vorm {

    private double straal;

    public Cirkel(double straal) {
        this.straal = straal;
    }

    @Override
    public void berekenOppervlakte() {
        double oppervlakte = Math.PI * straal * straal;
        System.out.println("De oppervlakte van de Cirkel = " + oppervlakte);
    }
}
