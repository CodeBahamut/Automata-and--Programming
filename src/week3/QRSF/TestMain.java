package week3.QRSF;

public class TestMain {
    public static void main(String[] args) {

        String input = "babbabbbaabbbb";

        Automaat automaat = new Automaat();

        for (int i = 0; i < input.length(); i++) {
            automaat.applyInput(input.charAt(i));
            System.out.println(automaat.toString());
        }
        System.out.println("End state is: " + automaat.toString());
    }
}
