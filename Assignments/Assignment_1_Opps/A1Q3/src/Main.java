public class Main {
    public static void main(String[] args) {

        Point p1 = new Point(5, 10);
        System.out.println("Point p1: (" + p1.getX() + ", " + p1.getY() + ")");

        Point p2 = new Point(p1);
        System.out.println("Point p2: (" + p2.getX() + ", " + p2.getY() + ")");
        p2.setX(25);
        p2.setY(30);

        System.out.println("Point p2: (" + p2.getX() + ", " + p2.getY() + ")");
        System.out.println("Point p1: (" + p1.getX() + ", " + p1.getY() + ")");
    }
}