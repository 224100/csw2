import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListUser {
    ArrayList<User> users;

    public ArrayListUser() {
        users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void printUsers() {
        for (User user : users) {
            System.out.println(user);
        }
    }

    public void sortUsersByAge() {
        Collections.sort(users, Comparator.comparing(User::getAge));
    }
}