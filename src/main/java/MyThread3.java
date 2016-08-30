/**
 * Created by xiaozl on 2016/8/1.
 */
public class MyThread3 extends Thread {

    private int count = 5;

    @Override
    synchronized public void run(){
        super.run();
        // 如果count放到System.out.println（）不会出现非现场安全问题，在println方法内部是同步的
        count--;
        System.out.println("由 " + this.currentThread().getName()+" 计算，count = "+ count);
    }

}
