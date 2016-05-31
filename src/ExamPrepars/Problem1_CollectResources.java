package ExamPrepars;

import java.util.Scanner;

/**
 * Created by Niki on 6.5.2016 г..
 */
public class Problem1_CollectResources {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] line = sc.nextLine().split(" ");
        int paths = sc.nextInt();
        sc.nextLine();

        int[] path = new int[line.length];

        for (int i = 0; i < line.length; i++) {
            String material = line[i].split("_")[0];
            int amount;
            try {
                amount = Integer.parseInt(line[i].split("_")[1]);
            } catch (Exception e) {
                amount = 1;
            }

            if (material.equals("wood") || material.equals("gold") || material.equals("stone") || material.equals("food")) {
                path[i] = amount;
            } else {
                path[i] = 0;
            }
        }

        int largest = 0;
        for (int i = 0; i < paths; i++) {
            int[] copy = path.clone();
            int sum = 0;
            int start = sc.nextInt();
            int step = sc.nextInt();
            sc.nextLine();
            int currStep = start;
            while (true) {
                if (copy[currStep] != 0) {
                    sum += copy[currStep];
                    copy[currStep] = -1;
                }
                currStep = (currStep + step) % copy.length;
                if (copy[currStep] == -1) {
                    break;
                }
            }

            if (sum >= largest) {
                largest = sum;
            }
        }
        System.out.println(largest);
    }
}
