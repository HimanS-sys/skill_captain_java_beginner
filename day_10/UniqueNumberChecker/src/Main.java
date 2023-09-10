// Unique Number Checker

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Set<Integer> numSet = new HashSet<>();
        System.out.println("Unique Number Checker");
        System.out.println("======================");
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Press 1 to continue entering number.");
            System.out.println("Press 0 to stop entering number.");
            System.out.println("Choose your option:");
            int opt = sc.nextInt();
            switch(opt) {
                case 0:
                    break;
                case 1:
                    System.out.println("Enter an integer number:");
                    int num = sc.nextInt();
                    if(numSet.contains(num)) {
                        System.out.println(num + " : duplicate");
                    } else {
                        System.out.println(num + " : unique");
                    }

                    numSet.add(num);
            }
        }
    }
}