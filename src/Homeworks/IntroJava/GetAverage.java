package Homeworks.IntroJava;

import java.util.Scanner;

/**
 * Created by Niki on 15.3.2016 г..
 */
public class GetAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double result = average(a, b, c);
        System.out.format("%.2f", result);
    }

    public static double average(double num1, double num2, double num3){
        double calc = (num1 + num2 + num3) / 3;
        return calc;
    }
}
