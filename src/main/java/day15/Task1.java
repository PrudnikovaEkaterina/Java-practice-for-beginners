package day15;
//1. Вам дан файл с информацией об остатках обуви на складе (src/main/resources/shoes.csv).
// Это пример реальной выгрузки остатков из 1С в csv файл (формат файла с разделителями,
// в качестве разделителя использован символ “;”). В этом файле содержится информация о названии модели обуви,
// ее размер и оставшееся на складе количество.
//До преобразования в csv это была таблица с тремя колонками:
//Название 						   Размер	   Кол-во
//Ботинки HS РАН-Р 400 чер. ЗП			45		4
//Ботинки PANDA САНИТАРИ 3916 S1 SRC бел.	37		1
//Необходимо сформировать новый файл (src/main/resources/missing_shoes.txt) с информацией о моделях и размерах
// обуви, которой нет на складе (количество = 0). Для этого реализуйте программу,
// которая принимает на вход csv файл и создает новый txt файл следующего содержания
// (должно получиться 11 строк):
//Ботинки СВАРЩИК ут М.1398 ЗП, 40, 0
//Ботинки СВАРЩИК ут М.1398 ЗП, 45, 0
//Ботинки ТОФФ БЕРКУТ И с выс.берцами ут ч, 38, 0
//Возникающие исключения обрабатывать (try-catch), а не пробрасывать в сигнатуре метода (throws).
//Учтите ситуацию, когда в файле может быть содержимое отличное от ожидаемого.
// В нашем случае файл один и он корректен, но гипотетически может быть подан пустой файл
// или кол-во столбцов отличаться от трех.

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file=new File("/home/user/Рабочий стол/JavaMarathon2022/src/main/resources/shoes.csv");
        missing_shoes(file);

    }
    public static void missing_shoes (File file) {
        try {
            Scanner scanner=new Scanner(file);
            File file1=new File("/home/user/Рабочий стол/JavaMarathon2022/src/main/resources/missing_shoes.txt");
            PrintWriter printWriter=new PrintWriter(file1);
            while (scanner.hasNextLine()){
                String line=scanner.nextLine();
                String [] masStr=line.split(";");
                int a = Integer.parseInt(masStr[2]) ;
                if (a<0) throw new RuntimeException();
                if (a==0){
                    printWriter.println(line);
                }
            }
            printWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        catch (RuntimeException e){
            System.out.println("Некорректный входной файл");
        }
    }
}
