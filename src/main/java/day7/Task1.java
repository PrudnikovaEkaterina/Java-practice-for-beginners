package day7;

public class Task1 {
//    1. Для этого задания скопируйте класс Самолет из предыдущего дня в пакет текущего дня.
//В классе Самолет реализовать статический метод compareAirplanes,
// который в качестве аргументов принимает два объекта класса Airplane (два самолета)
// и выводит сообщение в консоль о том, какой из самолетов длиннее.
    public static void main(String[] args) {
        Airplane airplane=new Airplane("aa", 2010, 25, 500);
        Airplane airplane1=new Airplane("dd", 2015, 20, 800);

        Airplane.compareAirplanes(airplane, airplane1);

    }
}