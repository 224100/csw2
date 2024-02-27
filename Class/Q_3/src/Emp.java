import java.util.Scanner;
public class Emp {

    private String name;
    private String empId;
    private String branch;
    Scanner sc =new Scanner(System.in);
    public Emp(String name, String empId, String branch){
        this.name=name;
        this.empId=empId;
        this.branch=branch;
    }

    public Emp() {

    }

    void setValues(){

        System.out.println("Enter the Name, empId and Branch");
        name = sc.next();
        empId=sc.next();
        branch=sc.next();
    }
    String getName(){
        return name;

    }
    String getEmpId(){
        return empId;

    }
    String getBranch(){
        return branch;

    }
    void display() {
        System.out.println("Name : " + getName());
        System.out.println("empId : " + getEmpId());
        System.out.println("Branch : " + getBranch());

    }
}


