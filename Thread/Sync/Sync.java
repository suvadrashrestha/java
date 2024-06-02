package Thread.Sync;
// This program is not synchroized
class Callme{
    synchronized void call(String msg){
         System.out.println("["+msg);
         try{
            Thread.sleep(1000);

         }
         catch(InterruptedException e){
            System.out.println("Interrupted");
         }
         System.out.println("]");
    }
}

class Caller implements Runnable {
    String msg;
    Callme target;
    Thread t;
    public Caller(Callme targ,String s){
             target = targ;
             msg = s;
             t = new Thread(this);

    }
     public void run(){
         target.call(msg);
    }
    
}

public class Sync {
 
    public static void main(String[] args) {
        Callme target= new Callme();
        Caller obj1= new Caller(target, "Hello");
        Caller obj2= new Caller(target, "Synchronized");
        Caller obj3= new Caller(target, "World");
        // start the threads
         obj1.t.start();
         obj2.t.start();
         obj3.t.start();
         // wait for threads to end
          try{
            obj1.t.join();
            obj2.t.join();
            obj2.t.join();
          }
          catch(InterruptedException e ){
            System.out.println("Intertupted");
          }

    }
    
}