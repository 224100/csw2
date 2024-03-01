import java.util.ArrayList;
import java.util.List;

public class Enrollment implements EnrollmentSystem {
    private List<Student> students = new ArrayList<>();
    private List<Course> courses = new ArrayList<>();

    @Override
    public void enroll(Student student, Course course) {
        if (students.contains(student) && courses.contains(course)) {
            System.out.println("Student is already enrolled in the course.");
            return;
        }
        students.add(student);
        courses.add(course);
        System.out.println(student.getName() + " has been enrolled in " + course.getName());
    }

    @Override
    public void drop(Student student, Course course) {
        int index = students.indexOf(student);
        if (index != -1 && courses.get(index).equals(course)) {
            students.remove(index);
            courses.remove(index);
            System.out.println(student.getName() + " has been dropped from " + course.getName());
        } else {
            System.out.println("Student is not enrolled in the course.");
        }
    }

    @Override
    public String getEnrollmentDetails() {
        StringBuilder details = new StringBuilder();
        for (int i = 0; i < students.size(); i++) {
            details.append(students.get(i).getName()).append(" is enrolled in ").append(courses.get(i).getName()).append("\n");
        }
        return details.toString();
    }
}