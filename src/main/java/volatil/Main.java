package volatil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Ключевое слово volatile нужно обязательно использовать, когда 1 поток записывает в переменную,
//        а 2-й  - читает из переменной, чтобы обеспечить когерентность (целостность) кэша и чтобы
//        у разных потоков была одна и таже вресия переменной, которую они будут использовать.
//        -
        MyThread myThread=new MyThread();
        myThread.start();
        Scanner scanner=new Scanner(System.in);
        scanner.nextLine();
        myThread.st_op();

    }


}
