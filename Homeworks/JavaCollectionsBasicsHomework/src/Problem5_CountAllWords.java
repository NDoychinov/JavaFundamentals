import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Niki on 26.3.2016 г..
 */
public class Problem5_CountAllWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        char currChar;
        char lastChar = ' ';
        int wordCount = 0;
        for (int i = 0; i < sentence.length(); i++) {
           currChar = sentence.charAt(i);
           if (!Character.isLetter(lastChar) && Character.isLetter(currChar)){
                wordCount++;
           }
            lastChar = currChar;
        }
        System.out.println(wordCount);
    }
}
