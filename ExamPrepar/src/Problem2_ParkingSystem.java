import java.util.Scanner;

/**
 * Created by Niki on 16.4.2016 г..
 */
public class Problem2_ParkingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        sc.nextLine();

        boolean[][] matrix = new boolean[rows][cols];
        String[] info = sc.nextLine().split(" ");

        while (!info[0].equals("stop")) {
            int entryRow = Integer.parseInt(info[0]);
            int parkX = Integer.parseInt(info[1]);
            int parkY = Integer.parseInt(info[2]);
            int moves = Math.abs(parkX - entryRow) + 1;

            if (!matrix[parkX][parkY]) {
                moves += parkY;
                matrix[parkX][parkY] = true;
                System.out.println(moves);
            } else {
                int leftSlots = parkY - 1;
                int rightSlots = cols - (parkY + 1);
                boolean placeFound = false;

                for (int i = 1; i <= Math.max(leftSlots, rightSlots); i++) {
                    if (parkY - i > 0 && !matrix[parkX][parkY - i]) {
                        placeFound = true;
                        matrix[parkX][parkY - i] = true;
                        moves += parkY - i;
                        break;
                    } else if (parkY + i < cols && !matrix[parkX][parkY + i]) {
                        placeFound = true;
                        matrix[parkX][parkY + i] = true;
                        moves += parkY + i;
                        break;
                    }
                }
                if (placeFound) {
                    System.out.println(moves);
                } else {
                    System.out.printf("Row %d full%n", parkX);
                }
            }
            info = sc.nextLine().split(" ");
        }
    }
}
