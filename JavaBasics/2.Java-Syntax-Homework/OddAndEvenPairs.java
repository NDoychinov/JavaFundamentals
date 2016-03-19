import java.util.Scanner;

/**
 * Created by Niki on 18.3.2016 г..
 */
public class OddAndEvenPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" ");
        int[] numbers = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        if (numbers.length % 2 == 1){
            System.out.println("Invalid length");
        }else {
            for (int i = 0; i < numbers.length; i+=2) {
                int firstNum = numbers[i];
                int secondNum = numbers[i + 1];
                if (firstNum % 2 == 0 && secondNum % 2 == 0){
                    System.out.printf("%d, %d -> both are even\n", firstNum, secondNum);
                }else if (firstNum % 2 == 1 && secondNum % 2 == 1){
                    System.out.printf("%d, %d -> both are odd\n", firstNum, secondNum);
                }else {
                    System.out.printf("%d, %d -> different\n", firstNum, secondNum);
                }
            }
        }
    }
}
