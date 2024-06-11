import java.util.ArrayList;
interface intformat{
    int run(int n);
}
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(10);
        a.add(20);
        a.add(55);
        a.add(45);
        a.forEach((n) -> System.out.println(n));
        intformat t = (b) -> b + 100;
        System.out.println(t.run(a.get(0)));
    }
    void printFormat(int a , intformat t){
        int x = t.run(a);
        System.out.println(x);
    }
}
//  1 3 4 5 6