public class Main {
    public static void main(String[] args) {
        SubToNotFinal second = new SubToNotFinal();
        second.method();

        FinalClass finalClass = new FinalClass();
    }
}

class NotFinalClass {
    public final void method() {
        System.out.println("NotFinalClassMethod");
    }
}

class SubToNotFinal extends NotFinalClass {
    /*
    @Override
    public void method() {
        System.out.println("SubToNotFinal");
    }
    */
}

final class FinalClass {
}

/*
class SubClassFinal extends FinalClass {
}
*/