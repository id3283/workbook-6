package musicians;

public class MusicianPair<T extends Musician> {
    T leftThing;
    T rightThing;

    public MusicianPair(T leftThing, T rightThing) {
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

    public void perform() {
        System.out.println(leftThing.getName() + ": La la la!  ");
        leftThing.perform();
        System.out.println(rightThing.getName() + ": La la la!  ");
        rightThing.perform();
    }

    public T getRightThing() {
        return rightThing;
    }

    @Override
    public String toString() {
        return "Left: " + leftThing + " Right: " + rightThing;
    }

}
