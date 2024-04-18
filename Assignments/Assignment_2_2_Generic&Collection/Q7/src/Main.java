import java.util.Iterator;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<String , Address> a = new TreeMap<>();
        a.put("A", new Address("1", "a", "p"));
        a.put("B", new Address("2", "b", "q"));
        a.put("C", new Address("3", "c", "r"));

        Iterator<String> i = a.keySet().iterator();
        while(i.hasNext()){
            String key = i.next();
            System.out.println(key + " : " + a.get(key));
        }
    }
}