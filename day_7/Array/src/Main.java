// Store user inputs in array and print sum, average, maximum, and minimum of the values in the array

import java.util.*;

public class Main {

    public void arrayInfo(int[] arr){
        //sum and average
        int sum = 0;
        float avg;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int a : arr){
            sum += a;
            if(a > max){
                max = a;
            }
            if(a < min){
                min = a;
            }
        }
        avg = (float)sum/arr.length;

        System.out.println("Max value: " + max);
        System.out.println("Min value: " + min);
        System.out.println("Sum of all values in array: " + sum);
        System.out.println("Average of the values in array: " + avg);

    }

    public static void main(String[] args) {
        int[] tstArray = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            System.out.println("Enter number " + (i + 1) + ":");
            tstArray[i] = sc.nextInt();
        }
        Main arrObj = new Main();
        arrObj.arrayInfo(tstArray);
    }
}