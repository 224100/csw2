import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entry for dairy!");
        String s = sc.nextLine();
        File f = new File("C:\\Users\\hp\\Desktop\\desktop\\Aman_2241001030\\csw2\\Assignments\\Assignment_6_IOFILE\\Q6_1\\src\\dairy.txt");
        try{
            if(f.createNewFile()){
                System.out.println("Created new file!");
            }
            else{
                System.out.println("Dairy already exists!");
            }
            FileWriter fout = new FileWriter(f,true);
            fout.write("\n"+s);

            fout.write(128512);
            fout.close();
        }
        catch(IOException e ){
            System.out.println("Error!");
        }
    }
}