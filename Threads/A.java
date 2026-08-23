package Threads;

public class A extends Thread {

    public void run(){
        for(int i = 0; i<100; i++){
            System.out.println("HIi");

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        
    }
    
}
