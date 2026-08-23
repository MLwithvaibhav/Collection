package Threads.Runnable;


public class Demo {

    public static void main(String[] args) {

        A obj = new A();
        B obj1 = new B();
        obj.start();
        obj1.start();

    }
    
}
