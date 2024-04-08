public class Car implements Comparable<Car>{
    String model;
    String color;
    double speed;

    public Car(String model, String color, double speed) {
        this.model = model;
        this.color = color;
        this.speed = speed;
    }
    @Override
    public String toString(){
        return "Model: "+model+"\nColor: "+color+"\nSpeed: "+speed;
    }
    @Override
    public int compareTo(Car o) {
        Car c =(Car)o;
        if(this.speed==c.speed){
            System.out.println("Both have the same speed:");
            return 0;
        }
        else if (this.speed > c.speed) {
            System.out.println(this);
            return 1;
        }
        else {
            System.out.println(c);
            return 0;
        }

    }
}
