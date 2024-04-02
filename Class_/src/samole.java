import java.util.*;

public class samole {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(10);
        l1.add(20);
        l1.add(9);
        System.out.println(l1);
        l1.addFirst(100);
        System.out.println(l1);
        l1.addLast(200);
        System.out.println(l1);


        Iterator<Integer> i = l1.iterator();
        while(i.hasNext()){
            int a = i.next()+20;
            System.out.println(a);
            int k=0;
            l1.set(k,a);
            k+=1;
        }
        System.out.println(l1);

    }
}
