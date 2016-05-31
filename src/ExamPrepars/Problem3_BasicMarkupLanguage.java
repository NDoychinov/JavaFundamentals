package ExamPrepars;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem3_BasicMarkupLanguage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        Pattern check = Pattern.compile("(inverse|reverse|repeat|stop)");
        Pattern expr1 = Pattern.compile("(repeat).*(?:\")(\\d+)(?:\").*(?:\")(.*)(?:\")");
        Pattern expr2 = Pattern.compile("(inverse|reverse).*(?:\")(.*)(?:\")");
        Matcher matcher = check.matcher(input);
        matcher.find();

        int count = 1;
        while (!matcher.group(1).equals("stop")) {
            if (matcher.group(1).equals("repeat")) {
                matcher = expr1.matcher(input);
                matcher.find();
            } else {
                matcher = expr2.matcher(input);
                matcher.find();
            }
            String command = matcher.group(1);
            if (command.equals("inverse") && isWhite(matcher.group(2))) {
                System.out.printf(count + ". ");
                count++;
                for (int i = 0; i < matcher.group(2).length(); i++) {
                    if (Character.isLowerCase(matcher.group(2).charAt(i))) {
                        System.out.print(matcher.group(2).toUpperCase().charAt(i));
                    } else {
                        System.out.print(matcher.group(2).toLowerCase().charAt(i));
                    }
                }
                System.out.println();
            } else if (command.equals("reverse") && isWhite(matcher.group(2))) {
                System.out.printf(count + ". ");
                count++;
                for (int i = matcher.group(2).length() - 1; i >= 0; i--) {
                    System.out.print(matcher.group(2).charAt(i));
                }
                System.out.println();
            } else if (command.equals("repeat") && isWhite(matcher.group(3))) {
                for (int i = 0; i < Integer.parseInt(matcher.group(2)); i++) {
                    System.out.printf(count + ". ");
                    count++;
                    System.out.println(matcher.group(3));
                }
            }

            input = sc.nextLine();
            matcher = check.matcher(input);
            matcher.find();
        }
    }

    public static boolean isWhite(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 32) {
                count++;
            }
        }
        if (count == str.length()) {
            return false;
        } else {
            return true;
        }
    }
}
