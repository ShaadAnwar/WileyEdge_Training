package Day_8;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class PassangerThread extends Thread {
    private CyclicBarrier barrier;

    PassangerThread(CyclicBarrier barrier,String name){
    super(name);
    this.barrier = barrier;
    }

    @Override
    public void run() {
                System.out.println(Thread.currentThread().getName()+" has arrived");
        try {
            int await = barrier.await();
            if(await == 0){
                System.out.println("Four Passengers have arrived so cab is going to start now - - -");
                //System.out.println();
            }
            System.out.println(Thread.currentThread().getName()+" reached the drop point");
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }

    }
}
