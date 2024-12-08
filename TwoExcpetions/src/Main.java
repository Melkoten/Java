public class Main {
    public static void main(String[] args) {
        try {
            int temp = 1 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }

        int temp2 = 1/0;

    }
}