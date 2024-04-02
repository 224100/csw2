package Q2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        try{
            for(int i = 0; i<str.length()-1;i++){
                if(Character.isLetter(str.charAt(i)) && Character.isDigit(str.charAt(i+1))){
                    System.out.println(str.charAt(i+1));
                }
            }
        }
        catch(NullPointerException e){
            System.out.println("NullPointerException caught");
        }
    }
}
