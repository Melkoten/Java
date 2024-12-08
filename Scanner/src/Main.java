import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
        File filename = new File("input.txt");
            Scanner scanner = new Scanner(filename);
            while (scanner.hasNextLine()) {
                String temp = scanner.nextLine();
                System.out.println(temp);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }

    }
}