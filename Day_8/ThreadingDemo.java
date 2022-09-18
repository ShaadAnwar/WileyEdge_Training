package Day_8;

public class ThreadingDemo extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" "+currentThread().getId());
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ThreadingDemo demo1 = new ThreadingDemo();
        ThreadingDemo demo2 = new ThreadingDemo();
        ThreadingDemo demo3 = new ThreadingDemo();
        ThreadingDemo demo4 = new ThreadingDemo();
        System.out.println(Thread.currentThread().getName()+" "+currentThread().getId());
        demo1.start();
        demo2.start();
        demo3.start();
        demo4.start();

    }



}
