/**
 *     测试 currentThread() 方法
 * Created by dujuan on 2016/8/1.
 */
public class CountOperate extends Thread {

    public CountOperate(){
        System.out.println("CountOperate----begin");
        System.out.println("Thread.currentThread().getName() = "+Thread.currentThread().getName());
        System.out.println("1this.getName()="+this.currentThread().getName());
        System.out.println("CountOperate---end");
    }

    @Override
    public void run(){
        System.out.println("CountOperate----begin");
        System.out.println("Thread.currentThread().getName() = "+Thread.currentThread().getName());
        System.out.println("this.getName()="+this.getName());
        System.out.println("CountOperate---end");
    }
}
