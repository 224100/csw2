class bst {
    bstnode root;

    public bst() {
        root = null;
    }
    public bstnode createTree(int[] data,int l,int h) {
        if(l>h)
            return null;
        bstnode current;
        int m = (l+h)/2;
        current = new bstnode();
        current.data=data[m];

        current.left = createTree(data,l,m-1);
        current.right=createTree(data,m+1,h);
        return current;
    }
    public void inorder(bstnode root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }
    public boolean isbst(bstnode c){
        if(c==null)
            return true;


}

class bstnode {
    bstnode right; 
    bstnode left;
    int data;
}
