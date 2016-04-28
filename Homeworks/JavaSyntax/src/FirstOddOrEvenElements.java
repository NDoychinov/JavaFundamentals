import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Niki on 19.3.2016 г..
 */
public class FirstOddOrEvenElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" ");
        int[] numbers = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        String[] info = sc.nextLine().split(" ");
        int elements = Integer.parseInt(info[1]);
        String oddOrEven = info[2];

        List<Integer> result = getElements(numbers, elements, oddOrEven);
        for (Integer num : result) {
            System.out.printf("%d ", num);
        }
    }

    static List<Integer> getElements(int[] numbers, int numOfElements, String evenOrOdd){
        List<Integer> elements = new ArrayList<Integer>();
        int count = 0;
        for (int i = 0; i < numbers.length && count < numOfElements; i++) {
            if (evenOrOdd.equals("even") && numbers[i] % 2 == 0){
                elements.add(numbers[i]);
                count++;
            }else if (evenOrOdd.equals("odd") && numbers[i] % 2 == 1){
                elements.add(numbers[i]);
                count++;
            }
        }
        return  elements;
    }
}
