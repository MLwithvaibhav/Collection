package JavaCollections;

import java.util.ArrayDeque;

public class AD {

    public static void main(String[] args) {
        
        ArrayDeque<String> Name = new ArrayDeque<>();
        Name.push("Vaibhav");
        Name.push("suraj");
        Name.push("Miesha");
        System.out.println(Name);

        Name.pop();
        System.out.println(Name);
    }
    
}
