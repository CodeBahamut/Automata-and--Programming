package week5.Vormen;

public class Vierkant extends Vorm{

    private double zijde;

    public Vierkant(double zijde) {
        this.zijde = zijde;
    }

    @Override
    public void berekenOppervlakte() {
        double oppervlakte = zijde * zijde;
        System.out.println("De oppervlakte van de vierkant = " + oppervlakte);
    }
}
