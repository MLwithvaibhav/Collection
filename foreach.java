import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class foreach {

        public static void main(String[] args) {
            
            List<Integer> nums = Arrays.asList(3,4,5,6,7,8,9);

            // for(int i = 0; i<5; i++){
                
            //     System.out.println(nums.get(i));
            // }

            // for(int n : nums){
            //     System.out.println(n);
            // }

            //=========================================
            // example of using consumer with for each

            // Consumer<Integer> cons = new Consumer<Integer>() {
                
            //     public void accept(Integer integer){
            //         System.out.println(integer);
            //     }
            // };

            // nums.forEach(cons);

            // Optimised version
            // Consumer<Integer> cons = n-> System.out.println(n);
            // nums.forEach(cons);

            // More Optimised version
            nums.forEach(n-> System.out.println(n));
        }
    
}
