import java.util.Locale;
import java.util.Scanner;

/**
 * Created by Niki on 16.3.2016 г..
 */
public class FormattingNumbers {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        String hexValue = Integer.toHexString(a).toUpperCase();
        String binaryValue = Integer.toBinaryString(a);
        String paddedBinary = "0000000000".substring(binaryValue.length()) + binaryValue;

        System.out.format("|%-10s|%s|%10s|%-10s|", hexValue, paddedBinary, String.format("%.2f", b), String.format("%.3f", c));
    }
}
