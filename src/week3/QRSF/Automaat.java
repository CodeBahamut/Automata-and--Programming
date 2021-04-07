package week3.QRSF;

public class Automaat {

    private State currentState;

    public Automaat() {
        currentState = new Q();
    }

    public void applyInput(char input) {
        if(input == 'a')
            A();
        else
            B();

    }

    public void A(){
        this.currentState = currentState.a();
    }

    public void B(){
        this.currentState = currentState.b();
    }

    @Override
    public String toString() {
        return currentState.toString();
    }
}

