import java.util.Scanner;

public class sec {
    Scanner sc = new Scanner(System.in);
    int a =0;
    int max_st;
    Student[] s;

    public sec(int m) {
        s=new Student[m];
        max_st=m;
        
    }
    void add(String name,int rollno){
        s[a]=new Student(name,rollno);
        a++;
    }
    void delete(){
        a--;
    }
    void display(){
        for (int i = 0; i < a; i++) {
            System.out.println(s[i]);
        }

    }
    void sort(){
        for(int i =a-1;i>=0;i--){
            for(int j=0;j<i;j++){
                if(s[j].getroll()>s[j+1].getroll()){
                    Student temp =s[j];
                    s[j]=s[j+1];
                    s[j+1]=temp;
                }
            }
        }
    }
}
