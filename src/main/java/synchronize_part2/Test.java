package synchronize_part2;

import java.sql.Time;
import java.util.List;
import java.util.Random;

public class Test {

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

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

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

    public synchronized void addToList1(List<Integer> list1){
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        list1.add(random.nextInt(100));
    }

    public synchronized void addToList2(List<Integer> list2){
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        list2.add(random.nextInt(100));
    }

    public void addAll (List<Integer> list1,List<Integer> list2){
        for (int i=0; i<1000; i++){
            addToList1(list1);
            addToList2(list2);
        }
    }
}
