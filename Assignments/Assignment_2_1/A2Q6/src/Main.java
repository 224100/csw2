public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Dog", "Brown", "Pet");
        Animal animal2 = new Animal("Lion", "Yellow", "Wild");

        System.out.println("Animal 1: " + animal1 + ", HashCode: " + animal1.hashCode());
        System.out.println("Animal 2: " + animal2 + ", HashCode: " + animal2.hashCode());
    }
}