package day14;
//1. Создать .txt файл в папке проекта. Заполнить его вручную
// десятью произвольными числами.
// Реализовать статический метод printSumDigits(File file), который считает сумму всех чисел в этом файле
// и выводит ее на экран.
//Если файла не существует в папке проекта, в программе необходимо выбрасывать исключение
// и выводить в консоль сообщение “Файл не найден”. Помимо этого, если чисел в файле меньше или больше 10,
// необходимо выбрасывать исключение и выводить в консоль сообщение “Некорректный входной файл”.
//Вызвать данный метод в методе main().

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file=new File("file.txt");
        System.out.println(printSumDigits(file));


    }
    public static int printSumDigits(File file) {
       Scanner scanner=null;
        int sum=0;
        try {
            scanner=new Scanner(file);
            String [] masStr = scanner.nextLine().split(" ");
            if (masStr.length!=10) throw new RuntimeException();
            int [] masInt=new int[10];
            int count=0;
            for (int i=0; i<masStr.length; i++){
              masInt[count++]=Integer.parseInt(masStr[i]);
            }

            for (int i=0; i<masInt.length; i++){
                sum+=masInt[i];
            }
        } catch (IOException e){
            System.out.println("Файл не найден");
        }
        catch (RuntimeException e){
            System.out.println("Некорректный входной файл");
        }
        return sum;

    }
}
