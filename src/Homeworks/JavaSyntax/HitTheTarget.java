package Homeworks.JavaSyntax;

import java.util.Scanner;

/**
 * Created by Niki on 18.3.2016 г..
 */
public class HitTheTarget {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int target = sc.nextInt();

        for (int i = 1; i <= 20; i++) {
            for (int j = 1; j <= 20; j++) {
                if (i + j == target){
                    System.out.printf("%d + %d = %d\n", i, j, target);
                }
                if (i - j == target){
                    System.out.printf("%d - %d = %d\n", i, j, target);
                }
            }
        }
    }
}
