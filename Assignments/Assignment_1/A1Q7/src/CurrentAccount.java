public class CurrentAccount extends Account {
    long over;

    public CurrentAccount(String accno, long balance, long over) {
        super(accno, balance);
        this.over = over;
    }

    public long getOver() {
        return over;
    }

    public void setOver(long over) {
        this.over = over;
    }

    @Override
    public void withdraw(long a) {
        if(over<a){
            System.out.println("-----Current Account-----");
            System.out.println("Withdrwal is over the over draft : "+getOver());

            }
        else{
            setBalance(getBalance()-a);
            System.out.println("Withdraw successful! ");
        }
    }


    @Override
    public void deposit(long a) {
        setBalance(getBalance()+a);
        System.out.println("-----Current Account-----");
        System.out.println("Money deposited!");
    }

    @Override
    public void display() {
        System.out.println("-----Current Account-----");
        System.out.println("Account number : "+getAccno());
        System.out.println("Balance : "+getBalance());
    }
}
