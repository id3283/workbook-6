import musicians.Musician;

public class Pair<T> {
    T leftThing;
    T rightThing;

    public Pair(T leftThing, T rightThing) {
        this.leftThing = leftThing;
        this.rightThing = rightThing;
    }

    public void swap() {
        T tmp = leftThing;
        leftThing = rightThing;
        rightThing = tmp;
    }

    public T getLeftThing() {
        return leftThing;
    }

    public T getRightThing() {
        return rightThing;
    }

    @Override
    public String toString() {
        return "Left: " + leftThing + " Right: " + rightThing;
    }

}
