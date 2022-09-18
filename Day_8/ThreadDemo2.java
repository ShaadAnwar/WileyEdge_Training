package Day_8;

public class ThreadDemo2 implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" is running");
    }
}
