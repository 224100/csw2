public class Main {
    public static void main(String[] args) {
        ArrayListUser arrayListUser = new ArrayListUser();
        arrayListUser.addUser(new User("Alice", 25));
        arrayListUser.addUser(new User("Bob", 20));
        arrayListUser.addUser(new User("Charlie", 30));

        System.out.println("Before sorting:");
        arrayListUser.printUsers();

        arrayListUser.sortUsersByAge();

        System.out.println("After sorting:");
        arrayListUser.printUsers();
    }
}