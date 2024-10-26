public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1:");
        practice1();
        System.out.println("\nЗадание 2:");
        practice2();
    }
    private  static void practice1() {
        int x = 3;
        int y = 2;
        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + (x * y));
        System.out.println("x / y = " + (x / y));
        System.out.println("x % y = " + (x % y));
        System.out.println("++x: " + (++x));
        System.out.println("y++ : " + (y++));
        System.out.println("next step after y++ " + y);
        System.out.println("x == y: " + (x == y));
        System.out.println("x != y: " + (x != y));
        System.out.println("x > y: " + (x > y));
        System.out.println("x < y: " + (x < y));
        System.out.println("true && false: " + (true && false));
        System.out.println("true || false: " + (true || false));
        String first = "Saint";
        String second = "Petersburg";
        System.out.println("first + second = " + (first + "-" + second));
    }

    private static void practice2() {
        Object obj = (int)50;
        System.out.println("int instanceof String: " + (obj instanceof String));
        System.out.println("int instanceof int: " + (obj instanceof Integer));
        System.out.println("null instanceof Object: " + (null instanceof Object));
    }
}