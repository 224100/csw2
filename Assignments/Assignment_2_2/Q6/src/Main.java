import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> t =new TreeSet<>();
        t.add(10);
        t.add(15);
        t.add(1);
        System.out.println(t);
        System.out.println(t.contains(10));
        t.remove(10);
        System.out.println(t);
    }
}