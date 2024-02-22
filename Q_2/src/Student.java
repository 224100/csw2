import java.util.Scanner;
public class Student {

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
    }


