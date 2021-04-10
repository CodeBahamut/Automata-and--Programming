package week5.Dobbelen;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws IOException {

        Dobbelsteen dobbelsteen = Dobbelsteen.getInstance();

        File file = new File("pastRolls.txt");
        PrintWriter output = new PrintWriter(file);
        Scanner scanner = new Scanner(file);
        // For loop voor het schrijven
        for (int i = 0; i < 100; i++) {
            int nummer = dobbelsteen.gooi();
            output.println(nummer);
        }
        output.close();
        int[] saved = new int[100];
        //while loop voor het lezen
        for (int i = 0; i < 100; i++) {
            int nummer = scanner.nextInt();
            scanner.nextLine();
            saved[i] = nummer;
        }
        hoeveelGetallen(saved);
    }
    // Kijkt hoeveel getallen per getal er zijn en print een lijst.
    public static void hoeveelGetallen(int[] num) {

        int getal1 = 0;
        int getal2 = 0;
        int getal3 = 0;
        int getal4 = 0;
        int getal5 = 0;
        int getal6 = 0;

        for (int i = 0; i < num.length; i++) {

            switch (num[i]) {
                case 1:
                    getal1++;
                    break;
                case 2:
                    getal2++;
                    break;
                case 3:
                    getal3++;
                    break;
                case 4:
                    getal4++;
                    break;
                case 5:
                    getal5++;
                    break;
                case 6:
                    getal6++;
                    break;
            }
        }
        System.out.println("Getal 1: " + getal1);
        System.out.println("Getal 2: " + getal2);
        System.out.println("Getal 3: " + getal3);
        System.out.println("Getal 4: " + getal4);
        System.out.println("Getal 5: " + getal5);
        System.out.println("Getal 6: " + getal6);
    }
}
