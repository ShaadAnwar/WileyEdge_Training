package Day_8;

public class ThreadDemo extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" Arrived");
        for (int i = 0; i < 10; i++) {
            System.out.println(i+" "+Thread.currentThread().getName());
        }
    }
}
