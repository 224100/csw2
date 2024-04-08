import java.util.ArrayList;

public class CarApp {
    public static void main(String[] args) {
        ArrayList<Car> c =new ArrayList<>();
        c.add(new Car(2015,"bmw",55));
        c.add(new Car(2020,"mg",13));
        c.add(new Car(2017,"audi",45));
        c.add(new Car(2013,"creta",10));
        c.add(new Car(2018,"kia",20));
        for (Car user : c) {
            System.out.println(user);
        }
        c.getFirst().sortbystock(c);
        System.out.println("After sorting!!");
        for (Car user : c) {
            System.out.println(user);
        }

    }
}