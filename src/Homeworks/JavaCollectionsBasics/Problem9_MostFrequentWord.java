package Homeworks.JavaCollectionsBasics;

import java.util.*;

/**
 * Created by Niki on 27.3.2016 г..
 */
public class Problem9_MostFrequentWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String[] words = sentence.split("[[ ]*|[']*|[:]*|[(]*|[)]*|[,]*|[\\.]*|[/]*|[!]*|[?]*|[-]*]+");

        TreeMap<String, Integer> myMap = new TreeMap<>();
        int wordsCount = 0;
        int biggestWord = 0;
        for (int i = 0; i < words.length; i++) {
            wordsCount = 0;
            for (int j = 0; j < words.length; j++) {
                if (words[i].toLowerCase().equals(words[j].toLowerCase())){
                    wordsCount++;
                }
            }
            myMap.put(words[i].toLowerCase(), wordsCount);
            if (biggestWord < wordsCount){
                biggestWord = wordsCount;
            }
        }
        for (Map.Entry<String, Integer> data : myMap.entrySet()) {
            if (data.getValue() == biggestWord){
                System.out.printf("%s -> %d times\r\n", data.getKey(), data.getValue());
            }
        }
    }
}
