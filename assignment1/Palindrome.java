package assignment1;
import java.io.*;

class PalindromeChecker {
    public boolean isPalindrome(String strs) {
        String str=strs.toLowerCase();
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}



public class Palindrome {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Enter a string:");
            String inputString = reader.readLine();
            
            PalindromeChecker checker = new PalindromeChecker();
            if (checker.isPalindrome(inputString)) {
                System.out.println("The string \"" + inputString + "\" is a palindrome.");
            } else {
                System.out.println("The string \"" + inputString + "\" is not a palindrome.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading input.");
            e.printStackTrace();
        }
    }
}

