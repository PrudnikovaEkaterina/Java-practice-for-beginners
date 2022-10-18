package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
//       Реализовать программу №2, используя цикл while.
        System.out.print("Введите число а: ");
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        System.out.print("Введите число b: ");
        Scanner scanner1=new Scanner(System.in);
        int b=scanner.nextInt();
        while ((a+1)<b){
            if (a%5==0&&a%10!=0)
                System.out.print(a+" ");
            a++;
        }
    }
}
