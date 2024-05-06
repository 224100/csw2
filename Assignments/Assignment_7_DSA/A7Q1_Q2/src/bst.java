class bst {
    bstnode root;

    public bst() {
        root = null;
    }

    public int max_node(bstnode root) {
        if (root.right == null) {
            return root.data;
        } else {
            return max_node(root.right);
        }
    }

    public int min_node(bstnode root) {
        if (root.left == null) {
            return root.data;
        } else {
            return min_node(root.left);
        }
    }

    public void insert_recursive(int data) {
        root = insert_recursive(root, data);
    }

    public bstnode insert_recursive(bstnode c, int data) {
        if (c == null) {
            c = new bstnode();
            c.data = data;
        } else {
            if (data < c.data)
                c.left = insert_recursive(c.left, data);
            else
                c.right = insert_recursive(c.right, data);
        }
        return c;
    }

    public void insert(int data) {
        bstnode newnode = new bstnode();
        newnode.data = data;
        if (root == null) {
            root = newnode;
        } else {
            bstnode current = root;
            bstnode parent;
            while (true) {
                parent = current;
                if (data < current.data) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newnode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newnode;
                        return;
                    }
                }
            }
        }
    }

    public void inorder(bstnode root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public void preorder(bstnode root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    public void postorder(bstnode root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }

    public bstnode delete_iterate(bstnode root, int data) {
        bstnode current = root;
        bstnode parent = root;
        boolean isleft = false;
        while (current.data != data) {
            parent = current;
            if (data < current.data) {
                current = current.left;
                isleft = true;
            } else {
                current = current.right;
                isleft = false;
            }
            if (current == null) {
                return null;
            }
        }
        if (current.left == null && current.right == null) {
            if (current == root) {
                root = null;
            } else if (isleft) {
                parent.left = null;
            } else {
                parent.right = null;
            }
        } else if (current.right == null) {
            if (current == root) {
                root = current.left;
            } else if (isleft) {
                parent.left = current.left;
            } else {
                parent.right = current.left;
            }
        } else if (current.left == null) {
            if (current == root) {
                root = current.right;
            } else if (isleft) {
                parent.left = current.right;
            } else {
                parent.right = current.right;
            }
        } else {
            bstnode successor = get_successor(current);
            if (current == root) {
                root = successor;
            } else if (isleft) {
                parent.left = successor;
            } else {
                parent.right = successor;
            }
            successor.left = current.left;
        }
        return current;
    }

    public bstnode get_successor(bstnode delnode) {
        bstnode successor = delnode;
        bstnode successorparent = delnode;
        bstnode current = delnode.right;
        while (current != null) {
            successorparent = successor;
            successor = current;
            current = current.left;
        }
        if (successor != delnode.right) {
            successorparent.left = successor.right;
            successor.right = delnode.right;
        }
        return successor;
    }
}


class bstnode {
    bstnode right;
    bstnode left;
    int data;
}
