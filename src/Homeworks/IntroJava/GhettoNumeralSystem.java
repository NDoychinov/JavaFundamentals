package Homeworks.IntroJava;

import java.util.Scanner;

/**
 * Created by Niki on 15.3.2016 г..
 */
public class GhettoNumeralSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] numAsChars = sc.next().toCharArray();
        String ghettoNum = "";
        for (int i = 0; i < numAsChars.length; i++) {
            switch (numAsChars[i]){
                case '0':
                    ghettoNum += "Gee";
                    break;
                case '1':
                    ghettoNum += "Bro";
                    break;
                case '2':
                    ghettoNum += "Zuz";
                    break;
                case '3':
                    ghettoNum += "Ma";
                    break;
                case '4':
                    ghettoNum += "Duh";
                    break;
                case '5':
                    ghettoNum += "Yo";
                    break;
                case '6':
                    ghettoNum += "Dis";
                    break;
                case '7':
                    ghettoNum += "Hood";
                    break;
                case '8':
                    ghettoNum += "Jam";
                    break;
                case '9':
                    ghettoNum += "Mack";
                    break;
            }
        }
        System.out.println(ghettoNum);
    }
}
