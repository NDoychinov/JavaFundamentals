import java.io.*;

/**
 * Created by Niki on 23.3.2016 г..
 */
public class Problem3_CountCharacters {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("words.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("count-chars.txt"))){
            char[] vowels = {'a', 'e', 'i', 'o', 'u'};
            char[] consonants = { 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v','w', 'x', 'y', 'z'};
            char[] punctuation = {'!', ',', '.', '?'};
            String line = reader.readLine();
            int vowelsCount = 0;
            int consoCount = 0;
            int punctCount = 0;
            while (line != null) {
                for (int i = 0; i < line.length(); i++) {
                    char currLetter = Character.toLowerCase(line.charAt(i));
                    if (!(new String(vowels).indexOf(currLetter) == -1)) {
                        vowelsCount++;
                    } else if (!(new String(consonants).indexOf(currLetter) == -1)) {
                        consoCount++;
                    } else if (!(new String(punctuation).indexOf(currLetter) == -1)) {
                        punctCount++;
                    }
                }
                line = reader.readLine();
            }
            writer.write("Vowels: " + vowelsCount + "\r\n");
            writer.write("Consonants: " + consoCount + "\r\n");
            writer.write("Punctuation: " + punctCount + "\r\n");
        }catch (IOException ex){
            System.out.println(ex);
        }
    }
}
