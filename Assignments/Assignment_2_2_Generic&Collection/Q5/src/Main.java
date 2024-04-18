public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("1","Java", "James Gosling", 1000);
        Book b2 = new Book("2","C++", "Bjarne Stroustrup", 500);

        Library l = new Library();
        l.addBook(1,b1);
        l.addBook(2,b2);

        l.display();
        l.isPresent(b1.name);
        l.isPresent("hello");
        l.removeBook(1);
        l.display();
    }
}