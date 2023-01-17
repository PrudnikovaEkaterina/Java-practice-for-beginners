package thread;

public class MyThread extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i =0; i<100; i++){
          System.out.println("Hello from MyThread"+" "+i);
      }
    }
}
