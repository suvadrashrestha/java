package Thread.Multiple;

class NewThread implements Runnable{
    String name;
    Thread t;
    NewThread(String threadname){
        name=threadname;
        t=new Thread(this,name);
        System.out.println("New thread:"+t);
    }
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
public class MultiThreadDemo {
    public static void main(String[] args) {
        NewThread obj1= new NewThread("One");
        NewThread obj2= new NewThread("Two");
        NewThread obj3= new NewThread("Three");
        obj1.t.start();
        obj2.t.start();
        obj3.t.start();
        try{
            Thread.sleep(10000);
        }
        catch(InterruptedException e){
            System.out.println("Main thread Interrupted");

        }
        System.out.println("Main Thread Exiting");
    }
}
