public class Main {
    public static void main(String[] args) {
        
    }
}
class bstnode {
    bstnode right;
    bstnode left;
    int data;
}
class bst{
    bstnode root;
    public bst(){
        root = null;
    }
    public void insert(int data){
        bstnode newnode = new bstnode();
        newnode.data = data;
        if(root == null){
            root = newnode;
        }
        else{
            bstnode current = root;
            bstnode parent;
            while(true){
                parent = current;
                if(data < current.data){
                    current = current.left;
                    if(current == null){
                        parent.left = newnode;
                        return;
                    }
                }
                else{
                    current = current.right;
                    if(current == null){
                        parent.right = newnode;
                        return;
                    }
                }
            }
        }
    }
    public void inorder(bstnode root){
        if(root != null){
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }
    public void preorder(bstnode root){
        if(root != null){
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    public void postorder(bstnode root){
        if(root != null){
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }
    public void delete(int data){

    }
}