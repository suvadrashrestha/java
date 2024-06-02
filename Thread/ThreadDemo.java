package Thread;

class NewThread implements Runnable {
    Thread t;

    NewThread() {
        t = new Thread(this, "demo Thread");
        System.out.println("Child Thread");
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

public class ThreadDemo {
    public static void main(String[] args) {
      NewThread obj= new NewThread();
      obj.t.start();
      try{
        for(int i=5;i>0;i--){
            System.out.println("Main Thread:"+i);
            Thread.sleep(1000);
        }
      }catch(InterruptedException e){
        System.out.println("Main thread interrupted");
      }
      System.out.println("Main thread exiting");
    }
}
