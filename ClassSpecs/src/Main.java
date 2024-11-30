import types.AllTypes;

public class Main {
    public static void main(String [] args) {
        AllTypes type = new AllTypes();
        System.out.println(type.tempPublic);
        //System.out.println(type.tempPrivate);
        //System.out.println(type.tempProtected);
        //System.out.println(type.tempCommon);

        SameFile type2 = new SameFile();
        System.out.println(type2.tempPublic);
        //System.out.println(type2.tempPrivates);
        System.out.println(type2.tempProtected);
        System.out.println(type2.tempCommon);

    }
}

class SameFile {
    public String tempPublic ="public";
    protected String tempProtected = "protected";
    String tempCommon = "common";
    private String tempPrivate = "private";
}