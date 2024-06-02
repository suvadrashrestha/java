package assignment1;
import java.io.*;
// write a program to reverse the characters in a string without using recursion

public class ReverseString {
    public static void main(String[] args) throws IOException {
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the string to reverse :");
        String word= reader.readLine();
        char[] characterArray=word.toCharArray();
        int left=0;
        int right=characterArray.length-1;
        while (left<right) {
            char temp= characterArray[left];
            characterArray[left]=characterArray[right];
            characterArray[right]=temp;
            left++;
            right--;
        }  
        System.out.println("The reverse is :"+new String(characterArray));      
    }
     
    
}
