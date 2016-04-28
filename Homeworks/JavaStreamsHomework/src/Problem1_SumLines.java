import java.io.*;

/**
 * Created by Niki on 23.3.2016 г..
 */
public class Problem1_SumLines {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("SumLines.txt"))){
            String line = reader.readLine();
            int sum = 0;
            while (line != null){
                for (int i = 0; i < line.length(); i++) {
                    sum += line.charAt(i);
                }
                System.out.println(sum);
                sum = 0;
                line = reader.readLine();
            }
        }catch (IOException ex){
            System.out.println(ex);
        }
    }
}
