package Homeworks.TextProcessingAndRegexAPI;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Niki on 2.4.2016 г..
 */
public class Problem4_CountAllWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Pattern pattern = Pattern.compile("(\\w+)");
        Matcher matcher = pattern.matcher(input);
        int count = 0;
        while (matcher.find()){
            count++;
        }
        System.out.println(count);
    }
}
