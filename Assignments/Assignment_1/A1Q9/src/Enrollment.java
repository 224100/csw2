import java.util.ArrayList;
import java.util.List;

public class Enrollment implements EnrollmentSystem{
    private Course courses[] = new Course[5];
    public Enrollment(){
        courses[0]= new Course("Networking","N001",4);
        courses[1]= new Course("Calculus","C002",4);
        courses[2]= new Course("Communication","C210",4);
        courses[3]= new Course("Management","B001",3);
        courses[4]= new Course("Models","m001",4);
    }
    @Override
    public void enroll(int a, String s,int regno) {
        switch(a){
            case 1:
                courses[0].setStudent(s,regno);
                break;
            case 2:
                courses[1].setStudent(s,regno);
                break;
            case 3:
                courses[2].setStudent(s,regno);
                break;
            case 4:
                courses[3].setStudent(s,regno);
                break;
            case 5:
                courses[4].setStudent(s,regno);
                break;
            default:
                System.out.println("ye clg me ye course nahi h !!");
        }
    }
    @Override
    public void display(){
        for(Course z : courses){
            if(z == null)
                break;
            z.display();
        }
    }

}