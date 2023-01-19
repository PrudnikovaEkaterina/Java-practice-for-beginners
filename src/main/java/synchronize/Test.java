package synchronize;

public class Test {
    private  int counter;

    public int getCounter() {
        return counter;
    }

    public  synchronized void DoWork(){
        for (int i=0; i<10000; i++)
            counter++;

    }


}
