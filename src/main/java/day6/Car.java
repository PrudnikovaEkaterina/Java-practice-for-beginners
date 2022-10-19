package day6;

public class Car {
    private String model;
    private String color;
    private int year;

    public void setModel (String model){
        this.model=model;
    }

    public String getModel (){
        return model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void info (){
        System.out.println("Это автомобиль");
    }

    public int yearDifference (int num){
        return Math.abs(num-getYear());
    }
}
