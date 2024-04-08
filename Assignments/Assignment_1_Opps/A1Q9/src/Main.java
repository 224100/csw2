import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Enrollment e = new Enrollment();

        int a = 1;
        while (a != 0) {
            System.out.println("Enter Students name: ");
            String s = sc.next();
            System.out.println("Enter students regdno : ");
            int r = sc.nextInt();
            System.out.println("Enter 1 for cse \n 2 for eee \n 3 for ece \n 4 for bba \n 5 for ME");
            a = sc.nextInt();
            e.enroll(a, s, r);

            System.out.println("Enter 0  to quit! else 1 to continue");
            a = sc.nextInt();
        }
        e.display();
    }
    }
