package volatil;

public class MyThread extends Thread{
    private volatile boolean var = true;
    public void run(){
        while (var)
            System.out.println("Hello");
    }

    public void st_op(){
        this.var=false;
    }

    }

