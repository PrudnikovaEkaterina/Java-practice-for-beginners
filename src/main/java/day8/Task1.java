package day8;

public class Task1 {
//    1. Создать строку, состоящую из чисел от 0 до 20000. Важно понимать, что это одна строка,
//    полученная конкатенацией (“склеиванием”) чисел из диапазона через пробел
//    (0 + “ “ + 1 + “ “ + 2 + … + 20000).
//После создания такой строки, вызов System.out.println()
// на этой строке должен вывести в консоль сразу все числа из диапазона:
//0 1 2 3 4 5 6 7 8 9 10 11 12 … 19995 19996 19997 19998 19999 20000
//
//Для того, чтобы почувствовать разницу в производительности между конкатенацией обычных строк (класс String)
// и использовании StringBuilder, реализуйте описанную задачу этими двумя способами,
// замеряя время работы программы.
    public static void main(String[] args) {
        String line="0";

        long startTime = System.currentTimeMillis();
        for (int i=1; i<=2000;i++){
           line=line+" "+i;
        }
        long stopTime = System.currentTimeMillis();
        System.out.println(line);
        System.out.println("Длительность работы, в мс.: " + (stopTime - startTime));


        String line1="0";
        StringBuilder stringBuilder=new StringBuilder(line1);
        long startTime1 = System.currentTimeMillis();
        for (int i=1; i<=2000;i++){
            stringBuilder.append(" "+i);
        }
        long stopTime1 = System.currentTimeMillis();
        System.out.println(stringBuilder.toString());
        System.out.println("Длительность работы, в мс.: " + (stopTime1 - startTime1));

    }
}
