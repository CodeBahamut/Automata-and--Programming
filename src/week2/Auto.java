package week2;

//Author Abdelrahman El-Khenizy
//Auto klaase met zelf bedacht attributen en methodes die nodig zijn voor een auto.

public class Auto {
    private String merk;
    private String kenteken;
    private String model;
    private int bouwJaar;

    Auto(String newMerk, String newKenteken, String newModel, int newBouwjaar){
        this.merk = newMerk;
        this.kenteken = newKenteken;
        this.model = newModel;
        this.bouwJaar = newBouwjaar;
    }

    public void rijden() {}

    public void remmmen() {}

    public void handrem() {}

    public void tanken() {}

    public void achteruit() {}


    public String getMerk() {
        return merk;
    }

    public String getKenteken() {
        return kenteken;
    }

    public String getModel() {
        return model;
    }

    public int getBouwJaar() {
        return bouwJaar;
    }

    public void setBouwJaar(int bouwJaar) {
        this.bouwJaar = bouwJaar;
    }

    public void setKenteken(String kenteken) {
        this.kenteken = kenteken;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
