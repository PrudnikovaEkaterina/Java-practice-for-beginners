package day19.task2;
//2. В папке resources находится файл taxi_cars.txt. Этот файл содержит в себе данные
// о местоположении 500 машин такси (каждая машина такси находится на новой строке).
//Формат данных в файле следующий: id_машины координата_по_x координата_по_y
//Каждая строка в файле содержит 3 целых числа, разделенных пробелами — уникальный идентификатор машины такси,
// координата машины по оси X и координата машины такси по оси Y. Значения каждой из координат
// находятся в диапазоне от 0 до 99.
//Для вашего удобства, в пакете task2 реализован класс - Point.
// Класс Point необходим для представления точек с координатами x,y в нашей программе.
// Местоположение машины такси — объект класса Point.
//Вам необходимо считать строки из файла taxi_cars.txt в HashMap<Integer, Point>.
// В качестве ключей используются id машин из файла, а в качестве значений используется объект Point,
// созданный для двух координат текущей машины. После того, как все машины будут лежать в объекте HashMap,
// вам необходимо запросить от пользователя 4 числа - координаты квадрата (x1, y1, x2, y2).
// Первые два числа — координаты первой точки квадрата, вторые два числа — координаты второй точки квадрата
// (см. картинку ниже).
//На этой картинке видно, что квадрат задается двумя точками, которые вводятся пользователем с клавиатуры.
// Синими квадратиками изображены машины такси, которые оказались внутри квадрата.
//Для квадрата, введенного пользователем, вам необходимо, используя сформированный
// объект HashMap<Integer, Point>, определить, какие машины попали внутрь этого квадрата.
// Вам необходимо вывести в консоль идентификаторы машин, которые находятся внутри квадрата
// и общее количество машин в квадрате. Машины, лежащие на грани квадрата, не учитываются.
//Алгоритм должен работать для любого корректно введенного квадрата.

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Neil Alishev
 */
public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("/home/user/Рабочий стол/JavaMarathon2022/src/main/resources/taxi_cars.txt");
        Scanner scanner = new Scanner(file);
        HashMap<Integer, Point> map = new HashMap<>();
        while (scanner.hasNextLine()){
            String line=scanner.nextLine();
            String [] masStr = line.split(" ");
            map.put(Integer.parseInt(masStr[0]), new Point(Integer.parseInt(masStr[1]), Integer.parseInt(masStr[2])));
        }

        System.out.println("Введите 4 целых числа от 0 до 99");
        Scanner scanner1=new Scanner(System.in);
        Scanner scanner2=new Scanner(System.in);
        Scanner scanner3=new Scanner(System.in);
        Scanner scanner4=new Scanner(System.in);
        int x1=0, y1=0, x2=0, y2=0;
        try {
            x1 = scanner1.nextInt();
            if (x1<0||x1>99) throw new RuntimeException();
             y1 = scanner2.nextInt();
            if (y1<0||y1>99) throw new RuntimeException();
            x2 = scanner3.nextInt();
            if (x2<0||x2>99) throw new RuntimeException();
            y2 = scanner4.nextInt();
            if (y2<0||y2>99) throw new RuntimeException();
        }
        catch (RuntimeException e) {
            System.out.println("Некорректное число");
        }

        for (Map.Entry<Integer, Point> pair: map.entrySet())
        { if (pair.getValue().getX()>x1&&pair.getValue().getX()<x2&&pair.getValue().getY()>y1&&pair.getValue().getY()<y2)
            System.out.println("В квадрате такси: "+pair.getKey());
        }




    }
}

