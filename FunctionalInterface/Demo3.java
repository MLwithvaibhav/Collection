package FunctionalInterface;

public class Demo3 {

    public static void main(String[] args) {
        
        C obj = (a,b) -> a+b;
            
        
        int result = obj.add(4, 7);
        System.out.println(result);
    }
    
}
