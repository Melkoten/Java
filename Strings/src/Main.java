import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {
        String temp = "Motorcycle";
        //длина строки
        System.out.println(temp.length());
        //символ по индексу
        System.out.println(temp.charAt(1));
        //подстрока с указанного индекса до второго
        System.out.println(temp.substring(4,6));
        //строка в нижнем регистре
        System.out.println(temp.toLowerCase());
        //наличие подстроки
        System.out.println(temp.contains("cycle"));
        //индекс первого вхождения подстроки
        System.out.println(temp.indexOf("tor"));
        //замена символов
        System.out.println(temp.replace('c', 'C'));
        //разбивка строки на массив, разделитель - указанный символ
        String[] parts = temp.split("c");
        System.out.println("Splited: ");
        for (String part : parts) {
            System.out.println(part);
        }
        //удаление пробелов в начале и конце строки
        String tempS = " Motorcycle ";
        System.out.println(tempS.trim());
        //Соединение строк
        String temp1 = "Motor";
        String temp2 = "Cycle";
        System.out.println(temp1.concat(temp2));

        StringJoiner temp3 = new StringJoiner(" ");
        temp3.add("BMW").add("KTM");
        System.out.println(temp3);

        String temp4 = """
    First string
    Second string
    Third string
    """;
        System.out.println(temp4);

    }
}