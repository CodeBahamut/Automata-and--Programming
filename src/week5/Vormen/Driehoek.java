package week5.Vormen;

public class Driehoek extends Vorm{

    private static double half = 0.5;
    private double lengte;
    private double hoogte;

    public Driehoek(double lengte, double hoogte) {
        this.lengte = lengte;
        this.hoogte = hoogte;
    }

    @Override
    public void berekenOppervlakte() {
        double oppervlakte = lengte * hoogte * half;
        System.out.println("De oppervlakte van de driehoek = " + oppervlakte);
    }
}
