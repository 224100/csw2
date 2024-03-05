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



}
