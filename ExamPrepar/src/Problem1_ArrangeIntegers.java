import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem1_ArrangeIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> numbers = Arrays.asList(sc.nextLine().split("[, ]+")).stream().sorted((e1, e2) -> numsAsWords(e1).compareTo(numsAsWords(e2))).collect(Collectors.toList());
        System.out.println(String.join(", ", numbers));
    }

    public static String numsAsWords(String str) {
        String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String wordString = "";
        for (int i = 0; i < str.length(); i++) {
            wordString += words[str.charAt(i) - 48];
        }
        return wordString;
    }
}
