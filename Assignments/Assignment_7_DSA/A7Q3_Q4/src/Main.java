public class Main {
    public static void main(String[] args) {
        BST b = new BST();
        b.insert("India",200);
        b.insert("America",150);
        b.insert("China",250);
        b.inorder(b.root);
        System.out.println();
        b.min_node(b.root);
        b.max_node(b.root);

    }
}