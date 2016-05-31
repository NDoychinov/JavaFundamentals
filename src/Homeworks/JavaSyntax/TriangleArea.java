package Homeworks.JavaSyntax;

import java.util.Locale;
import java.util.Scanner;

/**
 * Created by Niki on 16.3.2016 г..
 */
public class TriangleArea {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner sc = new Scanner(System.in);

        int firstY = sc.nextInt();
        int firstX = sc.nextInt();
        int secondY = sc.nextInt();
        int secondX = sc.nextInt();
        int thirdY = sc.nextInt();
        int thirdX = sc.nextInt();

        double area = Math.abs((firstX *(secondY - thirdY) + secondX * (thirdY - firstY) + thirdX * (firstY - secondY)) / 2);
        System.out.println(Math.round(area));
    }
}
