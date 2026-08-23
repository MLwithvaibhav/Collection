package Input;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        System.out.println("Enter a number");

        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader br = new BufferedReader(in);

        // int num = Integer.parseInt(bf.readLine());
        // System.out.println(num);

        // bf.close();

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);
    }
    
}
