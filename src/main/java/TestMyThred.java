/**
 * Created by xiaozl on 2016/8/1.
 */
public class TestMyThred {

    public static void main(String[] args) {
//        MyThread myThread = new MyThread();
//        myThread.start();
//        System.out.println("运行结束！ ");

        Runnable runnable = new MyThread2();
        Thread thread = new Thread(runnable);
        thread.start();

        System.out.println("运行结束 ！");
    }

}
