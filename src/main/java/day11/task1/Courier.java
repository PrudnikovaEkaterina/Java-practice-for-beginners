package day11.task1;

import java.util.ArrayList;

public class Courier implements Worker{
    private int salary;
    private String name;

    private boolean isPayed;


    public Courier(String name, int salary, boolean isPayed) {
        this.name=name;
        this.salary = salary;
        this.isPayed = isPayed;
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    public String toString(){
        return name+" "+"зарплата: "+salary+" "+
                "был выплачен бонус или нет: "+isPayed;
    }

    public void doWork(Warehouse warehouse) {
        salary += 100;
        int a = warehouse.getCountDeliveredOrders();
        a++;
        warehouse.setCountDeliveredOrders(a);
        int b= warehouse.getCountDeliveredOrdersAll();
        b++;
        warehouse.setCountDeliveredOrdersAll(b);
    }


    public void bonus(Warehouse warehouse){
        salary+=3;
        isPayed=true;
    }

    public static void payCourierBonus (ArrayList<Courier> listCourier, Warehouse warehouse){
        if (warehouse.getCountDeliveredOrders()<5){
            System.out.println("Бонус недоступен");
            return;}
        if (warehouse.getCountDeliveredOrders()>5) {
            System.out.println("Бонус доступен и будет начислен");
            int overBonus=warehouse.getCountDeliveredOrders()/5;
            for (int i=0;i<overBonus;i++){
                for (int y=0; y<listCourier.size(); y++) {
                    listCourier.get(y).bonus(warehouse);
                }
                int a=warehouse.getCountDeliveredOrders()-5;
                warehouse.setCountDeliveredOrders(a);
            }
        }
        if (warehouse.getCountDeliveredOrders()==5){
            System.out.println("Бонус доступен и будет начислен");
            for (int i=0; i<listCourier.size(); i++) {
                listCourier.get(i).bonus(warehouse);
            }
            warehouse.setCountDeliveredOrders(0);
        }
    }
}









