package Homeworks.JavaSyntax;

import java.util.Locale;
import java.util.Scanner;

/**
 * Created by Niki on 17.3.2016 г..
 */
public class CalculateExpression {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double f1Result = Math.pow((a * a + b * b) / (a * a - b * b), (a + b + c) / Math.sqrt(c));
        double f2Result = Math.pow((a * a + b * b - c * c * c), a - b);
        double diff = Math.abs((a + b + c) / 3 - (f1Result + f2Result) / 2);
        System.out.format("F1 result: %.2f; F2 result: %.2f; Diff: %.2f", f1Result, f2Result, diff);
    }
}
