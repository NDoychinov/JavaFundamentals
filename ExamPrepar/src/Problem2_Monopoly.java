import java.util.Scanner;

/**
 * Created by Niki on 7.4.2016 г..
 */
public class Problem2_Monopoly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int width = sc.nextInt();
        sc.nextLine();

        String wholeTable = "";
        for (int i = 0; i < height; i++) {
            String col = sc.nextLine();

            if (i % 2 == 0) {
                wholeTable += col;
            } else {
                wholeTable += reversedCol(col);
            }
        }

        int money = 50;
        int salary = 0;
        int totalHotels = 0;
        int turnsCounter = 0;
        for (int i = 0; i < wholeTable.length(); i++) {
            money += salary;
            turnsCounter++;
            char currStep = wholeTable.charAt(i);

            if (currStep == 'H') {
                salary += 10;
                totalHotels++;
                System.out.printf("Bought a hotel for %d. Total hotels: %d.\n", money, totalHotels);
                money = 0;
            } else if (currStep == 'J') {
                System.out.printf("Gone to jail at turn %d.\n", turnsCounter - 1);
                money += salary * 2;
                turnsCounter += 2;
            } else if (currStep == 'S') {
                int row = (int) Math.ceil((i + 1) / (double) width);
                int col;
                if (row % 2 == 1){
                    col = (i + 1) - ((row - 1) * width);
                }else {
                    col = (width + 1) - ((i + 1) - ((row - 1) * width));
                }

                if (money - row * col >= 0) {
                    money -= row * col;
                    System.out.printf("Spent %d money at the shop.\n", row * col);
                } else {
                    System.out.printf("Spent %d money at the shop.\n", money);
                    money = 0;
                }
            }
        }
        money += salary;
        System.out.println("Turns " + turnsCounter);
        System.out.println("Money " + money);
    }

    public static String reversedCol(String col) {
        String reversed = "";
        for (int i = col.length() - 1; i >= 0; i--) {
            reversed += col.charAt(i);
        }
        return reversed;
    }
}
