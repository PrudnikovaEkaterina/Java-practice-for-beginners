package day4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
// Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
//Найти максимум среди сумм трех соседних элементов.
// Для найденной тройки с максимальной суммой выведите значение суммы и индекс первого элемента тройки.
    public static void main(String[] args) {
        int[] mas = new int[6];
        Random random = new Random();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt((10 - 0) + 1) + 0;
        }

        System.out.println(Arrays.toString(mas));

        int maxSum = 0;
        int elementFirst = 0;
        int elementLast = 0;

        for (int i = 0; i < mas.length - 2; i++) {
            int sum = 0;
            for (int y = i; y < i + 3; y++) {
                sum = sum + mas[y];
            }
            if (sum > maxSum) {
                maxSum = sum;
                elementFirst = mas[i];
                elementLast=mas[i+2];

            }

        }
            System.out.println(maxSum);
            System.out.println(elementFirst);
            System.out.println(elementLast);

        }
    }
