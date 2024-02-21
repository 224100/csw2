import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        Student[] sec= new Student[5];

        for(int i =0;i<5;i++){
            sec[i]=new Student(sc.next(),sc.next(), sc.next());
        }
        for (int i =0 ;i<5;i++){
            sec[i].display();
        }
    }
}