package Homeworks.TextProcessingAndRegexAPI;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Niki on 2.4.2016 г..
 */
public class Problem1_ExtractEmails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Pattern pattern = Pattern.compile("[a-zA-Z0-9]+[_.-]*[A-Za-z0-9]+[@][-a-zA-z.]+[.][a-zA-z]+");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
