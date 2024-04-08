public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.accelerate();
        car.accelerate(60);
        car.accelerate(60, 5);
        car.brake();

        Bicycle bicycle = new Bicycle();
        bicycle.accelerate();
        bicycle.accelerate(15);
        bicycle.accelerate(15, 10);
        bicycle.brake();
    }
}