package day16;
//2. Реализовать программу, записывающую числа разных типов в 2 файла.
//Файл 1 должен называться “file1.txt”, а Файл 2 должен называться “file2.txt”.
//Оба файла должны находиться в корне проекта. Создаваться файлы должны не вручную, а при запуске программы.
//Файл 1 должен содержать 1000 случайных чисел от 0 до 100.
//Файл 2 создается на основании Файла 1, но содержит числа вещественного типа данных.
//Метод заполнения Файла 2 следующий: для каждой группы из 20 целых чисел из Файла 1 рассчитывается
// их среднее арифметическое. Затем, полученное значение записывается в Файл 2.
// Таким образом в Файле 2 будет находиться 50 вещественных чисел (1000 / 20 = 50).
//После того, как Файл 2 будет сформирован, необходимо реализовать статический метод printResult(File file).
// Этот метод должен рассчитать сумму всех вещественных чисел из Файла 2 и вывести её в консоль,
// отбросив вещественную часть.
//Пример:
//Для простоты, в Файле 1 находится 12 целых чисел,
// а среднее арифметическое рассчитывается для группы из 4 целых чисел.
//Файл 1: 3 8 7 5 28 73 4 1 5 32 89 12
//Файл 2: 5.75 26.5 34.5
//Ответ: 66

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file1=new File("/home/user/Рабочий стол/JavaMarathon2022/file1.txt");
        File file2=new File("/home/user/Рабочий стол/JavaMarathon2022/file2.txt");

        try {
            PrintWriter printWriter1=new PrintWriter(file1);
            PrintWriter printWriter2=new PrintWriter(file2);
            Random random=new Random();
            for (int i=0; i<1000; i++){
                printWriter1.println(random.nextInt(101));
            }
            printWriter1.close();
            File file=new File("file1.txt");
            Scanner scanner=new Scanner(file);
            double [] mas=new double[1000];
            int count=0;
            while (scanner.hasNextDouble()){
                double x =scanner.nextDouble();
               mas[count++]=x;
            }

            for (int i=0; i< mas.length-19;i+=20){
                double sum=0.0;
                for (int y=i; y<i+20; y++){
                    sum+=mas[y];
                }
                printWriter2.println(sum/20);
            }
            printWriter2.close();

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

        File file3=new File("file2.txt");
       System.out.println(printResult(file3));



    }
    public static double printResult(File file) throws FileNotFoundException {
        Scanner scanner=new Scanner(file);
        double sum=0;
        while (scanner.hasNextLine()){
            double x = Double.parseDouble(scanner.nextLine());
            sum+=x;
        }
        return (int) sum;
    }
}
