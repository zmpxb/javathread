/**
 * Created by dujuan on 2016/8/2.
 */
public class ThreadAboutIsAlive extends Thread{

//    @Override
//    public void run(){
//        System.out.println("run= "+ this.isAlive());
//    }

    @Override
    public void run(){
        System.out.println("CountOperate-----begin");
        System.out.println("Thread.currentThread().getName()= " + Thread.currentThread().getName());
        System.out.println("Thread.currentThread.isAlive()= " + Thread.currentThread().isAlive());
        System.out.println("this.isAlive()= " + this.isAlive());
        System.out.println("this.currentThread().getName() = " + this.currentThread().getName());
        System.out.println("CountOperate---end");
    }

}
