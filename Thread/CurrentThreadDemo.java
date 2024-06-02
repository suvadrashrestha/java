package Thread;

public class CurrentThreadDemo {
   public static void main(String[] args) {
    Thread t= Thread.currentThread();
    System.out.println("Current Thread:"+t);
    t.setName("My head");
    System.out.println("After name change :"+t);
    try{
        for(int n=5;n>0;n--){
            t.setName("Thread name:"+n);
            System.out.println("Thread:"+t+" "+n);
            Thread.sleep(1000);
        }
    }catch(InterruptedException e){
        System.out.println("Main thread interrupted");
    }

} 
}
