package JavaCollections;

import java.util.Stack;

public class ST {

    public static void main(String[] args) {
        
        Stack<String> Name = new Stack<String> ();

        Name.push("Vaibhav");
        Name.push("Payal");
        Name.push("Miesha");
        System.out.println(Name);

        Name.pop();
        System.out.println(Name);
    }
    
}
