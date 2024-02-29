public class Car implements Vehicle{
    @Override
    public void accelerate() {
        System.out.println("Dont go over 120kmph");
    }

    @Override
    public void brake() {
        System.out.println("yes working");
    }
}
