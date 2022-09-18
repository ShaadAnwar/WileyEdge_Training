package Day_8;

import java.util.concurrent.CyclicBarrier;

public class Client {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+" has started");

        CyclicBarrier barrier = new CyclicBarrier(4);

        PassangerThread p1 = new PassangerThread(barrier,"Shaad");
        PassangerThread p2 = new PassangerThread(barrier,"Jhony");
        PassangerThread p3 = new PassangerThread(barrier,"Robert");
        PassangerThread p4 = new PassangerThread(barrier,"Chris");

        p1.start();
        p2.start();
        p3.start();
        p4.start();
    }
}
