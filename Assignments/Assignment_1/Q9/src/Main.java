public class Main {
    public static void main(String[] args) {
        EnrollmentSystem enrollmentSystem = new Enrollment();

        Student student1 = new Student("John");
        Student student2 = new Student("Jane");

        Course course1 = new Course("Math");
        Course course2 = new Course("English");

        enrollmentSystem.enroll(student1, course1);
        enrollmentSystem.enroll(student2, course2);

        System.out.println(enrollmentSystem.getEnrollmentDetails());

        enrollmentSystem.drop(student1, course1);

        System.out.println(enrollmentSystem.getEnrollmentDetails());
    }
}