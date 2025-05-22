public class IntegerPair {
    int leftThing;
    int rightThing;

    public IntegerPair(int leftThing, int rightThing) {
        this.leftThing = leftThing;
        this.rightThing = rightThing;
    }

    public int getLeftThing() {
        return leftThing;
    }

    public int getRightThing() {
        return rightThing;
    }

    @Override
    public String toString() {
        return "Left: " + leftThing + " Right: " + rightThing;
    }

    public void swap() {
        int tmp = this.leftThing;
        this.leftThing = this.rightThing;
        this.rightThing = tmp;
    }
}
