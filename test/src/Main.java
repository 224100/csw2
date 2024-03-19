import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> a =new ArrayList<>();
        a.add("hello");
        a.add("abc");
        a.add(1,"hello");
        System.out.println(a);
        a.removeLast();
        System.out.println(a);
    }
}
