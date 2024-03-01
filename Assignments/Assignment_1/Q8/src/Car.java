public class Car implements Vehicle {

    @Override
    public void accelerate() {
        System.out.println("The car is accelerating...");
    }

    public void accelerate(int speed) {
        System.out.println("The car is accelerating at " + speed + " mph...");
    }

    public void accelerate(int speed, int duration) {
        System.out.println("The car is accelerating at " + speed + " mph for " + duration + " seconds...");
    }

    @Override
    public void brake() {
        System.out.println("The car is braking...");
    }
}