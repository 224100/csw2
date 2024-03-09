public class Main {
    public static void main(String[] args) {
        Student<Integer> student1 = new Student<>("John Doe", 123, 20);
        Student<String> student2 = new Student<>("Jane Doe", "456", 22);

        System.out.println(student1);
        System.out.println(student2);
    }
}