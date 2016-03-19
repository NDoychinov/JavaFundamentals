import java.util.Scanner;

/**
 * Created by Niki on 17.3.2016 г..
 */
public class ConvertToBaseSeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int decimal = sc.nextInt();
        String base7 = Integer.toString(decimal, 7);
        System.out.println(base7);
    }
}
