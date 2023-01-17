package thread;

public class MyThread_1 implements Runnable{
    @Override
    public void run() {
        for (int i =0; i<100; i++){
            System.out.println("Hello from MyThread_1"+" "+i);
        }

    }
}
