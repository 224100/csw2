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
        System.out.println("Sorting the students based on rollno...");

        for (int i =4;i>=0;i--) {
            for(int j =0;j<=i;j++){
                if(students[j].compareTo(students[j+1])>0){
                    Student temp = students[j];
                    students[j] = students[j+1];
                    students[j+1] = temp;
                }
            }
        }
        System.out.println("The sorted list of students based on rollno is:");
        for (int i = 0; i < 5; i++) {
            System.out.println(students[i]);
        }
        sc.close();
    }
}