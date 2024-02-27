public class CarTester {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Corolla");
        car1.get();
        Car car2 = new Car();
        car2.get();
        car2.set("Honda", "Civic");
        car2.get();
    }
}