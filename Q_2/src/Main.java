import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the strength");
        sec s= new sec(sc.nextInt());
        int a;
        do{
            System.out.println("Enter 1 to add a student");
            System.out.println("Enter 2 to delete a student");
            System.out.println("Enter 3 to display the list of student");
            System.out.println("Enter 0 to exit !!");
            a =sc.nextInt();
            switch(a){
                case 1:
                    System.out.println("Enter student name and rollno :");
                    s.add(sc.next(),sc.nextInt());
                    break;
                case 2:
                    s.delete();
                    break;
                case 3:
                    s.display();
                    break;
                default:
                    System.out.println("Wrong input !!");
            }
        }while(a!=0);

    }
}