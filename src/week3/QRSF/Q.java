package week3.QRSF;

class Q implements State {
    @Override
    public State a() {
        return this;
    }
    @Override
    public State b() {
        return new R();
    }

    @Override
    public String toString() {
        return "Q";
    }
}
