public class Course{
    String subject;
    String code;
    int duration;
    Student[] s ;
    int a=0;

    public Course(String subject, String code, int duration) {
        this.subject = subject;
        this.code = code;
        this.duration = duration;
        s= new Student[100];
    }
    public void setStudent(String st , int regno){
        s[a]=new Student(st,regno);
        a++;
    }
    String getName(){
        return subject;
    }
    void display(){
        if(s[0]!=null){
            System.out.println("Subject: "+subject);
            System.out.println("Code: "+code);
            for (Student z : s){
                if(z == null)
                    break;
                z.display();
            }
        }
    }

}