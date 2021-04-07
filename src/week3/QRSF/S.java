package week3.QRSF;

class S implements State {
    @Override
    public State a() {
        return new Q();
    }
    @Override
    public State b() {
        return new F();
    }

    @Override
    public String toString() {
        return "S";
    }
}
