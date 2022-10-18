package day4;
//Заполнить двумерный массив (матрицу) случайными числами от 0 до 50.
// Размер матрицы задать m=12, n=8 (m - размерность по строкам, n - размерность по колонкам).
// В консоль вывести индекс строки, сумма чисел в которой максимальна.
// Если таких строк несколько, вывести индекс последней из них.
//Пример сгенерированной матрицы (для простоты m=3, n=5):
//
//3 2 1 5 7 	// сумма - 18
//1 2 5 6 2 	// сумма - 16
//3 4 9 6 4	// сумма - 26
//
//Ответ: 2 (индекс строки, сумма чисел в которой максимальна)

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int [][] mas=new int[12][8];
        Random random=new Random();
        int min=0;
        int max=50;
        int diff=max-min;

        int sumMax=0;
        int count=0;


        for (int i=0; i< mas.length;i++){
            for (int y=0; y<mas[i].length;y++){
                mas[i][y]=random.nextInt(diff+1)+min;
            }
        }
        System.out.println(Arrays.deepToString(mas));
        for (int i=0; i< mas.length;i++){
            int sum=0;
            for (int y=0; y<mas[i].length;y++){
               sum=sum+mas[i][y];
            }
            if (sum>sumMax){
                sumMax=sum;
                count=i;}
        }
        System.out.println(sumMax+" "+count);
    }
}
