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
        System.out.println("Sorting the students based on rollno...");
        s[0].sort(s);

        System.out.println("The sorted list of students based on rollno is:");
        for (int i = 0; i < 5; i++) {
            System.out.println(s[i]);
        }
        sc.close();
    }
}