package day5;

public class Task1 {
//    1. Создать класс Автомобиль (англ. Car) с полями “Модель”, “Цвет”, “Год выпуска”.
//    Создать get и set методы для каждого поля. Создать экземпляр класса Автомобиль. Задать значение для каждого поля, используя set методы.
//    Вывести в консоль значение каждого из полей, используя get методы.
//Созданный вами класс должен отвечать принципам инкапсуляции.

    public static void main(String[] args) {
        Car car=new Car();
        car.setModel("BMW");
        car.setColor("Green");
        car.setYear(2020);
        System.out.println(car.getModel());
        System.out.println(car.getColor());
        System.out.println(car.getYear());

    }
}
