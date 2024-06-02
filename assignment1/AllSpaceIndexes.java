package assignment1;
public class AllSpaceIndexes {

    public static void main(String[] args) {
        String str = "This is a string with multiple spaces";
        int startIndex = 0;
        int spaceIndex;

        while ((spaceIndex = str.indexOf(' ', startIndex)) != -1) {
            System.out.println("Space found at index: " + spaceIndex);
            startIndex = spaceIndex + 1; // Start searching from the next character
        }
    }
}