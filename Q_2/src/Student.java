import java.util.Scanner;
public class Student {

        private String name;
        private String rollno;
        private String branch;
        Scanner sc =new Scanner(System.in);
        void setValues(){

            System.out.println("Enter the Name, rollno and Branch");
            name = sc.next();
            rollno=sc.next();
            branch=sc.next();
        }
        String getName(){
            return name;

        }
    String getRollno(){
        return rollno;

    }
    String getBranch(){
        return branch;

    }
        void display() {
            System.out.println("Name : " + getName());
            System.out.println("rollno : " + getRollno());
            System.out.println("Branch : " + getBranch());

        }
    }


