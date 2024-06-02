package String;
public class GetChars{
    public static void main(String[] args) {
        String s= "This is a demo of getchars method";
        int start=10;
        int end=14;
        char[] buf= new char[end-start];
        // start= start index ,end= end index, buf= destintion array, dstBegin: from which index start
        s.getChars(start, end, buf, 0);
        System.out.println(buf);
        System.out.println(s);

    }
}