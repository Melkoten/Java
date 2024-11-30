

public class Main {
    public static void main(String[] args) {
        Init first = new Init();
        Construct second = new Construct(2);
        InBody third = new InBody();
        System.out.println(first.temp);
        System.out.println(second.temp);
        System.out.println(third.temp);
    }
}

class Init {
    public final int temp = 1;
}

class Construct {
    public final int temp;
    public Construct(int data) {
        this.temp = data;
    }

}

class InBody {
    public final int temp;
    {
        temp = 3;
    }
}
