package week5.Vormen;

public class Zeshoek extends Vorm {

    private double zijdeLengte;

    public Zeshoek(double zijdeLengte) {
        this.zijdeLengte = zijdeLengte;
    }

    @Override
    public void berekenOppervlakte() {
        double oppervlakte = ((3 * Math.sqrt(3)) / 2) * zijdeLengte * zijdeLengte;
        System.out.println("De oppervlakte van de zeshoek = " + oppervlakte);
    }
}
