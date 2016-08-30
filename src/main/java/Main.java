/**
 * 测试 currentThread() 方法
 * Created by dujuan on 2016/8/1.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        MyThread5 myThread = new MyThread5();
        myThread.start();

        CountOperate c = new CountOperate();

        Thread t1 = new Thread(c);
        t1.setName("A");
        t1.start();

        System.out.println("xiao");
    }

}
