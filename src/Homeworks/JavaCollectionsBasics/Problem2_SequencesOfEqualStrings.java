package Homeworks.JavaCollectionsBasics;

import java.util.Scanner;

/**
 * Created by Niki on 25.3.2016 г..
 */
public class Problem2_SequencesOfEqualStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = sc.nextLine().split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.printf(words[i] + " ");
            if (i != words.length - 1 && !words[i].equals(words[i + 1])){
                System.out.println();
            }
        }
    }
}
