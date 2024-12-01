public class Main {
    public static void main(String[] args) {
        Main multiplicator = new Main();
        System.out.println(multiplicator.mult(2, 3));
        System.out.println(multiplicator.mult(6, 2, 3, 4, 5));
        System.out.println(multiplicator.mult(1.1, 2.2, 3.3, 4.4));
    }
    public int mult(int a, int b) {
        return a * b;
    }

    public int mult(int... args) {
        int mult = 1;
        for (int arg : args) {
            mult = mult*arg;
        }
        return mult;
    }

    public double mult(double... args) {
        double mult = 1.0;
        for (double arg : args) {
            mult = mult*arg;
        }
        return mult;
    }
}