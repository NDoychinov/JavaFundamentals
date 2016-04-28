import java.util.Scanner;

/**
 * Created by Niki on 25.3.2016 г..
 */
public class Problem3_LargestSequenceOfEqualStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = sc.nextLine().split(" ");

        int count = 1;
        int largestCount = 0;
        String word = "";
        for (int i = 0; i < words.length; i++) {
            if (i != words.length - 1 && words[i].equals(words[i + 1])){
                count++;
            }else {
                count = 1;
            }
            if (largestCount < count){
                largestCount = count;
                word = words[i];
            }
        }
        for (int i = 0; i < largestCount; i++) {
            System.out.printf(word + " ");
        }
    }
}
