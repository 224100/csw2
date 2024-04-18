import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an interger to search in the TreeSet:");
        int a = sc.nextInt();
        TreeSet<Integer> t =new TreeSet<>();
        t.add(10);
        t.add(15);
        t.add(1);
        System.out.println(t);
        System.out.println(t.contains(a));
        t.remove(10);
        System.out.println(t);
    }
}