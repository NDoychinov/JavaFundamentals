import java.util.Scanner;

/**
 * Created by Niki on 17.3.2016 г..
 */
public class BaseSevenToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String base7 = sc.next();
        int decimal = Integer.valueOf(base7, 7);
        System.out.println(decimal);
    }
}
