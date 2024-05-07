public class Main {
    public static void main(String[] args) {
        bst b  = new bst();
        int[] a =  {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        b.root = b.createTree(a,0,a.length-1);
        b.inorder(b.root);
        bst x = new bst();
        bstnode y = new bstnode();
        bstnode z = new bstnode();
        bstnode w = new bstnode();
        y.data=8;
        z.data =9;
        w.data=10;
        x.root=y;
        x.root.left=z;
        x.root.right=w;
        System.out.println();
        System.out.println(b.isbst(b.root));
        System.out.println(x.isbst(x.root));
    }
}