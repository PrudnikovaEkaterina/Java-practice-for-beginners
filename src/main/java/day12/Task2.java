package day12;
//2. Создать новый список, заполнить его четными числами от 0 до 30 и от 300 до 350.
//Для заполнения списка реализуйте метод, который принимает числа от, до, и ссылку на список. Вывести список.

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> listNumbers =new ArrayList<>();
        numAdd(listNumbers, 0, 30, 300, 350);
        System.out.println(listNumbers);


    }

    public static void numAdd( List<Integer> listNumbers,int a, int b, int c, int d){
        for (int i=a; i<=b; i++){
            listNumbers.add(i);
        }
        for (int i=c; i<=d; i++){
            listNumbers.add(i);
        }
    }
    }


