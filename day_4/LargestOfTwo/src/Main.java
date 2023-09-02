// Find greater of the two numbers

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number:");
        int num2 = sc.nextInt();

        // conditional statement
        if(num1 > num2) {
            System.out.println("Largest number between the two is " + num1 + ".");
        } else if(num2 > num1) {
            System.out.println("Largest number between the two is " + num2 + ".");
        } else {
            System.out.println("Both are equal.");
        }
    }
}