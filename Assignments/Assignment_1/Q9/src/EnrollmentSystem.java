public interface EnrollmentSystem {
    void enroll(Student student, Course course);
    void drop(Student student, Course course);
    String getEnrollmentDetails();
}