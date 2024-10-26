
public class Main {
    public static void main(String[] args) {
        practice1();
        practice2();
        practice3();
        practice4();
    }
    private static void practice1() {
        System.out.println("Задание 1");
        String orig = "Perm";
        String decoded = java.util.Base64.getEncoder().encodeToString(orig.getBytes());
        System.out.println(decoded);
        byte[] decodedBytes = java.util.Base64.getDecoder().decode(decoded);
        String decodedString = new String(decodedBytes);
        System.out.println(decodedString);
    }

    private static void practice2() {
        System.out.println("\nЗадание 2");
        Boolean bool1 = Boolean.valueOf(false);
        Boolean bool2 = Boolean.valueOf("true");
        boolean bool = true;
        Boolean bool3 = bool;
        System.out.println("bool1: " + bool1);
        System.out.println("bool2: " + bool2);
        System.out.println("bool3: " + bool3);
    }

    private static void practice3() {
        System.out.println("\nЗадание 3");
        Integer nullint = null;
        try {
            int value = nullint; // Это приведет к NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Обнаружен null pointer " + e);
        }
    }

    private static void practice4() {
        System.out.println("\nЗадание 4");

        int i1 = 128;
        Integer a1 = i1;
        Integer b1 = i1;
        System.out.println("a1==i1 " + (a1 == i1));
        System.out.println("b1==i1 " + (b1 == i1));
        System.out.println("a1==b1 " + (a1 == b1));
        System.out.println("a1.equals(i1) -> " + a1.equals(i1));
        System.out.println("b1.equals(i1) -> " + b1.equals(i1));
        System.out.println("a1.equals(b1) -> " + a1.equals(b1));

        int i2 = 127;
        Integer a2 = i2;
        Integer b2 = i2;
        System.out.println("a2==i2 " + (a2 == i2));
        System.out.println("b2==i2 " + (b2 == i2));
        System.out.println("a2==b2 " + (a2 == b2));
        System.out.println("a2.equals(i2) -> " + a2.equals(i2));
        System.out.println("b2.equals(i2) -> " + b2.equals(i2));
        System.out.println("a2.equals(b2) -> " + a2.equals(b2));
    }
}