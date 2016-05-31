package Homeworks.TextProcessingAndRegexAPI;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Niki on 2.4.2016 г..
 */
public class Problem6_StartsAndEndsWithCapitalLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Pattern pattern = Pattern.compile("(?:[^\\w]|^)((?:[A-Z])[a-zA-Z]*(?:[A-Z]))(?=$| )");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()){
            System.out.printf(matcher.group(1) + " ");
        }
    }
}
