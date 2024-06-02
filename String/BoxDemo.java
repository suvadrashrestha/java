package String;

class Box{
    double width;
    double height;
    double depth;
    Box(double w,double h,double d){
        width=w;
        height=h;
        depth=d;
    }
//     public String toString(){
//         return "Dimension are "+width+" by "+depth+" by "+height+".";
//     }
}



public class BoxDemo {
    public static void main(String[] args) {
      Box obj= new Box(12 ,34,45);
      System.out.println(obj);
    }
}
