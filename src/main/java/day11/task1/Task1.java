package day11.task1;

import java.util.ArrayList;
import java.util.Arrays;

public class Task1 {
//    1. На складе происходит сборка и упаковка интернет-заказов.
//Создайте классы:
//“Склад” (англ. Warehouse) c полями countPickedOrders (количество собранных заказов),
// countDeliveredOrders (количество доставленных заказов), get методами для обоих полей и методом toString()
// для получения информации о значениях полей склада.
//“Сборщик” (англ. Picker) с полями salary (заработная плата) и isPayed (был выплачен бонус или нет),
// get методами для обоих полей, методом toString() и конструктором.
//“Курьер” (англ. Courier) с полями salary (заработная плата) и isPayed (был выплачен бонус или нет),
// get методами для обоих полей, методом toString() и конструктором.
//В классах “Сборщик” и “Курьер” могут понадобиться и другие поля на ваше усмотрение
// (чтобы эти классы соответствовали условиям задачи).
//Каждый класс-сотрудник должен реализовывать интерфейс Worker, в котором необходимо объявить сигнатуры doWork()
// и bonus().
//Каждый раз, когда сотрудник выполняет свою работу (вызов метода doWork()), ему выплачивается заработная плата (сокр. ЗП)
// (80 — сборщику, 100 — курьеру).
//Также, при вызове doWork() у Сборщика, происходит увеличение значения поля countPickedOrders в объекте
// класса Warehouse на 1. А при вызове doWork() у Курьера, происходит увеличение значения
// поля countDeliveredOrders в объекте класса Warehouse на 1.
// Подумайте о том, как связать объекты работников с объектом склада (один из возможных вариантов -
// передавать объект склада в качестве аргумента при создании объектов-работников и хранить его в поле).
//Сотрудникам полагается бонус, в зависимости от персональных показателей:
// когда на складе собрано 5 заказов, Сборщику выплачивается бонус в размере 3.
// Когда клиентам доставлено 5 заказов, Курьеру выплачивается бонус в размере 3.
//Если на складе несколько сотрудников одной категории, то оценивается их коллективная работа,
// т.е. если 10 курьеров доставят каждый по 1 заказов, то каждый курьер получит бонус.
//Бонус сотрудникам должен выдаваться при вызове метода bonus().
// Причем, если на складе не достигнуты необходимые показатели,
// вызов метода bonus() не должен начислять денежную премию, а должен выводить в консоль сообщение “Бонус пока не доступен”.
// Бонус может быть выплачен только один раз.
//Для демонстрации и тестирования работы программы, в методе main() создайте склад и по 1 рабочему.
// Свяжите этих двух рабочих со складом. После этого, вызовите метод businessProcess(Worker worker),
// передавая в качестве аргумента сотрудника. Вызовите метод сначала для сборщика, а потом для курьера.
// Выведите в консоль количество собранных и доставленных заказов на складе и ЗП каждого из сотрудников.
//Создайте второй склад, на который также “примите” по 1 новому сотруднику. Вызовите один раз метод doWork()
// у сотрудников второго склада. Проконтролируйте, что у склада 1 и его сотрудников при этом значения
// не меняются.
    public static void main(String[] args) {
        Warehouse warehouse=new Warehouse();

        Courier courier=new Courier("Курьер 1",0, false);
        Courier courier1=new Courier("Курьер 2",0, false);

        Picker picker=new Picker("Сборщик 1", 0, false);
        Picker picker1=new Picker("Сборщик 2", 0, false);

        ArrayList<Courier> listCourier=new ArrayList<>();
        listCourier.add(courier);
        listCourier.add(courier1);

        ArrayList<Picker> listPicker=new ArrayList<>();
        listPicker.add(picker);
        listPicker.add(picker1);

        System.out.println(warehouse);


        System.out.println(listCourier);
        System.out.println(listPicker);

        Courier.payCourierBonus(listCourier, warehouse);
        Picker.payCourierBonus(listPicker, warehouse);

        courier.doWork(warehouse);
        courier.doWork(warehouse);
        courier.doWork(warehouse);
        courier1.doWork(warehouse);
        courier1.doWork(warehouse);
        courier1.doWork(warehouse);

        picker.doWork(warehouse);
        picker.doWork(warehouse);
        picker.doWork(warehouse);
        picker1.doWork(warehouse);
        picker1.doWork(warehouse);
        picker1.doWork(warehouse);

        System.out.println(warehouse);

        System.out.println(listCourier);
        System.out.println(listPicker);

        Courier.payCourierBonus(listCourier, warehouse);
        Picker.payCourierBonus(listPicker, warehouse);

        System.out.println(listCourier);
        System.out.println(listPicker);

        Courier.payCourierBonus(listCourier, warehouse);
        Picker.payCourierBonus(listPicker, warehouse);

        System.out.println(listCourier);
        System.out.println(listPicker);

        courier.doWork(warehouse);
        courier.doWork(warehouse);
        courier1.doWork(warehouse);
        courier1.doWork(warehouse);

        picker.doWork(warehouse);
        picker.doWork(warehouse);
        picker1.doWork(warehouse);
        picker1.doWork(warehouse);

        System.out.println(warehouse);

        System.out.println(listCourier);
        System.out.println(listPicker);

        Courier.payCourierBonus(listCourier, warehouse);
        Picker.payCourierBonus(listPicker, warehouse);

        System.out.println(listCourier);
        System.out.println(listPicker);








    }

}
