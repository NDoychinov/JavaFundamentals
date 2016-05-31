package Homeworks.JavaStreams;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Niki on 23.3.2016 г..
 */
public class Problem2_AllCapitals {
    public static void main(String[] args) {
        List<String> allLines = new ArrayList<String>();
        try(BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\niki\\IdeaProjects\\JavaFundamentals\\src\\Homeworks\\JavaStreams\\AllCapitals.txt"))){
            String line = reader.readLine();
            while (line != null){
                allLines.add(line.toUpperCase());
                line = reader.readLine();
            }
        }catch (IOException ex){
            System.out.println(ex);
        }

        try ( BufferedWriter writer = new BufferedWriter(new FileWriter("AllCapitals.txt"))){
            for (int i = 0; i < allLines.size(); i++) {
                writer.write(allLines.get(i) + "\r\n");
            }
        }catch (IOException ex){
            System.out.println(ex);
        }
    }
}
