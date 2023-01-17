package iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterable {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(9);

//        Классы Java Collection реализуют интерфейс Iterable, который позволяет проходиться по элементам коллекции;
//        Эту возможность дает метод iterator, который реализован в интерфейсе;
//        После Java 5 - абстракция этого метода, цикл for each

       for (Integer x: list)
           System.out.println(x);



//    До Java 5 было так
    Iterator<Integer> iterator=list.iterator();

//   while (iterator.hasNext())
//       System.out.print(iterator.next()+" ");
//   (здесь указатель итератора) -> [5 3 9]

//        Главное отличие for each и цикла while итератора - в цикле while можно удалять значения;int x=0;
        int x=0;

        while (iterator.hasNext()){
            if(x==2)
            iterator.remove();
            System.out.println(iterator.next());
            x++;
        }
        System.out.println(list);
//  в цикле while удаления не видно, так как мы всегда удаляем текущий элемент, а на экран выводим - следующий;
}}
