class NotMain {
    public int dataPublic=15;
    private int dataPrivate=10;
    int dataPackage=5;
    protected int dataProt=7;

    private class PrivateIn {
        private int priv = 1;
        public int pub = 2;
        protected int prot =3;
        int pack=4;
        void printDataPublic() {
            System.out.println(dataPublic);
        }
        void printDataProt() {
            System.out.println(dataProt);
        }
        void printDataPackage() {
            System.out.println(dataPackage);
        }
        void printDataPrivate() {
            System.out.println(dataPrivate);
        }
    }
    public class PublicIn {
        private int priv = 1;
        public int pub = 2;
        protected int prot =3;
        int pack=4;
        void printDataPublic() {
            System.out.println(dataPublic);
        }
        void printDataProt() {
            System.out.println(dataProt);
        }
        void printDataPackage() {
            System.out.println(dataPackage);
        }
        void printDataPrivate() {
            System.out.println(dataPrivate);
        }
    }
    protected class ProtectedIn {
        private int priv = 1;
        public int pub = 2;
        protected int prot =3;
        int pack=4;
        void printDataPublic() {
            System.out.println(dataPublic);
        }
        void printDataProt() {
            System.out.println(dataProt);
        }
        void printDataPackage() {
            System.out.println(dataPackage);
        }
        void printDataPrivate() {
            System.out.println(dataPrivate);
        }
    }
    class PackageIn {
        private int priv = 1;
        public int pub = 2;
        protected int prot =3;
        int pack=4;
        void printDataPublic() {
            System.out.println(dataPublic);
        }
        void printDataProt() {
            System.out.println(dataProt);
        }
        void printDataPackage() {
            System.out.println(dataPackage);
        }
        void printDataPrivate() {
            System.out.println(dataPrivate);
        }
    }
    public void accessToInner() {
        PrivateIn privateIn =new PrivateIn();
        PublicIn publicIn =new PublicIn();
        ProtectedIn protectedIn=new ProtectedIn();
        PackageIn packageIn =new PackageIn();

        System.out.println(privateIn.priv);
        System.out.println(privateIn.pub);
        System.out.println(privateIn.prot);
        System.out.println(privateIn.pack);

        System.out.println(publicIn.priv);
        System.out.println(publicIn.pub);
        System.out.println(publicIn.prot);
        System.out.println(publicIn.pack);

        System.out.println(protectedIn.priv);
        System.out.println(protectedIn.pub);
        System.out.println(protectedIn.prot);
        System.out.println(protectedIn.pack);

        System.out.println(packageIn.priv);
        System.out.println(packageIn.pub);
        System.out.println(packageIn.prot);
        System.out.println(packageIn.pack);
    }

}

public class Main {
    public static void main(String[] args) {
        NotMain notmain =new NotMain();
        //Первая часть - не работает для privateIn из другого класса в том же пакете, только внутри NotMain
        //NotMain.PrivateIn privateIn = notmain.new PrivateIn();
        NotMain.PublicIn publicIn = notmain.new PublicIn();
        NotMain.ProtectedIn protectedIn = notmain.new ProtectedIn();
        NotMain.PackageIn packageIn = notmain.new PackageIn();

        //privateIn.printDataPackage();
        //privateIn.printDataPrivate();
        //privateIn.printDataPublic();
        //privateIn.printDataProt();


        //Вторая часть - вывод всех данных внешнего класса через функции внутреннего работает
        publicIn.printDataPackage();
        publicIn.printDataPrivate();
        publicIn.printDataPublic();
        publicIn.printDataProt();

        protectedIn.printDataPackage();
        protectedIn.printDataPrivate();
        protectedIn.printDataPublic();
        protectedIn.printDataProt();

        packageIn.printDataPackage();
        packageIn.printDataPrivate();
        packageIn.printDataPublic();
        packageIn.printDataProt();

        //Третья часть - вывод всех данных внутреннего класса при помощи функции внешнего работает для любого типа доступа и любого доступа внутреннего класса
        notmain.accessToInner();
    }
}