package volatil;

public class MyThread extends Thread{
    private boolean var = true;
    public void run(){
        while (var)
            System.out.println("Hello");
    }

    public void st_op(){
        this.var=false;
    }

    }

