package day3;
//Реализовать программу, которая пока работает, принимает на вход от пользователя два числа - делимое и делитель.
// Для этих двух чисел программа рассчитывает результат деления и выводит его в консоль.
// Программа останавливает свою работу тогда, когда пользователь вводит 0 в качестве делителя.
//(для этих вещественных чисел необходимо использовать тип double и метод nextDouble() у Scanner’а соответственно).
// В решении обязательно использовать оператор break.

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Scanner scanner1=new Scanner(System.in);
        double a;
        double b=1;
        while (true){
            System.out.println("Введите 2 числа: ");
            a=scanner.nextDouble();
            b=scanner1.nextDouble();
            double res;
            if (b!=0)
            System.out.println(res=a/b);
            else break;
        }



        }


}
