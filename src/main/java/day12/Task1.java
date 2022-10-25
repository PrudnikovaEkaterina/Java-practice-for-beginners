package day12;
//Создать список строк, добавить в него 5 марок автомобилей, вывести список в консоль.
// Добавить в середину еще 1 автомобиль, удалить самый первый автомобиль из списка. Вывести список в консоль.

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> listCars=new ArrayList<>();
        listCars.add("Lada");
        listCars.add("Volvo");
        listCars.add("BMW");
        listCars.add("Daewoo");
        listCars.add("Hyundai");
        System.out.println(listCars);
        listCars.add(2,"Mersedes");
        System.out.println(listCars);
        listCars.remove(0);
        System.out.println(listCars);


    }
}
