public class Main {
    public static int a = 1;
    public static int b;

    public static void printVars() {
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
    static {
        printVars();
    }
    public void nonstatic() {
        printVars();
    }
    public static void doublestatic() {
        printVars();
    }

    public static void main(String[] args) {
        Main.printVars();
        Main temp = new Main();
        temp.printVars();
        Main.doublestatic();
        temp.nonstatic();
    }
}