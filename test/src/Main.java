

public class Main {
    static void f1(){
        String s ="Hello";
        System.gc();
    }
    public static void main(String[] args) {
       f1();
       Runtime r = Runtime.getRuntime();
       String s =null;

       System.gc();
        System.out.println(r.totalMemory());
        System.out.println(r.freeMemory());
        Sample s1 =new Sample("1");
        //Anoynomus
        new Sample("Hello");
        System.gc();
        //Re-Reference
        Sample s2 =s1;
        System.gc();
        System.out.println(s2);
        // null objects
        Sample s3 =null;
        System.gc();


    }
}
class Sample{
    String s;
    public Sample(String s)
    {
        this.s =s;
    }

}
