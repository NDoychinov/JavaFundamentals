package Homeworks.JavaCollectionsBasics;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Niki on 25.3.2016 г..
 */
public class Problem4_LongestIncreasingSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputAsString = sc.nextLine().split(" ");
        int[] inputNums = new int[inputAsString.length];
        for (int i = 0; i < inputNums.length; i++) {
            inputNums[i] = Integer.parseInt(inputAsString[i]);
        }

        ArrayList<ArrayList<Integer>> sequences = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < inputNums.length; i++) {
            numbers.add(inputNums[i]);
            if (i != inputNums.length - 1 && inputNums[i] >= inputNums[i + 1]){
                sequences.add(numbers);
                numbers = new ArrayList<>();
            }
            if (i == inputNums.length - 1){
                sequences.add(numbers);
            }
        }

        int longestSequence = 0;
        int indexLongest = 0;
        for (int i = 0; i < sequences.size(); i++) {
            for (int j = 0; j < sequences.get(i).size(); j++) {
                System.out.print(sequences.get(i).get(j) + " ");
            }
            System.out.println();
            if (sequences.get(i).size() > longestSequence){
                longestSequence = sequences.get(i).size();
                indexLongest = i;
            }
        }

        System.out.printf("Longest: ");
        for (int i = 0; i < sequences.get(indexLongest).size(); i++) {
            System.out.printf("%d ", sequences.get(indexLongest).get(i));
        }
    }
}
