package assignment1;
import java.io.*;
// write a java program to check if given character s vowel or consonant

public class VowelConsonent {
    public static void main(String[] args) throws IOException {
        BufferedReader reader= new BufferedReader( new InputStreamReader(System.in));
        System.out.println("Enter the character");
        char character= (char)reader.read();
        if (character=='a'||character=='e'||character=='i'||character=='o'||character=='u'||character=='A'||character=='E'||character=='I'||character=='O'||character=='U'){
            System.out.println("The character is vowel");
        }
        else
        {
            System.out.println("The character is consonant");
        }
       


    }
}
