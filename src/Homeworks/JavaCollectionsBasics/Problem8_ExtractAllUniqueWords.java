package Homeworks.JavaCollectionsBasics;

import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created by Niki on 27.3.2016 г..
 */
public class Problem8_ExtractAllUniqueWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String[] words = sentence.split("[[ ]*|[']*|[:]*|[(]*|[)]*|[,]*|[\\.]*|[/]*|[!]*|[?]*|[-]*]+");
        TreeSet<String> extractWords = new TreeSet<>();
        for (int i = 0; i < words.length; i++) {
            extractWords.add(words[i].toLowerCase());
        }
        for (String word : extractWords) {
            System.out.printf("%s ", word);
        }
    }
}
