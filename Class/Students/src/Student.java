import java.util.Scanner;
public class Student implements Comparable<Student> {

        private String name;
        private int rollno;

        Scanner sc =new Scanner(System.in);
        public Student(String name, int rollno){
            this.name=name;
            this.rollno=rollno;

        }
        int getroll(){
            return rollno;
    }
        @Override
        public String toString() {
            System.out.println("Name : " + name);
            System.out.println("rollno : " + rollno);

            return"";

        }

    @Override
    public int compareTo(Student o) {
            Student s = (Student)o;
            if(this.rollno==s.rollno)
                return 0;
            else if (this.rollno >s.rollno) {
                return 1;
            }
            else
                return -1;
    }
}


