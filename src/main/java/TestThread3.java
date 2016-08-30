/**
 * Created by dujuan on 2016/8/1.
 */
public class TestThread3 {

    public static void main(String[] args) {

        MyThread3 myThread3 = new MyThread3();
        Thread a = new Thread(myThread3,"A");
        Thread b = new Thread(myThread3,"B");
        Thread c = new Thread(myThread3,"C");
        Thread d = new Thread(myThread3,"D");
        Thread e = new Thread(myThread3,"E");

        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
//
//        MyThread4 myThread4 = new MyThread4();
//        Thread t1 = new Thread(myThread4,"一号窗口");
//        Thread t2 = new Thread(myThread4,"二号窗口");
//        Thread t3 = new Thread(myThread4,"三号窗口");
//
//        t1.start();
//        t2.start();
//        t3.start();
    }



}
