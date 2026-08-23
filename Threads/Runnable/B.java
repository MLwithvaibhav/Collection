package Threads.Runnable;

public class B implements Runnable{

    public void run(){
        for(int i = 0; i<100; i++){
            System.out.println("Hello bawli gend");

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
        
    }
    
}
