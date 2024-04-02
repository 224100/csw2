import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> h =new HashSet<>();
        h.add(55);
        h.add(1);
        h.add(26);
        h.remove(1);
        System.out.println(h);
    }
}