import java.util.Scanner;
class Bank {
    private long acc_no;
    private String name;
    private float balance;
    Scanner sc =new Scanner(System.in);
    void setValues(){

        System.out.println("Enter the Account number name and balance");
        acc_no=sc.nextLong();
        name = sc.next();
        balance=sc.nextFloat();
    }
    long getAccno(){
        return acc_no;
    }
    float getBalance(){
        return balance;
    }
    String getName(){
        return name;

    }
    void display(){
        System.out.println("Acc_no : "+ getAccno());
        System.out.println("Balance : "+ getBalance());
        System.out.println("Name : "+ getName());
    }
    void withdraw(){
        System.out.println("Enter the withdrawn amount :");
        int d=sc.nextInt();
        if(d>balance){
            System.out.println("Not enough balance!!");
        }
        else {
            balance -= d;
            System.out.println("Updated balance = "+getBalance());
        }
    }
    void deposit(){
        System.out.println("Enter the deposited amount :");
        int d =sc.nextInt();
        balance += d;
        System.out.println("updated balance : "+getBalance());
    }
}
