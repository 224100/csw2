import java.util.Scanner;
public class mob_d {
    private String s_prov;
    private long s_num;
    private String s_reg;

        Scanner sc =new Scanner(System.in);
        void setValues(){

            System.out.println("Enter the Provider, number and name registered");
            s_prov = sc.next();
            s_num=sc.nextLong();
            s_reg=sc.next();
        }
        String getProv(){
            return s_prov;

        }
        Long getnum(){
            return s_num;

        }
        String getreg(){
            return s_reg;

        }
        void display() {
            System.out.println("service provider : " + getProv());
            System.out.println("sim number : " + getnum());
            System.out.println("sim registered name : " + getreg());

        }
    }




