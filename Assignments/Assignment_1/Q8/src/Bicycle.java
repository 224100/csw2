public class Bicycle implements Vehicle {


    @Override
    public void accelerate() {
        System.out.println("hmmmm fast...");
    }

    @Override
    public void brake() {
        System.out.println("Brakes are in good condition");
    }
}
