public class Car {
    String make;
    String model;
    public Car(String make, String model){
        this.make=make;
        this.model=model;
    }
    public Car(){

    }
    void set(String make, String model){
        this.make=make;
        this.model=model;
    }
    void get(){
        System.out.println("Make: "+make);
        System.out.println("Model: "+model);
    }

}
