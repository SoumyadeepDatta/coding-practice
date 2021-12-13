import java.io.*;
import java.lang.*;
import java.util.*;
/**
 * Maximum number in decimal which can be represented by 4 bits is 1111 i.e. 15 == ((2 to the power 4)-1)
 * So, Maximum number in decimal which can be represented by n bits == ((2 to the power n)-1)
 */
public class Bin_basics {
    /**
     * Left shift (<<) means multiplying
     * n<<x = left shift n by x digits
     * 1<<0 = 1 (in binary) ~ 1 (in decimal) 
     * 1<<0 = 1
     * 1<<1 = 10 ~ 2
     * 1<<2 = 100 ~ 4
     * 1<<3 = 1000 ~ 8
     * 1<<4 = 10000 ~ 16
     * So, 1<<n = 2 to the power n
     * @param args
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws java.lang.Exception{
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        int n = Integer.parseInt(br.readLine());
        int x = Integer.parseInt(br.readLine());
        System.out.println(Integer.toBinaryString(n)+" Shifted "+x+" digits to left");
        // So, 1<<n = 2 to the power n
        int answer = n<<x;
        System.out.println(Integer.toBinaryString(answer)+" ~ "+answer);  
        System.out.println("Shift 1 digit to left == multiply with 2");
        System.out.println("Shift 2 digit to left == multiply with 2*2 i.e. 4");
        System.out.println("Shift 3 digit to left == multiply with 2*2*2 i.e. 8");
        System.out.println("Shift n digit to left == multiply with 2*2*.. upto n times i.e 2 to the power n"); 

        int max_int = (1<<31) - 1; 
        /**
         * maximum value for 32 bit integer
         * but we have stored 31 bits (1<<31) because 1 extra bit is required for sign bit
         * and the - 1 is because it starts from 0  
         * */      
        System.out.println(max_int);
    }
}
