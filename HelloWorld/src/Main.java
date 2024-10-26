//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.printf("Please, say your name \n");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.printf("Hello, ");
        System.out.print(name);
    }
}