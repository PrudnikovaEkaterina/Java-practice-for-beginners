package day7;

public class Airplane {
    private String manufacturer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }

    public Airplane(String manufacturer, int year, int length, int weight) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel=0;
    }

    public void info() {
        System.out.println("Изготовитель: "+manufacturer+ " год выпуска: "+year+" длина: "+length+" вес: "+ weight+ " количество топлива в баке:"+fuel);
    }

    public int fillUp(int n) {
       return fuel=fuel+n;
    }

    public static void compareAirplanes (Airplane airplane, Airplane airplane1){
        if (airplane.length>airplane1.length)
            System.out.println("Первый самолет длиннее второго");
        else if (airplane.length==airplane1.length)
            System.out.println("Длины самолетов равны");
        else System.out.println("Второй самолет длиннее первого");
    }
}
