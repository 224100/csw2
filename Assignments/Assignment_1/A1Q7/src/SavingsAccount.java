public class SavingsAccount extends Account{
    float interestRate;

    public SavingsAccount(String accno,long balance, float interestRate) {
        super(accno,balance);
        this.interestRate = interestRate;
    }
    @Override
    public void display() {
        System.out.println("-----Saving Account-----");
        System.out.println("Account no : "+getAccno());
        System.out.println("Balance : "+getBalance());
    }
    @Override
    public void withdraw(long a) {
        System.out.println("-----Saving Account-----");
        if(a>getBalance()) {
            System.out.println("Not enough balance!!");
        }
        else {
            setBalance(getBalance() - a);
            System.out.println("Updated balance : "+getBalance());
        }
    }

    @Override
    public void deposit(long a) {
        System.out.println("-----Saving Account-----");
        setBalance(a+getBalance());
        System.out.println("New interest is :"+(getBalance()*interestRate)/100);

    }
}
