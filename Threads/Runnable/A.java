package Threads.Runnable;

public class A  implements Runnable{

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
