import java.util.LinkedList;
import java.util.Queue;

public class BST {
    BNode root ;
    public BST(){
        root = null;
    }
    public void insert(String name , int data){
        BNode t = new BNode(name,data);
        if(root==null){
            root = t;
        }
        else{
            BNode current = root;
            BNode parent ;
            while(true){
                parent = current;
                if(current.info.population>data){
                    current = current.left;
                    if(current==null){
                        parent.left=t;
                        return;
                    }
                }
                else{
                    current=current.right;
                    if(current==null){
                        parent.right=t;
                        return;
                    }
                }

            }
        }
    }
    public void level_display() {
        BNode current = root;
        Queue<BNode> q = new LinkedList<>();
        q.add(current);
        while (!q.isEmpty()) {
            current = q.poll();
            System.out.println(current);
            if (current.left != null) {
                q.add(current.left);

            }
            if (current.right != null) {
                q.add(current.right);
            }
        }
    }
    public void max_node(BNode root) {
        if (root.right == null) {
            System.out.println(root);
        } else {
            max_node(root.right);
        }
    }
    public void min_node(BNode root) {
        if (root.left == null) {
            System.out.println(root);
        } else {
             min_node(root.left);
        }
    }
    public void inorder(BNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.toString() + " ");
            inorder(root.right);
        }
    }
}
