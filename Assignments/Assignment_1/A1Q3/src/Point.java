public class Point {
    private int X;
    private int Y;

    // Parameterized constructor
    public Point(int X, int Y) {
        this.X = X;
        this.Y = Y;
    }

    // Copy constructor
    public Point(Point p) {
        this.X = p.X;
        this.Y = p.Y;
    }

    // Getter methods
    public int getX() {
        return this.X;
    }

    public int getY() {
        return this.Y;
    }

    // Setter methods
    public void setX(int X) {
        this.X = X;
    }

    public void setY(int Y) {
        this.Y = Y;
    }
}