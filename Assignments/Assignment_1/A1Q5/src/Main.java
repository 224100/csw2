public class Main {
    public static void main(String[] args) {

        College college1 = new College("College 1", "Location 1");
        College college2 = new College("College 2", "Location 2");

        Student student1 = new Student(1, "Student 1", college1);
        Student student2 = new Student(2, "Student 2", college2);

        System.out.println(college1);
        System.out.println(college2);

        student1.displayStudentInfo();
        student2.displayStudentInfo();
    }
}