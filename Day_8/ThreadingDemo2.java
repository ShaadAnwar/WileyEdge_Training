package Day_8;

public class ThreadingDemo2 implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getId());
    }

    public static void main(String[] args) {
        ThreadingDemo2 demo1 = new ThreadingDemo2();
    }
}
