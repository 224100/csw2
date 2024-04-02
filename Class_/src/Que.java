import java.util.ArrayList;
import java.util.*;
import java.util.Queue;

public class Que {
    public static void main(String[] args) {
        int[] i = {0,1,2,3};
        ArrayList<Integer> a = new ArrayList<>();

        Deque<Integer> de = new ArrayDeque<>();
        Queue<Integer> qu = new ArrayDeque<>();
        Stack<Integer> s = new Stack<>();
        de.add(12);
        de.add(10);
        qu.add(13);
        qu.add(15);
        s.push(10);
        s.push(15);
        System.out.println(de);
        System.out.println(qu);
        System.out.println(s);
        System.out.println(de.peek());
        System.out.println(qu.peek());
        System.out.println(s.peek());
        de.remove();
        qu.remove();
        s.pop();
        System.out.println(de);
        System.out.println(qu);
        System.out.println(s);

    }
}
