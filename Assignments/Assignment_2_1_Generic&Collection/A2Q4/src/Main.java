import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] s = new Student[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter student's name, roll number, and total marks:");
            s[i] = new Student(sc.nextLine(), sc.nextInt(), sc.nextDouble());
            sc.nextLine();
        }

        System.out.println("Enter the student to be searched (name, roll number, total marks):");
        Student ss = new Student(sc.nextLine(), sc.nextInt(), sc.nextDouble());

        for (int i =0;i<5;i++) {
            if (ss.compareTo(s[i]) == 1) {
                System.out.println("Student found:");
                break;
            }
        }
    }
}