public abstract class Account {
    private String accno;
    private  long balance;

    public Account(String accno, long balance) {
        this.accno = accno;
        this.balance=balance;
    }
    public String getAccno() {
        return accno;
    }
    public long getBalance() {
        return balance;
    }
    public void setBalance(long balance) {
        this.balance = balance;
    }
    public abstract void withdraw(long a);
    public abstract void deposit(long a);
    public abstract void display();
}
