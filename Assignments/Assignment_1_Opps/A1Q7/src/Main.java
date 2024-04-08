public class Main {
    public static void main(String[] args) {
        SavingsAccount s =new SavingsAccount("50100511240965",50000,5F);
        CurrentAccount c =new CurrentAccount("123",50000,40000);
        s.deposit(10000);
        s.withdraw(1000000);
        s.display();
        c.withdraw(70000);
        c.deposit(3000);
        c.display();
    }
}