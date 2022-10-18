package day3;
//Реализовать программу, которая 5 раз запрашивает от пользователя два числа- делимое и делитель.
// Для этих двух чисел программа рассчитывает результат деления и выводит его в консоль.
// Если пользователь вводит 0 в качестве делителя, вместо того, чтобы останавливать работу цикла принудительно,
// мы пропускаем итерацию и выводим в консоль сообщение “Деление на 0”.
//Ключевое слово else или два if использовать в этой программе нельзя.
// В решении обязательно использовать оператор continue.

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Scanner scanner1=new Scanner(System.in);
        double a;
        double b;
        double res;
        for (int i=0; i<5; i++){
            System.out.println("Введите 2 числа: ");
            a=scanner.nextDouble();
            b=scanner1.nextDouble();
            if (b==0)
                continue;
            System.out.println(res =a/b);
        }

    }

    }

