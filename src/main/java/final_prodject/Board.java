package final_prodject;

public class Board {
    private Ship_[][]shipArray;
    public Board (Ship_[][]shipArray) {
        this.shipArray=shipArray;
    }

    public Ship_[][] getShipArray() {
        return shipArray;
    }

    public void setShipArray(Ship_[][] shipArray) {
        this.shipArray = shipArray;
    }

    public void print (){
        for (int i=0; i<shipArray.length; i++) {
            for (int y=0; y<shipArray[i].length;y++){
                System.out.print(shipArray [i][y]);
            }
            System.out.println();
        }
    }
}

