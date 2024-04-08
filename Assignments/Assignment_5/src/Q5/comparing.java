package Q5;

public class comparing {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Hello");
        long st=System.currentTimeMillis();
        for(int i = 0;i< 10000000;i++)
            s.append("A");
        long et = System.currentTimeMillis();
        System.out.println("StringBuilder");
        System.out.println(et-st);
        StringBuffer s2 = new StringBuffer("Hello");
         st=System.currentTimeMillis();
        for(int i = 0;i< 10000000;i++)
            s2.append("A");
        et = System.currentTimeMillis();
        System.out.println("String buffer");
        System.out.println(et-st);
        System.gc();
    }
}
