import java.util.HashMap;

public class Library {
    HashMap<Integer , Book> b = new HashMap<>();
    public void addBook(Integer key , Book book){
        b.put(key,book);
    }
    public void display(){
        for(Integer Key : b.keySet()){
            System.out.println(Key+" : "+b.get(Key));
        }
    }
    public void isPresent(String name) {
        int flag = 0;
        for (Book book : b.values()) {
            if (book.name.equals(name)) {
                System.out.println("Book is present ");
                flag++;
                break;
            }
        }
        if(flag==0)
            System.out.println("Book is not present");
    }
    public void removeBook(Integer key){
        b.remove(key);
    }

}
