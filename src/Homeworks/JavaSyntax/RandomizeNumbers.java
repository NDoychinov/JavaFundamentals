package Homeworks.JavaSyntax;

import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Created by Niki on 17.3.2016 г..
 */
public class RandomizeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int max;
        int min;
        if (num1 > num2){
            max = num1;
            min = num2;
        }else{
            max = num2;
            min = num1;
        }

        int[] randomNums = new int[max - min + 1];

        for (int i = 0; i < max - min + 1; i++) {
            Random rnd = new Random();
            do {
                int randomNum = rnd.nextInt((max - min) + 1) + min;
                if (!IntStream.of(randomNums).anyMatch(x -> x == randomNum)){
                    randomNums[i] = randomNum;
                }
            }while (randomNums[i] == 0);
        }

        for (int num : randomNums) {
            System.out.print(num + " ");
        }
    }
}
