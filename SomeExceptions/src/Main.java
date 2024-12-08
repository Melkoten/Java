class Ex1 extends Exception {}
class Ex2 extends Ex1 {}
class Ex3 extends Ex2 {}

public class Main {
    public static void process(int value) throws Ex1 {
        if (value == 1) {
            throw new Ex1();
        } else if (value == 2) {
            throw new Ex2();
        } else if (value == 3) {
            throw new Ex3();
        }
    }
    public static void main(String[] args) {
        // Обработка нескольких исключений идентично
        for (int i = 1; i <= 3; i++) {
            try {
                process(i);
            } catch (Ex1 e) {
                System.out.println("Обработано исключение Ex1 или его подклассы.");
            }
        }
        // Обработка иерархии исключений
        try {
            process(3);
        } catch (Ex1 e) {
            System.out.println("Обработано исключение Ex1 или его подклассы: " + e);
        }
    }
}