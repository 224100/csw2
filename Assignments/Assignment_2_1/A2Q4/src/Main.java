import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter student's name, roll number, and total marks:");
            students[i] = new Student(sc.nextLine(), sc.nextInt(), sc.nextDouble());
            sc.nextLine();
        }

        System.out.println("Enter the student to be searched (name, roll number, total marks):");
        Student searchStudent = new Student(sc.nextLine(), sc.nextInt(), sc.nextDouble());

        for (Student student : students) {
            if (searchStudent.compareTo(student) == 0) {
                System.out.println("Student found:");
                System.out.println(student);
                break;
            }
        }
    }
}