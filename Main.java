// THIS FILE IS UPDATED 3:31PM July 30, 2021
package javaapplication1;
import java.time.Instant;
import java.util.Date;
/**
 *
 * @author pjgui
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        byte reallySmallNum = 127; // limit is only 127
        short aBitBiggerNum = 32_767;
        
        int age = 2_147_483_647; // this is int max value
        long largerNonDecimalNums = 9_223_372_036_854_775_807l; // this is long max value
        
        float decimalNum = 3.14f; 
        //by default 12.3 is double literal, So to tell compiler to treat it as float explicitly -> it uses f or F
        double doubleNum = 3.14;
        
        String thisIsAString = "This string is inside a String variable";
        char onlyOneChar = 'a';
        
        boolean isTrue = true;
           
        System.out.println(aBitBiggerNum);
        
        
        // packages
        Date now = new Date();
        long timeRightNow = now.getTime();
        System.out.println(timeRightNow);
        System.out.println(now.toString().substring(0,3));
        
        
        //JAVA METHODS
        // 1. Cut string using substring()
        String cutStringTest = "This is a TEST";
        System.out.println(cutStringTest.substring(10, 14)); // or just 10
    }
    
}
