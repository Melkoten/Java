interface Interface {
    static class NestedClass {
        public void show() {
            System.out.println("Nested");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Interface.NestedClass nestedClass = new Interface.NestedClass();
        nestedClass.show();
    }
}