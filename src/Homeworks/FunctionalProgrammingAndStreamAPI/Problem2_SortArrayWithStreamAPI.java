package Homeworks.FunctionalProgrammingAndStreamAPI;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by Niki on 28.3.2016 г..
 */
public class Problem2_SortArrayWithStreamAPI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(sc.nextLine().split(" ")).map(p -> Integer.parseInt(p)).collect(Collectors.toList());
        String action = sc.next();

        if (action.equals("Ascending")) {
            numbers.stream().sorted().forEach(c -> {
                System.out.printf("%s ", c);
            });
        } else {
            numbers.stream().sorted(Collections.reverseOrder()).forEach(c -> {
                System.out.printf("%s ", c);
            });
        }
    }
}
