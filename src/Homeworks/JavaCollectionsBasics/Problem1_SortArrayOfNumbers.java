package Homeworks.JavaCollectionsBasics;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Niki on 25.3.2016 г..
 */
public class Problem1_SortArrayOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        Arrays.sort(numbers);

        for (int number : numbers) {
            System.out.printf(number + " ");
        }
    }
}
