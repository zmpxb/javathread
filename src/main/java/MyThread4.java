/**
 * Created by dujuan on 2016/8/1.
 */
public class MyThread4 implements Runnable{

    private int count = 5;

    private String name;

    @Override
    synchronized public void run() {
        count--;
        System.out.println("由 " + Thread.currentThread().getName() +" 计算，count = "+count);
    }

}
