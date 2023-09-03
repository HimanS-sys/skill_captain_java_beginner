import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("This is a Simple Calculator.");
        System.out.println("Use '+' for addition.");
        System.out.println("Use '-' for subtraction.");
        System.out.println("Use '*' for multiplication.");
        System.out.println("Use '/' for division.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number:");
        int num2 = sc.nextInt();
        System.out.println("Choose operator \n '+': Add \n '-': Subtract \n '*': Multiply \n '/': Divide");
        String operator = sc.next();
        System.out.println("Operator selected: " + operator);
        float output = 0.00f;
        if(operator.equals("+")){
            output = num1+num2;
            System.out.println(num1 + operator + num2 + " = " + output);
        } else if(operator.equals("-")){
            output = num1 - num2;
            System.out.println(num1 + operator + num2 + " = " + output);
        } else if(operator.equals("*")){
            output = num1*num2;
            System.out.println(num1 + operator + num2 + " = " + output);
        } else if(operator.equals("/")){
            output = (float) num1/num2;
            System.out.println(num1 + operator + num2 + " = " + output);
        } else{
            System.out.println("Operator entered is invalid.");
        }
    }
}