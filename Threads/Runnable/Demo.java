package Threads.Runnable;


public class Demo {

    public static void main(String[] args) {

        A obj = new A();
        B obj1 = new B();
        
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj1);
        t1.start();
        t2.start();

    }
    
}
