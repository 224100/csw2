

public class Main {
    public static void main(String[] args) {
        Student[] s= new Student[5];
        for(int i =0;i<5;i++){
            s[i]=new Student();
            s[i].setValues();
        }
        for (int i =0 ;i<5;i++){
            s[i].display();
        }
    }
}