/***
 * Class : User TestCode
 * Required : Basic idea
 * Req. Knowledge : coding conventions, Abstraction
 * Complexity : min
 * Version : 1.0.0
 */
import com.java.*;

public class TestCode{
    
     public static void main(String []args){
        User u = new User();
        u.userName = "firstUser";
        System.out.println("Is user valid : "+u.valid());
        u.userName = "SecondUserWithMoreData";
        System.out.println("Is user valid : "+u.valid());
        
     }
}
