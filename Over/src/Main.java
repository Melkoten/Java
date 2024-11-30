
public class Main {
    public static void main(String[] args) {
        int ten = add(5,5);
        int eight = add(1,3,4);
        double threeandfive = add(1,2.5);
        System.out.println("standart:"+ ten);
        System.out.println("overload:"+ eight);
        System.out.println("override:"+ threeandfive);

    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static double add(double a, double b) {
        return a + b;
    }
}