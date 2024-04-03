package Q3;

public class main {
    public static void main(String[] args) {
        String s =null;
        try{
            System.out.println(s.length());
        }
        catch(CustomNullPointerException e){
            e =new CustomNullPointerException("Ohhhhh noooo!");
        }

    }
}
class CustomNullPointerException extends NullPointerException{
    CustomNullPointerException(String s){
        super(s);
    }
}
