public class Book {
    String id;
    String name;
    String author;
    int quantity;

    Book(String id, String name, String author, int quantity){
        this.id = id;
        this.name = name;
        this.author = author;
        this.quantity = quantity;

    }
    @Override
   public String toString(){
        return "id: " + id + " name: " + name + " author: " + author + " quantity: " + quantity;
    }
}
