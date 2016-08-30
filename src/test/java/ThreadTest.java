import org.junit.Test;

/**
 * Created by dujuan on 2016/8/1.
 */
public class ThreadTest {

    @Test
    public void testMyThread1(){
        try {
            MyThread1 thread1 = new MyThread1();
            thread1.setName("myThread1");
            thread1.start();
            for (int i = 0; i < 10; i++){
                int time = (int)(Math.random() * 1000);
                Thread.sleep(time);
                System.out.println("Main= " + Thread.currentThread().getName());
            }
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    @Test
    public void testMyThread2(){

        Runnable runnable = new MyThread2();
        Thread thread = new Thread(runnable);
        thread.start();

        System.out.println("运行结束 ！");
    }

}
