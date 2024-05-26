public class  Main {
    public static void main(String[] args) {
        StudentList studentList = new StudentList();
        studentList.addStudent(new Student("satyam", 20, 85));
        studentList.addStudent(new Student("sameer", 22, 90));
        studentList.addStudent(new Student("subha", 21, 88));

        System.out.println("Displaying the list:");
        studentList.displayList();

        System.out.println("Checking existence of a student:");
        studentList.checkExistence();

        System.out.println("Removing a student:");
        studentList.removeStudent(new Student("satyam", 20, 85));

        System.out.println("Counting students:");
        studentList.countStudents();
    }
}