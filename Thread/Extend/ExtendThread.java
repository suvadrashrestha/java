package Thread.Extend;


class NewThread extends Thread{
    NewThread(){
        super("Demo thread");
        System.out.println("Child thread:"+this);
    }
    
    public void  run (){
        try{
            for(int i=5;i>0;i--){
                System.out.println("Child Thread:"+i);
                Thread.sleep(500);
            }
        }catch(InterruptedException e){
            System.out.println("Child interrupted.");
        }
        System.out.println(("EXiting child thread"));
    }
}
public class ExtendThread {
    public static void main(String[] args) {
        
     NewThread obj= new NewThread();
     obj.start();
     try{
     for(int n=5;n>0;n--){
        System.out.println("main Thread:" + n);
        Thread.sleep(1000);

     }}
     catch(InterruptedException e){
        System.out.println("Main thread interrupted");
     }
     System.out.println("Main thread exiting");
    }
}
