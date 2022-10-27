package day16;
//1. Реализовать программу, которая на вход принимает txt файл с целыми числами
// (можно использовать файл из задания 1 дня 14) и в качестве ответа выводит в консоль среднее арифметическое
// этих чисел.
//Ответ будет являться вещественным числом. В консоль необходимо вывести полную запись вещественного числа
// (со всеми знаками после запятой) и сокращенную запись (с 3 знаками после запятой).
//Детали реализации: В классе Task1 создать публичный статический метод printResult(File file),
// в котором реализовать вышеописанную логику. В методе main() класса Task1 вызвать метод printResult(File file),
// передав ему в качестве аргумента объект класса File (txt файл с целыми числами).
// Возникающие исключения обрабатывать внутри метода.
//Пример:
//Числа в txt файле: 5 2 8 34 1 36 77
//Ответ: 23.285714285714285 --> 23.286

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file=new File("file.txt");
        sum(file);

    }
    public static void sum (File file){
        double sumSr=0;
        try {
            Scanner scanner = new Scanner(file);
            String line=scanner.nextLine();
            String [] masStr=line.split(" ");
            double [] masDouble=new double[masStr.length];
            int count=0;
            for (int i=0; i<masStr.length; i++){
                masDouble[count++]=Integer.parseInt(masStr[i]);
            }
            double sum=0;
            for (int i=0; i< masDouble.length; i++){
                sum+=masDouble[i];
            }
            sumSr=sum/masDouble.length;
            System.out.printf((sumSr)+"-->"+"%.3f",sumSr);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

    }
}

