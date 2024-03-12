public class Main {
    public static void main(String[] args) {

        College c1 = new College("SOA", "BHUBANESWAR");
        College c2 = new College("NIT", "ROURKELA");

        Student s1 = new Student(1030, "Aman", c1);
        Student s2 = new Student(1042, "Utkarsh", c2);

        s1.displayStudentInfo();
        s2.displayStudentInfo();
    }
}