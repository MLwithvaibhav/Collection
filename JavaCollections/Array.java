package JavaCollections;

import java.util.ArrayList;

public class Array{

    public static void main (String[] args){

        ArrayList<String> Name = new ArrayList<String>();
        Name.add("Vaibhav");
        Name.add("Payal");
        Name.add("James");
        Name.add("Bala");

        System.out.println(Name);
        Name.add(1, "Miesha");
        System.out.println(Name);

        Name.remove(2);
        System.out.println(Name);

        Name.set(2, "Peter Parker");
        System.out.println(Name);

        Name.add(1, "Payal");
        System.out.println(Name.get(1));

        
    }
}