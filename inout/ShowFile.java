// package inout;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin;
        // confirm that the filename has been specifed
        if(args.length!=1){
            System.out.println("Usage: Showfile");
            return;
        }
        // attempt to open the file
        try{
            fin = new FileInputStream(args[0]);
        }catch(FileNotFoundException e) {
            System.out.println("cannot open file");
            return;
        }
        // at this point the file is open
        // read character untill EOF is encountered

         try{
            do{
                i=fin.read();
                if(i!=-1) {System.out.print((char)i);}
            } while(i!=-1);
         }catch(IOException e){
            System.out.println("Error Reading file");
         }
    }
}
