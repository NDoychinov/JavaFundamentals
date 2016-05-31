package Homeworks.JavaCollectionsBasics;

import java.util.Scanner;

/**
 * Created by Niki on 28.3.2016 г..
 */
public class Problem12_CalculateFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = factorial(n);
        System.out.println(result);
    }

    public static int factorial(int n){
        if (n == 0){
            return 1;
        }
        int result = n * factorial(n - 1);
        return  result;
    }
}
