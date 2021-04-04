package week2.klasseExtendsKlasse;

public class Gun {

    private String sound = "Pew BANG!";

    public Gun(String sound) {
        this.sound = sound;
    }

    public Gun() {

    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}
