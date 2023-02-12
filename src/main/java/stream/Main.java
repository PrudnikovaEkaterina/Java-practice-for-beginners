package stream;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        Метод стрим преобразует массив или коллекцию в поток,
//        а дальше мы используем методы (опраторы манипулирования стримами) для этого потока

       List<Animal> list = addAnimal();
       list.forEach(System.out::println);

//                                       MAP meth
//  каждый элемент потока преобразует таким образом,как мы напишем в параметре метода map.

//   1. преобразовала Лист Animal в Лист Имена_Animal

        List<String> name= list.stream().map(element->element.getName())
               .collect(Collectors.toList());

//  можно записать короче (вместо map(element->element.getName()) так  map(Animal::getName)
        list.stream().map(Animal::getName).collect(Collectors.toList());

//  2. выожу на печать каждый элемент коллекции name
        name.forEach(System.out::println);

//  3. преобразовала Лист Animal в Лист Age_Animal и умножила возраст животных  на 2

      List<Integer> age =  list.stream().map(el-> el.getAge()*2).collect(Collectors.toList());
//  4. выожу на печать каждый элемент коллекции age

        age.forEach(System.out::println);

//    с массивом работает аналогично, немного меняется синтаксис

         int [] mas= {1, 3, 5, 9};
          mas = Arrays.stream(mas).map(el-> {
            if (el%3==0)
                el=el/3;
                return el;}
        ).toArray();

        System.out.println(Arrays.toString(mas));

//                         FILTER meth
//    Метод filter работает со стримом, в аргументы принимает predicate
//    и на выходе отдает стрим тех объектов, которые прошли условия фильтрации.
//    Predicate - это вид функционального интерфейса.
//    (Функциональные интерфейсы в Java 8 → Consumer, Supplier, Predicate и Function.)
//    Predicate (предикат)
//    Интерфейс Predicate представляет собой логическую функцию аргумента.
//    Он в основном используется для фильтрации данных из потока (stream) Java.
//    Метод фильтра потока принимает предикат для фильтрации данных и возврата нового потока,
//    удовлетворяющего предикату. У предиката есть метод test(), который принимает аргумент
//    и возвращает логическое значение.
//public void testPredicate() {
//    List<String> names = Arrays.asList("Smith", "Samueal", "Catley", "Sie");
//    Predicate<String> nameStartsWithS = str -> str.startsWith("S");
//    names.stream().filter(nameStartsWithS).forEach(System.out::println);}
//    В приведенном выше примере мы создали предикат, который проверяет имена, начинающиеся с S.
//    Этот предикат передается потоку.

        List<Animal> list1=addAnimal();

       list1.stream().filter(element->element.getName().startsWith("S")
                        && element.getAge()>=30 && element.getKindOfAnimal().equals(KindOfAnimal.HERBIVORE))
                .collect(Collectors.toList());


     long count = list1.stream().filter(el->el.getName().contains("Z"))
               .count();

        System.out.println(count);

//                                   SORT meth

//   Отсортировать по возрасту в порядке увеличения
        List<Animal> list2=addAnimal();
        list2.stream().sorted(Comparator.comparing(Animal::getAge)).collect(Collectors.toList());


//   Отсортировать по возрасту в порядке убывания
        list2.stream().sorted(Comparator.comparing(Animal::getAge).
                        reversed()).collect(Collectors.toList());


//   Отсортировать по возрасту в порядке убывания, а затем - по имени;
        List<Animal> sort = list2.stream().sorted(Comparator.comparing(Animal::getAge).reversed()
                .thenComparing(Animal::getName)).collect(Collectors.toList());

       sort.forEach(System.out::println);

//                   ALL MATCH, ANY MATCH, NONE MATCH meth's
//   возвращает boolean.
//   ALL MATCH - все сущности коллекции удовлетворяют условию в аргументах метода.
//   ANY MATCH - возвращает true, если хотя бы 1 из наших сущностей соответсвует условию.
//   NONE MATCH - если ни одна сущность коллекции не удовлетворяет условию, вернет true

        boolean allMatch=list2.stream().allMatch(el->el.getAge()>10);
        boolean anyMatch=list2.stream().anyMatch(el->el.getName().length()>5);
        System.out.println(anyMatch);

//                            MAX & MIN meth
//    MAX - возвращает самое большое значение, указаннное в условиях сравнения;
//    MIN - возвращает самое маленькое значение, указаннное в условиях сравнения;
        list2.stream().max(Comparator.comparing(Animal::getAge)).ifPresent(System.out::println);
        list2.stream().min(Comparator.comparing(Animal::getAge)).ifPresent(System.out::println);

//                            GROUP meth
//   Позволяет группировать коллекции по заданным критериям, в нашем случает вернет Map(ключ-значение)

       Map <KindOfAnimal,List <Animal>> group = list2.stream().
               collect(Collectors.groupingBy(Animal::getKindOfAnimal));

//       Важно, вывожу Map при помощи foreach
           group.forEach((kindOfAnimal, animals) -> {
           System.out.println(kindOfAnimal);
           animals.forEach(System.out::println);});

        System.out.println(group);

//           Сочетание методов

       Optional<String> nameAnimal = list2.stream().filter(el->el.getKindOfAnimal().equals(KindOfAnimal.PREDATOR)).min(Comparator
                .comparing(Animal::getAge)).map(Animal::getName);

       nameAnimal.ifPresent(System.out::println);

//       Что такое  Optional<String> и ifPresent ?? (я это не изучала еще)





    }

    public static List<Animal> addAnimal () {
        return List.of(
                new Animal("Slon", 30, KindOfAnimal.HERBIVORE),
                new Animal("TIGER", 10, KindOfAnimal.PREDATOR),
                new Animal("Aunkey", 30, KindOfAnimal.OMNIVOROUS),
                new Animal("Zebra", 12, KindOfAnimal.HERBIVORE)
                );
    }
}
