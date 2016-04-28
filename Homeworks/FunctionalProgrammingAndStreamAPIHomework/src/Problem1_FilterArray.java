import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by Niki on 28.3.2016 г..
 */
public class Problem1_FilterArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = sc.nextLine().split(" ");

        List<String> filterWords = Arrays.stream(words).filter(c -> c.length() > 3).collect(Collectors.toList());
        if (filterWords.size() > 0) {
            for (String s : filterWords) {
                System.out.printf("%s ", s);
            }
        } else {
            System.out.println("(empty)");
        }
    }
}
