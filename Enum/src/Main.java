
public class Main {
    public enum Motorcycles {
        Honda(false), Suzuki(false), Yamaha(false), Ural(true), BMW(false), Harley(false), KTM(false);

        private final boolean isRussian;

        Motorcycles(boolean isRussian) {
            this.isRussian = isRussian;
        }

        public boolean isRussian() {
            return isRussian;
        }
    }

    private Motorcycles[] bikes;

    public Main() {
        bikes = new Motorcycles[] {
                Motorcycles.Honda,
                Motorcycles.Suzuki,
                Motorcycles.Yamaha,
                Motorcycles.Ural,
                Motorcycles.BMW,
                Motorcycles.Harley,
                Motorcycles.KTM
        };
        System.out.println("All bikes:");
        for (Motorcycles bike : bikes) {
            System.out.println(bike);
        }
    }

    public static void main(String[] args) {
        Main printer = new Main();
        for (Motorcycles bike: printer.bikes) {
            System.out.println("Bike: " + bike +" Is it russian? " +bike.isRussian());
        }
    }
}