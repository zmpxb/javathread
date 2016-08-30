/**
 * Created by dujuan on 2016/8/1.
 */
public class ALogin extends Thread {

    @Override
    public void run(){
        LoginServlet.doPost("a","aa");
    }

}
