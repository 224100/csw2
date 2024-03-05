public class Book {
    String bookId;
    String bookName;
    double price;

    public Book(String bookId, String bookName, double price) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.price = price;
    }
    @Override
    public String toString(){
        return bookId+" "+bookName+" "+price;
    }
    public void equals(Book b){
        if(price>b.price){
            System.out.println(this);
        }
        else{
            System.out.println(b);
        }
    }

    public static void main(String[] args) {
        Book a =new Book("223","how",332);
        Book b = new Book("tr4","You",500);
        a.equals(b);
    }

}
