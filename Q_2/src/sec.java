import java.util.Scanner;

public class sec {
    Scanner sc = new Scanner(System.in);
    int a =0;
    Student[] s = new Student[5];

    public sec() {
        
    }
    void add(String name,String rollno,String branch){
        s[a]=new Student(name,rollno,branch);
        a++;
    }
    void display(){
        for (int i = 0; i < a; i++) {
            s[i].display();
        }

    }
}
