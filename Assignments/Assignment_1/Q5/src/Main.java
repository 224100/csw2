public class Main {
    public static void main(String[] args) {
        // Instantiate two College objects
        College college1 = new College("College 1", "Location 1");
        College college2 = new College("College 2", "Location 2");

        // Instantiate two Student objects and enroll them in the colleges
        Student student1 = new Student(1, "Student 1", college1);
        Student student2 = new Student(2, "Student 2", college2);

        // Display the information of all colleges
        System.out.println(college1);
        System.out.println(college2);

        // Display the information of all students
        student1.displayStudentInfo();
        student2.displayStudentInfo();
    }
}