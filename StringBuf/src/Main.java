public class Main {
    public static void main(String[] args) {
        StringBuffer temp1 = new StringBuffer("Motor");
        StringBuilder temp2 = new StringBuilder("Motor");
        //добавляет строку в конец
        temp1.append("cycle");
        System.out.println(temp1);
        temp2.append("cycle");
        System.out.println(temp2);
        //вставляет строку
        temp1.insert(5, "BRRRRRR");
        System.out.println(temp1);
        temp2.insert(5, "BRRRRRR");
        System.out.println(temp2);
        //удаляет часть строки
        temp1.delete(5, 7);
        System.out.println(temp1);
        temp2.delete(5, 7);
        System.out.println(temp2);
        //емкость буфера/длина строки
        System.out.println(temp1.capacity());
        System.out.println(temp2.length());
        //разворачивает
        temp1.reverse();
        System.out.println(temp1);
        temp2.reverse();
        System.out.println(temp2);



        //String to StringBuffer
        String temp3 = "Motorcycle";
        StringBuffer temp4 = new StringBuffer(temp3);
        System.out.println(temp4);
        //StringBuffer to String
        temp3 = temp4.toString();
        System.out.println(temp3);
        //String to StringBuilder
        StringBuilder temp5 = new StringBuilder(temp3);
        System.out.println(temp5);
        //StringBuilder to String
        temp3 = temp5.toString();
        System.out.println(temp3);
        //StringBuffer to StringBuilder
        temp5 = new StringBuilder(temp4.toString());
        System.out.println(temp5);
        //StringBuilder to StringBuffer
        temp4 = new StringBuffer(temp5.toString());
        System.out.println(temp4);
    }
}