/**
 * Created by dujuan on 2016/8/1.
 */
public class LoginServlet {

    // 使用静态变量是为了共享资源
    private static String usernameRef;

    private static String passwordRef;

    synchronized public static void doPost(String username,String password){
        try {
            usernameRef = username;
            if (username.equals("a")){
                Thread.sleep(5000);
            }
            passwordRef = password;
            System.out.println("userName= " + usernameRef + " password= " + passwordRef);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}
