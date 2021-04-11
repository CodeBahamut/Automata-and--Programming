package week1;

import java.util.Scanner;

/**
 * Deze programma gaat door de states van een state machine door een twee diemensionale array.
 */
public class FSAexec {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Voor end state voer bbb
        System.out.println("Enter a combination of a and b to traverse the states of this machine: ");
        String input = scanner.nextLine();
        fsaExec(input);
    }

    /**
     * Through going through the letters in the input it will traverse the array and go through the states.
     * The only acceptState thats true is the end state so 3. It will also print the end state to the current input.
     *
     * @param input
     * @return acceptState and Current end state.
     */

    public static void fsaExec(String input) {
        boolean[] acceptState = {false, false, false, true};

        int[][] followUpAlphabetStates = {
                {0, 1}, // state [0]
                {0, 2}, // state [1]
                {0, 3}, // state [2]
                {3, 3}  // state [3]
        };

        int state = 0;

        for (int i = 0; i < input.length(); i++) {
                state = followUpAlphabetStates[state][input.charAt(i) - 'a'];
        }
        System.out.println("Is end state = " + acceptState[state]);
        System.out.println("The current end state = " + state);
    }

}
