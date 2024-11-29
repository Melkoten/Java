//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int i = 0;
        System.out.println(i);
        while (i<=5) {
            i++;
            System.out.println(i);
        }
        int j = 0;
        System.out.println(j);
        do {
            j++;
            System.out.println(j);
        } while (j<=5);
        for (int k = 0; k < 10; k++) {
            if (k == 5) {
                System.out.println("break");
                break;
            }
            System.out.println(k);
        }
        for (int l = 0; l < 10; l++) {
            if (l == 5) {
                continue;
            }
            System.out.println(l);
        }
    }
}