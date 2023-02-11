package synchronize_part2;

import java.sql.Time;
import java.util.List;
import java.util.Random;

public class Test {
//  Объекты, которые специально создаются для синхронизации методов addToList1 и addToList2
    Object lock1=new Object();
    Object lock2=new Object();

//    Общий метод, в котором мы создаем 2 потока, thread1 и thread2, и в каждом из потоков вызываем
//    метод addAll

    public void main (List<Integer> list1,List<Integer> list2) throws InterruptedException {
        long before= System.currentTimeMillis();
        Thread thread1 =new Thread(new Runnable() {
            @Override
            public void run() {
                addAll(list1,list2);
            }
        });

        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                addAll(list1,list2);
            }
        });
//        Запускаем потоки
        thread1.start();
        thread2.start();
// Ждем, пока потоки исполнят код
        thread1.join();
        thread2.join();
// Считаем время работы программы
        long after= System.currentTimeMillis();
        System.out.println(after-before);
        System.out.println(list1.size());
        System.out.println(list2.size());

    }

    Random random=new Random();

//    если просто написать public synchronized void addToList1 и public synchronized void addToList2, то
//    синхронизация произойдет на объекте  test (Test test=new Test()) и если 1-й поток завладеет монитором объекта test,
//    то 2-й поток не сможет выполнять ни addToList1, ни addToList2, так как монитор test у первого потока. Но это не подходит, так как
//    с одной стороны, мы не хотим, чтобы оба потока могли выполнять, например, addToList1, одновременно. Но мы хотим, чтобы потоки могли выполнять
//    addToList1 и  addToList2 параллельно, т.е. в один момент времени поток 1 добавляет объекты в list1 и в этот же момент времени поток 2 добавляет
//    объекты в list 2


//    Добавляем рандомные int в list1, синхронизируемся на объекте lock1
    public void addToList1(List<Integer> list1){
        synchronized (lock1){
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        list1.add(random.nextInt(100));
    }}

//    //    Добавляем рандомные int в list2,  синхронизируемся на объекте lock2
    public void addToList2(List<Integer> list2){
        synchronized (lock2) {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        list2.add(random.nextInt(100));
    }}

    public void addAll (List<Integer> list1,List<Integer> list2){
        for (int i=0; i<1000; i++){
            addToList1(list1);
            addToList2(list2);
        }
    }
}
