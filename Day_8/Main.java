package Day_8;

public class Main {
    public static void main(String[] args) {
        ThreadDemo demo1 = new ThreadDemo();
        ThreadDemo demo2 = new ThreadDemo();
        ThreadDemo demo3 = new ThreadDemo();
        //ThreadDemo demo4 = new ThreadDemo();
        //ThreadDemo2 demo2 = new ThreadDemo2();
        demo1.start();
        demo2.start();
        demo3.start();
        //demo4.start();
//        Thread th = new Thread(demo2);
//        th.start();


    }
}
