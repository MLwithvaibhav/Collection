package JavaCollections;
import java.util.LinkedList;
import java.util.jar.Attributes.Name;

public class LL{

    public static void main(String[] args) {
        
        LinkedList<String> Name = new LinkedList<String>();
        Name.add("Vaibhav");
        Name.add("Payal");

        System.out.println(Name);

        Name.addFirst("Miesha");
        Name.addLast("Levi");
        System.out.println(Name);

        Name.remove();
        Name.removeFirst();
        Name.removeLast();


        // for each loop ;

        for (String string : Name) {

            System.out.println(string);
            
        }
        
    }
    
}
