// Word Frequency Calculator
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Main {

    public void wordFrequencyCount(String[] arr) {
        if((arr.length == 1 && arr[0].isEmpty()) || arr.length == 0){
            throw new IllegalArgumentException("Kindly enter a non empty string.");
        }
        Map<String, Integer> wordFreqMap = new HashMap<>();
        for(String word : arr) {
            word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();
            word = word.replaceAll("\\p{Punct}","");
            if(!word.isEmpty()) {
                if(wordFreqMap.containsKey(word)) {
                    wordFreqMap.put(word, wordFreqMap.get(word) + 1);
                } else {
                    wordFreqMap.put(word,1);
                }
            }
        }
        System.out.println("\nWord Frequency:");
        for(Map.Entry<String, Integer> entry: wordFreqMap.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        System.out.println("Word Frequency Counter");
        System.out.println("=======================");
        System.out.println("Enter a paragraph of text:");
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] wordList = text.split("\\s+");


        Main mainObj = new Main();
        mainObj.wordFrequencyCount(wordList);
        sc.close();
    }
}