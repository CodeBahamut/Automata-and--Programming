package week5.Vormen;

public class Rechthoek extends Vorm{

    private double breedte;
    private double lengte;

    public Rechthoek(double breedte, double lengte) {
        this.breedte = breedte;
        this.lengte = lengte;
    }

    @Override
    public void berekenOppervlakte() {
        double oppervlakte = breedte * lengte;
        System.out.println("De oppervlakte van de rechthoek = " + oppervlakte);
    }
}
