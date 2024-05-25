import java.util.ArrayList;

public class Car implements Comparable<Car>{
    private int ModalNo;
    private String name;
    private int stock;
    @Override
    public int compareTo(Car c) {
        if(this.stock>c.stock)
            return 1;
        else return 0;
    }
    public void sortbystock(ArrayList<Car> c) {
        for (int i = c.size() - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (c.get(j).compareTo(c.get(j + 1)) == 1) {
                    Car temp = c.get(j);
                    c.set(j, c.get(j + 1));
                    c.set(j + 1, temp);
                }
            }
        }
    }
    public Car(int modalNo, String name, int stock) {
        ModalNo = modalNo;
        this.name = name;
        this.stock = stock;
    }
    @Override
    public String toString() {
        return ModalNo +" "+ name +" "+stock;
    }
}
