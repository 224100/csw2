import java.io.*;
public class sam {
    public static void main(String[] args) {
        File f1 = new File("C:\\Users\\hp\\Desktop\\desktop\\Aman_2241001030\\csw2\\javaio\\src\\stxt.txt");
        File f2 = new File("C:\\Users\\hp\\Desktop\\desktop\\Aman_2241001030\\csw2\\javaio\\src\\stxt2.txt");
       try{

           FileInputStream inf = new FileInputStream(f1);
           FileOutputStream outf = new FileOutputStream(f2);
           int x ;
           while((x=inf.read())!=-1){
               outf.write(x);
           }
           System.out.println("Done!");
           inf.close();
           outf.close();
       }
       catch(IOException e ){
           e.printStackTrace();
       }


    }
}
