import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {
        String s ="Hello how are u hello";
        String[] words = s.toLowerCase().split(" ");
        int freq = 0;
        String maxword="";
        Hashtable<String , Integer> h = new Hashtable<>();
        for(String w : words){
            w=w.toLowerCase();
            if(h.contains(w)){
                h.put(w,h.get(w)+1);

            }
            else{
                h.put(w,1);

            }
            if(h.get(w)>freq){
                freq = h.get(w);
                maxword = w;
            }
        }
        System.out.println("Most repeated word is "+maxword+" with frequency "+freq);

    }
}