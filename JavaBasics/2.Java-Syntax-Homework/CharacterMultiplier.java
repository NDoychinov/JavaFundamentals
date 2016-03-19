import java.util.Scanner;

/**
 * Created by Niki on 19.3.2016 г..
 */
public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String firstWord = sc.next();
        String secondWord = sc.next();

        String longWord;
        String shortWord;
        if (firstWord.length() > secondWord.length()){
            longWord = firstWord;
            shortWord = secondWord;
        }else {
            longWord = secondWord;
            shortWord = firstWord;
        }
        System.out.println(multiplier(longWord, shortWord));
    }

    static int multiplier(String longWord, String shortWord){
        int sum = 0;
        for (int i = 0; i < shortWord.length(); i++) {
            sum += longWord.charAt(i) * shortWord.charAt(i);
        }
        for (int i = 0; i < longWord.length() - shortWord.length(); i++) {
            sum += longWord.charAt(i + shortWord.length());
        }

        return sum;
    }
}
