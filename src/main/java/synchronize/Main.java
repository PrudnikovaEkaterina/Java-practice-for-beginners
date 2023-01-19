package synchronize;
//Ключевое слово synchronized необходимо, когда 2 и более потока пишут в переменную;
//Синхронизация происходит на объекте (используется сущность объекта "Монитор", который в 1 момент времени
// может принадлежать только 1 потоку)
// Исходя из этого, ключ. слово используется только в методах, которые вызываются на объекте.
// дождаться выполнения потока - функция join();
public class Main {
    public static void main (String[] args) throws InterruptedException {
        Test test=new Test();

//        Создала 1-й поток, в нем у объекта test инкрементируется переменная counter;

        Thread thread1=new Thread(new Runnable() {
            @Override
            public  void run() {
                test.DoWork();
            }
        });

//     Создала 2-й поток, в нем у объекта test инкрементируется переменная counter;

        Thread thread2=new Thread(new Runnable() {
            @Override
            public  void run() {
                test.DoWork();
            }
        });
//                 Запустила потоки;
        thread1.start();
        thread2.start();
//                  Дождалась, пока потоки выполнят свой код;

        thread1.join();
        thread2.join();

//        Вывела переменную counter;
//        Но если не использовать ключевое слово synchronized в методе DoWork(), то
//        counter не всегда будет 200 (потому что идет перезапись переменной из-за асинхронности потоков)

        System.out.println(test.getCounter());


    }

}
