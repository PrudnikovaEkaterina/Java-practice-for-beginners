package day11.task1;

import java.util.ArrayList;

public class Picker implements Worker{
    private int salary;
    private boolean isPayed;
    private String name;





    public Picker(String name, int salary, boolean isPayed) {
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
    public void doWork(Warehouse warehouse){
        salary+=80;
        int a = warehouse.getCountPickedOrders();
        a++;
        warehouse.setCountPickedOrders(a);
        int b= warehouse.getCountPickedOrdersAll();
        b++;
        warehouse.setCountPickedOrdersAll(b);
    };
    public void bonus(Warehouse warehouse){
        salary+=3;
        isPayed=true;
    };
    public static void payCourierBonus (ArrayList<Picker> listPicker, Warehouse warehouse){
        if (warehouse.getCountPickedOrders()<5){
            System.out.println("Бонус недоступен");
            return;}
        if (warehouse.getCountPickedOrders()>5) {
            System.out.println("Бонус доступен и будет начислен");
            int overBonus=warehouse.getCountPickedOrders()/5;
            for (int i=0;i<overBonus;i++){
                for (int y=0; y<listPicker.size(); y++) {
                    listPicker.get(y).bonus(warehouse);
                }
                int a=warehouse.getCountPickedOrders()-5;
                warehouse.setCountPickedOrders(a);
            }
        }
        if (warehouse.getCountPickedOrders()==5){
            System.out.println("Бонус доступен и будет начислен");
            for (int i=0; i<listPicker.size(); i++) {
                listPicker.get(i).bonus(warehouse);
            }
            warehouse.setCountPickedOrders(0);
        }
    }

}
