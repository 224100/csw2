import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        boolean flag = true;
        while(flag){
            System.out.println("Enter two numbers:");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Enter the operation you want to perform:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    printFormat(a, b, Calculator.ad);
                    break;
                case 2:
                    printFormat(a, b, Calculator.sub);
                    break;
                case 3:
                    printFormat(a, b, Calculator.mul);
                    break;
                case 4:
                    printFormat(a, b, Calculator.div);
                    break;
                case 5:
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }

    }
    static void printFormat(int a,int b,Calculator c){
        System.out.println(c.calculate(a, b));
    }
}
interface Calculator{
    double calculate(int x, int y);
    static Calculator ad =(x, y) -> x + y;
    static Calculator sub = (x,y) -> x-y;
    static Calculator mul = (x,y) -> x * y;
    static Calculator div = (x,y) -> x / y;
}