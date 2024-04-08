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
    @Override
    public boolean equals(Object o){
        if(o instanceof Book){
            Book s =(Book)o;
            return price>s.price;
        }
        return false;
    }
}
