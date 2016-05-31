package Homeworks.IntroJava;

import java.util.Scanner;

/**
 * Created by Niki on 14.3.2016 г..
 */
public class CharacterTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char)('a' + j) + " ");
            }
            System.out.println();
        }
        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char)('a' + j) + " ");
            }
            System.out.println();
        }
    }


}
