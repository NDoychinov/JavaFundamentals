import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Niki on 2.4.2016 г..
 */
public class Problem5_ExtractWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Pattern pattern = Pattern.compile("[A-Za-z]+");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()){
            System.out.print(matcher.group() + " ");
        }
    }
}
