package week1;

/**
 * TODO: fix it and learn to use JAVADOC and use it!
 */
public class FSAexec {

    public static void main(String[] args) {
        // TODO: ask for input and create better output
        fsaExec("ababaaabac");

    }

    /**
     * TODO: Analyse the code and make it so it returns something useful. Fix the javadoc
     *
     * @param input
     */

    public static void fsaExec(String input) {
        boolean[] acceptState = {false, false, false, true};

        int[][] followUpAlphabetStates = {
                {0, 1}, // state [0] (followUpAlphabetStates[[0]['a'] = 0 en [0]['b']=1 enz
                {0, 2}, // state [1]
                {0, 3}, // state [2]
                {3, 3}  // state [3]
        };
        int state = 0;


        for (int i = 0; i < input.length(); i++) {
            try{
                state = followUpAlphabetStates[state][input.charAt(i) - 'a'];
            } catch(Exception e){
            }
        }


        System.out.println(acceptState[state]);
    }

}
