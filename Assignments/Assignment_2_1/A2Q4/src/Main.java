import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Student[] s =new Student[5];
        for(int i =0 ;i<5;i++){
            System.out.println("Enter Students name rollno and total marks");
            s[i]=new Student(sc.nextLine(),sc.nextInt(),sc.nextDouble());

        }
        System.out.println("Enter the student to be searched :");
        Student s1 =new Student(sc.nextLine(),sc.nextInt(),sc.nextDouble());
        for(int i =0;i<5;i++){
            if(s1.compareTo)
        }
    }
}