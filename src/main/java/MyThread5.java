/**
 * Created by xiaozl on 2016/8/1.
 */
public class MyThread5 extends Thread {

    public MyThread5(){
        System.out.println(this.currentThread().getName());
    }

    @Override
    public void run(){
        System.out.println(this.currentThread().getName());
    }

}
