import java.io.*;
public class Main {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\hp\\Desktop\\desktop\\Aman_2241001030\\csw2\\Assignments\\Assignment_6_IOFILE\\Q6_1\\src\\dairy.txt");
        try{
            if(f.exists()){
                FileReader inf = new FileReader(f);
                int c;
                while((c =inf.read())!=-1){
                    System.out.print((char)c);
                }
                inf.close();
            }
            else{
                System.out.println("Does not exists!!!!!");
            }
        }
        catch(IOException e ){
            System.out.println("Error!");
        }
    }
}