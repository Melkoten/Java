import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class Main {
    public static void main(String[] args) {
        try (FileInputStream inp = new FileInputStream("input.txt")) {
            int temp;
            while ((temp = inp.read()) != -1) {
                System.out.print((char) temp);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (FileOutputStream out = new FileOutputStream("output.txt")) {
            out.write(1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}