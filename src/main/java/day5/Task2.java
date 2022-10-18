package day5;


public class Task2 {
//    2. Создать класс Мотоцикл (англ. Motorbike) с полями “Модель”, “Цвет”, “Год выпуска”.
//    Создать экземпляр класса Мотоцикл, используя конструктор (set методы не использовать).
//    Необходимо придерживаться принципов инкапсуляции и использовать ключевое слово this.
//    Вывести в консоль значение каждого из полей, используя get методы.
    public static void main(String[] args) {
        Motorbike motorbike=new Motorbike("Honda", "Black", 2021);
        System.out.println(motorbike.getModel());
        System.out.println(motorbike.getColor());
        System.out.println(motorbike.getYear());

    }
}
