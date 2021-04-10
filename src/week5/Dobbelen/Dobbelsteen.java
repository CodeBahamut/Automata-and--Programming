package week5.Dobbelen;

public class Dobbelsteen {

private static final int MAXIMUM_DUBBELSTEEN = 6;
private static final int MINIMUM_DUBBELSTEEN = 1;


private static Dobbelsteen instance;

private Dobbelsteen () {}

public static Dobbelsteen getInstance() {
    if (Dobbelsteen.instance == null) {
        Dobbelsteen.instance = new Dobbelsteen();
    }
    return Dobbelsteen.instance;
}

public int gooi(){
    int randomNumber = ((int) (Math.random() * MAXIMUM_DUBBELSTEEN) + MINIMUM_DUBBELSTEEN);
    return randomNumber;
}
}
