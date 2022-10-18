package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
//     С клавиатуры вводится число n - размер массива.
//     Необходимо создать массив указанного размера и заполнить его случайными числами от 0 до 10 (включительно).
//     Используя цикл for each вывести содержимое массива в консоль, а также вывести в консоль информацию о:
//а) Длине массива
//б) Количестве чисел больше 8
//в) Количестве чисел равных 1
//г) Количестве четных чисел
//д) Количестве нечетных чисел
//е) Сумме всех элементов массива
//
//Пример:
//Введено число 10. Сгенерирован следующий массив:
//[4, 8, 4, 9, 5, 2, 2, 3, 3, 6]
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int min=0;
        int max=10;
        int diff=max-min;

        int count8=0;
        int count1=0;
        int countEven=0;
        int countOdd=0;
        int sum=0;

        System.out.println("Введите размер массива: ");
        int size=scanner.nextInt();
        int [] mas=new int[size];
        Random random=new Random();
        for (int i=0; i< mas.length;i++){
            mas [i]= random.nextInt(diff+1)+min;
        }
        System.out.println(Arrays.toString(mas));

        for (Integer el: mas) {
            if (el>8)
                count8++;
            if (el==1)
                count1++;
            if (el%2==0)
                countEven++;
            if (el%2!=0)
                countOdd++;
            sum=sum+el;
        }
        System.out.println("Количестве чисел больше 8 - "+count8+"\n"+
                "Количестве чисел равных 1 - "+count1+"\n"+
                "Количестве четных чисел - "+countEven+"\n"+
                "Количестве нечетных чисел - "+countOdd+"\n"+
                "Сумма всех элементов массива - "+sum);



        }



    }

