package week3.QRSF;

class R implements State {
    @Override
    public State a() {
        return new Q();
    }
    @Override
    public State b() {
        return new S();
    }

    @Override
    public String toString() {
        return "R";
    }
}
