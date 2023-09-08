// Program to create grocery list.
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ArrayList<String> groceryList = new ArrayList<>();
    public static void main(String[] args) {
        while(true){
            System.out.println("Grocery List Manager");
            System.out.println("==========================");
            System.out.println("Select an option to perform");
            System.out.println("1 - Add items to the grocery list");
            System.out.println("2 - Remove items from the grocery list.");
            System.out.println("3 - Print the current grocery list.");
            System.out.println("4 - Check if a specific item is already present.");
            System.out.println("5 - Clear the entire grocery list.");

            Scanner sc = new Scanner(System.in);

            int option = sc.nextInt();
            switch(option){
                case 1:
                    addItem(sc);
                    break;
                case 2:
                    removeItem(sc);
                    break;
                case 3:
                    showGroceryList();
                    break;
                case 4:
                    itemPresent(sc);
                    break;
                case 5:
                    clearAll();
                    break;
                default:
                    System.out.println("Enter a valid option.");
            }
        }
    }

    // add item to the list.
    private static void addItem(Scanner sc){
        System.out.println("Enter item name to add:");
        String item = sc.next();
        groceryList.add(item);
        System.out.println(item + " added to the grocery list.");
    }

    // remove item from the list.
    private static void removeItem(Scanner sc){
        System.out.println("Enter item name to remove:");
        String item = sc.next();
        groceryList.remove(item);
        System.out.println(item + " removed from the grocery list.");
    }

    // show grocery list.
    private static void showGroceryList(){
        System.out.println("The grocery list:");
        System.out.println(groceryList);
    }

    // check if given item is present.
    private static void itemPresent(Scanner sc){
        System.out.println("Enter item name to check if present:");
        String item = sc.next();
        boolean present = groceryList.contains(item);
        if(present){
            System.out.println("The item " + item + " is present in the grocery list.");
        } else{
            System.out.println("Item not present");
        }
    }

    // clear the grocery list.
    private static void clearAll(){
        groceryList.clear();
        System.out.println("Grocery list cleared.");
    }
}