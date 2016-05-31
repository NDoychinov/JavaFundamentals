package Homeworks.JavaStreams;

import sun.misc.IOUtils;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;

/**
 * Created by Niki on 24.3.2016 г..
 */
public class Problem4_CopyJpgFile {
    public static void main(String[] args) {
        try(DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream("C:\\Users\\niki\\IdeaProjects\\JavaFundamentals\\src\\Homeworks\\JavaStreams\\picture.jpg")));
            DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("C:\\Users\\niki\\IdeaProjects\\JavaFundamentals\\src\\Homeworks\\JavaStreams\\my-copied-picture.jpg")))){
            byte[] buffer = new byte[4096];
            int read = 0;
            while ((read = dis.read(buffer)) != -1) {
                dos.write(buffer, 0, read);
            }
        }catch (IOException ex){
            System.out.println(ex);
        }
    }
}
