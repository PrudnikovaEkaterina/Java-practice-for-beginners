package day14;
// Создать класс “Человек” с полями “имя” и “возраст”. Реализовать статический метод
// List<Person> parseFileToObjList(File file), который считывает содержимое того же файла people.txt,
// создает экземпляры класса “Человек” и возвращает список объектов. Получить данный список в методе main()
// и распечатать его в консоль.
//В случае, если файла не существует в папке проекта, в программе необходимо выбрасывать исключение
// и выводить в консоль сообщение “Файл не найден”. Помимо этого, если значение возраста отрицательно,
// необходимо выбрасывать исключение и выводить в консоль сообщение “Некорректный входной файл”.
//
//
//Пример ответа: [{name='Mike', year=24}, {name='John', year=19}, {name='Anna', year=20}, {name='Miguel', year=5}]

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        File file=new File("people.txt");

        System.out.println(parseFileToObjList(file));


    }
    public static List<Person> parseFileToObjList(File file){
        List<Person> personList=new ArrayList<>();
        try {
            Scanner scanner=new Scanner(file);
            while (scanner.hasNextLine()){
                String line=scanner.nextLine();
                String [] masStr=line.split(" ");
                if (Integer.parseInt(masStr[1])<=0) throw new RuntimeException ();
                personList.add(new Person(masStr[0], Integer.parseInt(masStr[1])));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        catch (RuntimeException e){
            System.out.println("Некорректный входной файл");
            personList=null;
        }
        return personList;
    }
}
