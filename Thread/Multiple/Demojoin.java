package Thread.Multiple;
class NewThread implements Runnable{
    String name;
    Thread t;
    NewThread(String threadname){
        name=threadname;
        t=new Thread(this,name);
        System.out.println("New thread:"+t);
    }
    // thread work is completed when run method is returned 
    // run method must be always public 
    public void run(){
        try{
            for(int i=5;i>0;i--){
                System.out.println(name+":"+i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e){
            System.out.println(name+"Interrupted");
        }
        System.out.println(name+"exiting");
    }

}
public class Demojoin {
    public static void main(String[] args) {
        NewThread obj1= new NewThread("One");
        NewThread obj2= new NewThread("Two");
        NewThread obj3= new NewThread("Three");
        obj1.t.start();
        obj2.t.start();
        obj3.t.start();
        System.out.println("Thread one is live :"+obj1.t.isAlive()); 
        System.out.println("Thread two is live :"+obj2.t.isAlive()); 
        System.out.println("Thread three is live :"+obj3.t.isAlive()); 
        // waiting for the threads to finish
        try{
            System.out.println("waiting for thread to finish"); 
            obj1.t.join();
            obj2.t.join();
            obj3.t.join();

        }
        catch( InterruptedException e){
            System.out.println("Main thread Interrupted");

        }

        System.out.println("Thread One is alive :" + obj1.t.isAlive());
        System.out.println("Thread two is alive :" + obj2.t.isAlive());
        System.out.println("Thread three is alive :" + obj3.t.isAlive());
    }
    
}
