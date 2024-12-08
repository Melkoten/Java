public class Main {
    public static void main(String[] args) {
        try {
            int temp1 = 1 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }
        try {
            int[] array = new int[2];
            int temp2 = array[4];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
        try {
            Object obj = new Double(15.5);
            String str = (String) obj;
        } catch (ClassCastException e) {
            System.out.println("ClassCastException: " + e.getMessage());
        }
        try {
            String temp3 = null;
            int len = temp3.length();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        }
        try {
            throw new IllegalArgumentException("abc");
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: " + e.getMessage());
        }
    }
}