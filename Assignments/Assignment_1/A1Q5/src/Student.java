public class Student {
    private int sId;
    private String sName;
    private College college;

    public Student(int s, String sn, College c) {
        sId = s;
        sName = sn;
        college = c;
    }

    public void displayStudentInfo() {
        System.out.println("Student ID: " + sId);
        System.out.println("Student Name: " + sName);
        System.out.println("College Information: " + college);
        System.out.println();
    }
}