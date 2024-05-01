import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        bst b = new bst();
        int x =1;
        while(x!=0){
            System.out.println("Enter 1 to insert,\n2 to r_insert,\n3 to delete,\n4 to inorder,\n5 to preorder,\n6 to postorder,\n7 to find max , \n8 to find min, \n0 to exit");
            Scanner sc = new Scanner(System.in);
            x = sc.nextInt();
            switch (x){
                case 1:
                    System.out.println("Enter the data to insert");
                    int data = sc.nextInt();
                    b.insert(data);
                    break;
                case 2:
                    System.out.println("Enter the data to insert");
                    int data1 = sc.nextInt();
                    b.insert_recursive(data1);
                    break;
                case 3:
                    System.out.println("Enter the data to delete");
                    int data2 = sc.nextInt();
                    b.delete(data2);
                    break;
                case 4:
                    b.inorder(b.root);
                    System.out.println();
                    break;
                case 5:
                    b.preorder(b.root);
                    System.out.println();
                    break;
                case 6:
                    b.postorder(b.root);
                    System.out.println();
                    break;
                case 7:
                    System.out.println("Max node is: " + b.max_node(b.root));
                    break;
                case 8:
                    System.out.println("Min node is: " + b.min_node(b.root));
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid input");

            }

        }
    }
}
