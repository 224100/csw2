import java.util.Scanner;
public class Main
{

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Shape s;
        do
        {
            System.out.println("-------------------------------------------------------------------");
            System.out.println("press 1:find area of circle  2:find area of rectangle 3:find area of square");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("enter radius:");
                    int r=sc.nextInt();
                    System.out.println("enter color:");
                    String c=sc.next();
                    s=new circle(r,c);
                    s.display();
                    break;
                case 2:
                    System.out.println("enter length:");
                    int l=sc.nextInt();
                    System.out.println("enter breadth:");
                    int b=sc.nextInt();
                    System.out.println("enter color:");
                    c=sc.next();
                    s=new Rectangle(l,b,c);
                    s.display();
                    break;
                case 3:
                    System.out.println("enter side:");
                    int a=sc.nextInt();
                    System.out.println("enter color:");
                    c=sc.next();
                    s=new Square(a,c);
                    s.display();
                    break;
                default:
                    System.out.println("please choose a valid option");
            }
            System.out.println("do you want to perform any other operation:(y/n)");
            char c=sc.next().charAt(0);
            if(c=='n')
            {
                System.out.println("THANK YOU");
                System.exit(0);
            }
            else
            {
                continue;
            }

        }
        while(true);

    }

}