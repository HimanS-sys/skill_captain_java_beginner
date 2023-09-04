// Program to demonstrate loops in JAVA.

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // print numbers from 1 to 10.
        for(int i = 1; i < 11; i++){
            System.out.println(i);
        }

        // print even numbers between 1 and 20.
        int j = 1;
        while(j < 21){
            if(j%2 == 0){
                System.out.println(j);
            }
            j++;
        }

        // Print user input if its an integer between 1 and 10.
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.println("Enter an integer between 1 and 10:");
            num = sc.nextInt();
        } while ((num < 0) || (num > 11));

        System.out.println("number entered: " + num);
    }
}