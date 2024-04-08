import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        int[] i ={1,2,4,1,5,2};
        HashSet<Integer> h = new HashSet<>();
        ArrayList<Integer> dup = new ArrayList<>();
        for(int a : i){
            if(!h.contains(a))
                h.add(a);
            else if(!dup.contains(a))
                dup.add(a);
        }
        System.out.println(dup);
    }
}
