import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListUser{
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
        for(int i = users.size()-1;i>=0;i--){
            for(int j =0;j<i;j++){
                if(users.get(j).compareTo(users.get(j+1)) ==1){
                    User temp = users.get(j);
                    users.set(j,users.get(j+1));
                    users.set(j+1,temp);
                }
            }
        }
    }
}