package String;
public class EqualsDemo {
    public static void main(String[] args) {
        String s1="hello";
        String s2="hello";
        String s3="Good-bye";
        String s4="HELLO";
        System.out.println(s1+"  equals  "+s2+"-->"+s1.equals(s2));
        System.out.println(s1+"  equals  "+s3+"-->"+s1.equals(s3));
        System.out.println(s1+"  equals  "+s4+"-->"+s1.equals(s4));
        System.out.println(s1+"  equalsIgnoreCase  "+s2+"-->"+s1.equalsIgnoreCase(s4  ));
    }
}
