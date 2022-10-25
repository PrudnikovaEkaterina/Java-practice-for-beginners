package day11.task1;

public class Warehouse {
    private int countPickedOrders;
    private int countPickedOrdersAll;


    private int countDeliveredOrders;
    private int countDeliveredOrdersAll;

    public int getCountPickedOrdersAll() {
        return countPickedOrdersAll;
    }

    public void setCountPickedOrdersAll(int countPickedOrdersAll) {
        this.countPickedOrdersAll = countPickedOrdersAll;
    }

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public void setCountPickedOrders(int countPickedOrders) {
        this.countPickedOrders = countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    public void setCountDeliveredOrders(int countDeliveredOrders) {
        this.countDeliveredOrders = countDeliveredOrders;
    }

    public int getCountDeliveredOrdersAll() {
        return countDeliveredOrdersAll;
    }

    public void setCountDeliveredOrdersAll(int countDeliveredOrdersAll) {
        this.countDeliveredOrdersAll = countDeliveredOrdersAll;
    }

    public String toString(){
        return  "количество собранных заказов всего: "+countPickedOrders+"\n"+
                "количество доставленных заказов всего: "+countDeliveredOrdersAll;

    }
}
