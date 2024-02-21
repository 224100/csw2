import java.util.Scanner;

public class Bank_app {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Bank a1 = new Bank();
        a1.setValues();
        Bank a2 =new Bank(123,"aman",222);
        a2.display();
        int a;
        do{
        System.out.println("Enter 1 for Withdraw :");
        System.out.println("Enter 2 for Deposit :");
        System.out.println("Enter 3 for Display");
            System.out.println("Enter 0 to exit!");
        a =sc.nextInt();
        switch(a){
            case 0:
                break;
            case 1:
                a1.withdraw();
                break;
            case 2:
                a1.deposit();
                break;
            case 3:
                a1.display();
                break;
            default:
                System.out.println("Wrong input !!");
        }
    }while(a!=0);
        System.out.println(a1);
    }
}

//write a program to input name roll no branch of a student and display them using get and set methods.