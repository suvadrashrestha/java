package assignment1;
import java.io.*;
// write a program to count the number of words in a string
public class CountString {
    public static void main(String[] args) {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a string");
        try {
            String inputReader=  reader.readLine();
            String[] words= inputReader.split("\\s+");
            int length= words.length;
            System.out.println( "The number of words in the string is :"+length);
        } catch (IOException e) {
            System.out.println("an error occured while reading input");
            e.printStackTrace();
        }

         

        
    }
}
