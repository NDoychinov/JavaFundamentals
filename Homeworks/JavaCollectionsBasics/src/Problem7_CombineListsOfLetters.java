import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Niki on 27.3.2016 г..
 */
public class Problem7_CombineListsOfLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] letters1 = sc.nextLine().replace(" ", "").toCharArray();
        char[] letters2 = sc.nextLine().replace(" ", "").toCharArray();
        List<Character> finalLetters = new ArrayList<>();
        for (int i = 0; i < letters1.length; i++) {
            finalLetters.add(letters1[i]);
        }
        for (int i = 0; i < letters2.length; i++) {
            if (new String(letters1).indexOf(letters2[i]) == -1){
                finalLetters.add(letters2[i]);
            }
        }
        for (Character letter : finalLetters) {
            System.out.printf("%s ", letter);
        }
    }
}
