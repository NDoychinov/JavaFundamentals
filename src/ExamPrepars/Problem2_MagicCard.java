package ExamPrepars;

import java.util.Scanner;

/**
 * Created by Niki on 13.4.2016 г..
 */
public class Problem2_MagicCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] hand = sc.nextLine().split(" ");
        String oddOrEven = sc.nextLine();
        String magicCard = sc.nextLine();

        int parity = oddOrEven.equals("odd") ? 1 : 0;
        String magicFace = magicCard.substring(0, magicCard.length() - 1);
        char magicSuit = magicCard.charAt(magicCard.length() - 1);
        int sum = 0;
        for (int i = parity; i < hand.length; i+= 2) {
            int currSum = 0;
            String face = hand[i].substring(0, hand[i].length() - 1);
            char suit = hand[i].charAt(hand[i].length() - 1);

            if (face.equals("J")){
                currSum = 120;
            }else if (face.equals("Q")){
                currSum = 130;
            }else if (face.equals("K")){
                currSum = 140;
            }else if (face.equals("A")){
                currSum = 150;
            }else{
                currSum = Integer.parseInt(face) * 10;
            }

            if (suit == magicSuit){
                currSum *= 2;
            }else if (face.equals(magicFace)){
                currSum *= 3;
            }
            sum += currSum;
        }
        System.out.println(sum);
    }
}
