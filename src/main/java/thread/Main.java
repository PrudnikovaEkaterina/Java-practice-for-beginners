package thread;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread1=new MyThread();
        myThread1.start();


        MyThread myThread2=new MyThread();
        myThread2.start();

        Thread thread=new Thread(new MyThread_1());
        thread.start();

      Thread.sleep(5000);

        for (int i=0; i<100; i++)
            System.out.println("Hello from main thread");

    }
}
