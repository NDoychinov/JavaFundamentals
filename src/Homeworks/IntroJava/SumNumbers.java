package Homeworks.IntroJava;

import java.util.Scanner;

/**
 * Created by Niki on 14.3.2016 г..
 */
public class SumNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
