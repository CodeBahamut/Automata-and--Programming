package week1;

public class RegExHvaMail {

    //Methode voor het checken als het een HvA emailadress is.
    public static boolean checkHvAEmailaddress (String emailadres) {

        boolean isHvaEmail = emailadres.matches("^[a-zA-Z]+[a-zA-z\\-\\.]+@hva.nl");

        return isHvaEmail;
    }

    //Het main voor het testen
    public static void main(String[] args) {

        //5 Die horen te kloppen
        System.out.println(checkHvAEmailaddress("abdelrahman.el-khenizy@hva.nl"));
        System.out.println(checkHvAEmailaddress("f.rietveld@hva.nl"));
        System.out.println(checkHvAEmailaddress("m.c.otten@hva.nl"));
        System.out.println(checkHvAEmailaddress("j.derriks@hva.nl"));
        System.out.println(checkHvAEmailaddress("j.vogelzang@hva.nl"));

        //5 Die horen niet te kloppen
        System.out.println(checkHvAEmailaddress("abdelrahman.el-khenizy@hva.com"));
        System.out.println(checkHvAEmailaddress("f.rietveld@gmail.nl"));
        System.out.println(checkHvAEmailaddress("m.c.0tten@hva.nl"));
        System.out.println(checkHvAEmailaddress("j}derriks@hva.nl"));
        System.out.println(checkHvAEmailaddress(".j.vogelzang@hva.nl"));
    }
}
