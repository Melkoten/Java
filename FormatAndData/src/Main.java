import java.util.Formatter;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Formatter temp1 = new Formatter();
        //%b логическое значение
        boolean bool = true;
        temp1.format("%b%n", bool);
        //%d десятичное целое
        int var = 123;
        temp1.format("%d%n", var);
        //%f десятичное не целое
        double var2 = 1.2345;
        temp1.format("%.2f%n", var2);
        //%c - символьное
        char ch = 49;
        temp1.format("%c%n", ch);
        //%e - экспоненциальное
        double exp = 123.125;
        temp1.format("%e%n", exp);
        System.out.println(temp1);
        temp1.close();

        Formatter temp2 = new Formatter();
        Date date = new Date();
        //%tY год четырехзначный
        temp2.format("%tY%n", date);
        //%ty год двузначный
        temp2.format("%ty%n", date);
        //%tB месяц
        temp2.format("%tB%n", date);
        //%tH час
        temp2.format("%tH%n", date);
        //%tA день недели
        temp2.format("%tA%n", date);
        System.out.println(temp2);
        temp2.close();
    }
}