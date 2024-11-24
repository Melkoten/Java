public class Main {
    public static void main(String[] args) {
        Variants();
    }
    enum Num {
        ONE, TWO, THREE
    }
    private static void Variants() {
        int number = 1;
        switch (number) {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
                break;
            default:
                System.out.println("Other");
        }

        String vehicle = "Car";
        switch (vehicle) {
            case "Car":
                System.out.println("It's a car");
                break;
            case "Motorcycle":
                System.out.println("It's a motorcycle");
                break;
            default:
                System.out.println("Other");
        }

        Num num = Num.ONE;
        switch (num) {
            case ONE:
                System.out.println("One");
                break;
            case TWO:
                System.out.println("Two");
                break;
            case THREE:
                System.out.println("Blue color");
                break;
        }
    }
}