import java.util.LinkedList;
import java.util.Scanner;

public class StudentList {
    LinkedList<Student> students;

    public StudentList() {
        students = new LinkedList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayList() {
        for (Student student : students) {
            System.out.println(student);
        }
    }
    public void checkExistence() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student name:");
        String name = scanner.nextLine();
        System.out.println("Enter student age:");
        int age = scanner.nextInt();
        System.out.println("Enter student mark:");
        int mark = scanner.nextInt();
        Student student = new Student(name, age, mark);
        if (students.contains(student)) {
            System.out.println("Student exists in the list.");
        } else {
            System.out.println("Student does not exist in the list.");
        }
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void countStudents() {
        System.out.println("Number of students in the list: " + students.size());
    }
}