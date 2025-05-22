import java.awt.*;

public class Turtle implements IMovable {
    private String name;
    private Point currentLocation;
    public Turtle(String name) {
        this.name = name;
        this.currentLocation = new Point(25, 25);
//        this.power = 100;
    }
    // getters and setters not shown
    public Point move(int xUnits, int yUnits) {
// the turtle moves the number of units specified in
// the direction specified
        double newX = currentLocation.getX()+ xUnits;
        double newY = currentLocation.getY() + yUnits;
        currentLocation.setLocation(newX, newY);
        return currentLocation;
    }
    public void goHome() {
        this.currentLocation = new Point(25, 25);
    }
}