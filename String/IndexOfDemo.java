package String;
public class IndexOfDemo {
    public static void main(String[] args) {
        String s = "Now is the time for all good men"+
                 "to come to the aid of their country";
        System.out.println(s);
        System.out.println("indexof(t)="+s.indexOf("t"));
        System.out.println(("lastindexof(t)="+s.lastIndexOf("t")));
        System.out.println("indexof(the)="+s.indexOf("the"));
        System.out.println(("lastindexof(the)="+s.lastIndexOf("the")));
        //search after the 10 th index 
        System.out.println("indexof(t,10)="+s.indexOf("t",10));
        System.out.println("lastindexof(t,10)="+s.lastIndexOf("t",60));
        System.out.println("indexof(the,10)="+s.indexOf("the",10));
        //search before 60 
        System.out.println("lastindexof(the,60)="+s.lastIndexOf("the",60));




    }
}
