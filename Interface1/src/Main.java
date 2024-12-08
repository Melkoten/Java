
interface Inter1 {
    default void MethodNotAbstr() {
        System.out.println("Not abstract one.");
    }
    static void MethodStat() {
        System.out.println("Static");
    }
}
interface Inter2 {
    default void MethodNotAbstr() {
        System.out.println("Not abstract two.");
    }
    static void MethodStat() {
        System.out.println("Static");
    }
}

class SimpleClass implements Inter1 {
    @Override
    public void MethodNotAbstr() {
        System.out.println("Over for not abstract");
    }
}

class WithTrouble implements Inter1, Inter2 {
    @Override
    public void MethodNotAbstr() {
        Inter1.super.MethodNotAbstr();
    }
}

public class Main {
    public static void main(String[] args) {
        SimpleClass newClass = new SimpleClass();
        newClass.MethodNotAbstr();
        Inter1.MethodStat();

        WithTrouble newWT = new WithTrouble();
        newWT.MethodNotAbstr();
    }
}