package day4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
//    Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
//Затем, используя цикл for each вывести в консоль:
//наибольший элемент массива
//наименьший элемент массива
//количество элементов массива, оканчивающихся на 0
//сумму элементов массива, оканчивающихся на 0
//
//Использовать сортировку запрещено.
    public static void main(String[] args) {
        int [] mas=new int[100];
        Random random=new Random();
        int min=0;
        int max=10000;
        int diff=max-min;
        for (int i=0; i< mas.length;i++){
            mas[i]= random.nextInt(diff+1)+min;
        }
        System.out.println(Arrays.toString(mas));
        int countMin=10;
        int countMax=0;
        int count10=0;
        int sum10=0;

        for (Integer i: mas)
        {if (i<countMin)
            countMin=i;
            if (i>countMax)
                countMax=i;
            if (i%10==0){
                count10++;
                sum10=sum10+i;}

        }
        System.out.println("наименьший элемент массива - "+countMin+"\n"+"наибольший элемент массива - "+countMax+"\n"+
        "количество элементов массива, оканчивающихся на 0 - "+count10+"\n"+"сумма элементов массива, оканчивающихся на 0 - "+sum10);

    }
}
