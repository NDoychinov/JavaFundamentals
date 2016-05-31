package Homeworks.JavaCollectionsBasics;

import java.util.Scanner;

/**
 * Created by Niki on 26.3.2016 г..
 */
public class Problem6_CountSpecifiedWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String lookWord = sc.nextLine().toLowerCase();
        String[] words = sentence.split("[[ ]*|[']*|[(]*|[)]*|[,]*|[\\.]*|[/]*|[!]*|[?]*|[-]*]+");
        int wordCount = 0;
        for (int i = 0; i < words.length; i++) {
            if (lookWord.equals(words[i].toLowerCase())){
                wordCount++;
            }
        }
        System.out.println(wordCount);
    }
}
