package Homeworks.TextProcessingAndRegexAPI;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Niki on 2.4.2016 г..
 */
public class Problem3_CountSpecifiedWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toLowerCase();
        String word = sc.nextLine().toLowerCase();
        Pattern pattern = Pattern.compile("(?:[ -(])(" + word + ")(?:[ ',.?)])");
        Matcher matcher = pattern.matcher(input);
        int count = 0;
        while (matcher.find()){
            count++;
        }
        System.out.println(count);
    }
}
