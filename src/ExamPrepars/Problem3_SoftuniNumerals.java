package ExamPrepars;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Niki on 4.4.2016 г..
 */
public class Problem3_SoftuniNumerals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String numBase5 = "";

        for (int i = 0; i < input.length(); i++) {
            String str = "";
            str += input.charAt(i);
            str += input.charAt(i +  1);
            if (str.equals("aa") || str.equals("cc")){
                if (str.equals("aa")){
                    numBase5 += "0";
                }
                else{
                    numBase5 += "3";
                }
                i += 1;
            }
            else{
                str += input.charAt(i + 2);
                if (str.equals("aba")){
                    numBase5 += "1";
                }else if (str.equals("bcc")){
                    numBase5 += "2";
                }
                else if (str.equals("cdc")){
                    numBase5 += "4";
                }
                i += 2;
            }
        }
        System.out.println(new BigInteger(numBase5, 5));
    }
}
