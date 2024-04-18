import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int[] a = {5,7,9,8,3,2,1,10,1,6};
        HashMap<Integer , Integer> t = new HashMap<>();
        for(int i :a){
            t.put(i,1);
        }
        for(int i=1;i<=10;i++){
            if(!t.containsKey(i)){
                System.out.println("missing no is "+i);
                break;
            }
        }
    }
}