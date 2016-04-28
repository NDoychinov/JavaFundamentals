import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Niki on 25.3.2016 г..
 */
public class Problem5_ArrayListOfDoubles {
    public static void main(String[] args) {
        ArrayList<Double> numsIn = new ArrayList<>();
        try(ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("doubles.list")))){
            numsIn.add(15.4);
            numsIn.add(11.56);
            numsIn.add(124.47);
            oos.writeObject(numsIn);
        }catch (IOException ex){
            System.out.println(ex);
        }

        try(ObjectInputStream ois  = new ObjectInputStream(new BufferedInputStream(new FileInputStream("doubles.list")))){
            System.out.println(ois.readObject());
        }catch (IOException ex){
            System.out.println(ex);
        }catch (ClassNotFoundException ex1){
            System.out.println(ex1);
        }
    }
}
