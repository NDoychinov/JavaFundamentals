import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Niki on 27.3.2016 г..
 */
public class Problem10_CardsFrequencies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split("[[ ]*|[♥]*|[♣]*|[♦]*|[♠]*]+");

        LinkedHashMap<String, Integer> cards = new LinkedHashMap<>();
        int wordCount = 0;
        for (int i = 0; i < input.length; i++) {
            wordCount = 0;
            for (int j = 0; j < input.length; j++) {
                if (input[i].equals(input[j])){
                    wordCount++;
                }
            }
            cards.put(input[i], wordCount);
        }
        for (Map.Entry<String, Integer> data : cards.entrySet()) {
            System.out.printf("%s -> %.2f%%\r\n", data.getKey(), ((double)data.getValue() / input.length) * 100);
        }
    }
}
