package Q1;

public class NPE {
    public static void main(String[] args) {
        try{

            String str = null;
            System.out.println(str.length());

        }
        catch (NullPointerException e){
            System.out.println("NullPointerException caught");
        }    }
}
