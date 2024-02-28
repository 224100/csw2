public class Main {
    public static void main(String[] args) {
        Book b = new Book("The power of your subconcious mind","Joseph murphy",290);
        Magazine m = new Magazine("Entertainment weekly","Robert Downey Jr.","1-05-1999");
        DVD d =new DVD("Ironman","Stan lee",126);
        b.displayDetails();
        m.displayDetails();
        d.displayDetails();
    }
}