package Oefentoetsen;
import java.util.Scanner;

/**
 * doel: simuleer abc automaat met 2D array ipv state design pattern
 *
 * @author AenPprof
 */
public class AbcMachine {
    /**
     * the current state of the machine
     */
    private int currentState;
    /**
     * a copy of the input this machine has been working on
     */
    private String input;

    /**
     * toString method as generated by IntelliJ
     * @return string representation of the current input and state
     */

    @Override
    public String toString() {
        return "AbcMachine{" +
                "currentState=" + currentState +
                ", input='" + input + '\'' +
                '}';
    }

    /**
     * The heart of the machine: implements the FSA
     *
     * @param input - the string to process
     */
    public int processString(String input) {

        String newInput = input.toLowerCase();
        currentState = 0;
        int[][] transitions = {
                {0, 1, 1},
                {0, 1, 0}
        };

        int i = 0;
        try {
            for (i = 0; i < newInput.length(); i++) {
                currentState = transitions[currentState][newInput.charAt(i) - 'a'];
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            currentState = -1;
            newInput += " Illegal character " + newInput.charAt(i) + ". Error: " + e.getMessage();
        }
        this.input = newInput; // keep a copy of the input
        return currentState;
    }

    public static void main(String[] args) {
        System.out.println("Geef een string voor de automaat:");
        Scanner in = new Scanner(System.in);
        String testWoord = in.nextLine();
        System.out.println("Machine verwerkt " + testWoord);
        AbcMachine m = new AbcMachine();
        m.processString(testWoord);
        System.out.println(m);
        //m.processString(testWoord);
    }
}