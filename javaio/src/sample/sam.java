package sample;

import java.io.*;
import java.util.Scanner;

public class sam {
    public static void main(String[] args) {
        File f1 = new File("C:\\Users\\hp\\Desktop\\desktop\\Aman_2241001030\\csw2\\javaio\\src\\stxt.txt");
        File f2 = new File("C:\\Users\\hp\\Desktop\\desktop\\Aman_2241001030\\csw2\\javaio\\src\\stxt2.txt");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to add to the file :-");
        String in = sc.nextLine();
       try{
           if(f2.createNewFile()){
               System.out.println("Output file created!");
           }
           FileReader inf = new FileReader(f1);
           FileWriter outf = new FileWriter(f2);
           int x ;
           while((x=inf.read())!=-1){
               outf.write(x);
           }
           outf.write("\n"+in);
           System.out.println("Done!");
           inf.close();
           outf.close();
       }
       catch(Exception e ){
           System.out.println("Error!");
       }
    }
}
