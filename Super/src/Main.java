class FirstClass {
    int temp;

    FirstClass(int temp) {
        this.temp = temp;
    }
    void showInt() {
        System.out.println("Int: " + temp);
    }
}

class SecondClass extends FirstClass {
    int temp2;

    SecondClass(int temp, int temp2) {
        super(temp);
        this.temp2 = temp2;
    }

    void showInt2() {
        System.out.println("Int2: " + temp2);
    }

    void showInt1ByTwoWays() {
        super.showInt();
        System.out.println("Int: " +  super.temp);
    }
}

public class Main {
    public static void main(String[] args) {
        SecondClass A = new SecondClass(1, 2);
        A.showInt1ByTwoWays();
        A.showInt2();
    }
}