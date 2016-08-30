import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by dujuan on 2016/8/2.
 */
public class TestIsAlive {

    public static void main(String[] args) {

        ThreadAboutIsAlive mythread = new ThreadAboutIsAlive();
        System.out.println("begin == " + mythread.isAlive());
        mythread.start();
        System.out.println("end == " + mythread.isAlive());

        ThreadAboutIsAlive c = new ThreadAboutIsAlive();
        Thread t1 = new Thread(c);

        System.out.println("main begin t1 isAlive= " + t1.isAlive());
        t1.setName("A");
        t1.start();
        System.out.println("main end t1 isAlive=" + t1.isAlive());

//        ThreadAboutIsAlive c = new ThreadAboutIsAlive();
//        System.out.println("main begin c is alive = " + c.isAlive());
//        c.setName("A");
//        c.start();
//        System.out.println("main end c isAlive = " + c.isAlive());

    }

}
