package ExamPrepars;

import java.util.Scanner;

/**
 * Created by Niki on 13.4.2016 г..
 */
public class Problem1_Enigma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        sc.nextLine();
        String[] decripted = new String[count];

        for (int i = 0; i < count; i++) {
            String encripted = sc.nextLine();
            String sentance = "";

            int length = 0;
            for (int k = 0; k < encripted.length(); k++) {
                char currChar = encripted.charAt(k);
                if (!(currChar > 47 && currChar < 58) && !(currChar == ' ')) {
                    length++;
                }
            }

            for (int j = 0; j < encripted.length(); j++) {
                char currChar = encripted.charAt(j);
                if (!(currChar > 47 && currChar < 58) && !(currChar == ' ')) {
                    sentance += (char)(currChar + length / 2);
                }else {
                    sentance += (char)currChar;
                }
            }
            decripted[i] = sentance;
        }

        for (int i = 0; i < count; i++) {
            System.out.println(decripted[i]);
        }
    }
}
