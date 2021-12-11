import java.io.*;
import java.lang.*;
import java.util.*;


/**
 * Modular_Arithmetic
 * (a+b)%M = ((a%M) + (b%M))%M
 * (a*b)%M = ((a%M) * (b%M))%M
 * (a-b)%M = ((a%M) - (b%M) + M)%M      
 * (a/b)%M = ((a%M) * ((b^-1)%M))%M        // b^-1 => multiplicative inverse
 */
/**
 * Given a number N. Print its factorial.
 * Constraints
 * 1 <= N <= 100
 * Print the answer modulo M 
 * Where M = 47
 */
public class Modular_Arithmetic {

    public static void main(String[] args) throws java.lang.Exception {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        int n = Integer.parseInt(br.readLine());
        long factorial = 1;
        int M = 47;
        for (int i = 2; i <= n; i++) {
            factorial = (factorial*i) % M;
        }
        System.out.println(factorial);
    }
    /**
     * Let 5! = (1*2*3*4*5)
     * So (5!)%47 = (1*2*3*4*5)%47
     * (1*2*3*4*5)%47
     * => ((1*2*3*4) * 5%47)%47
     * => ((1*2*3*4) * 5%47)%47
     * => (((1*2*3)%47 * 4%47) * 5%47)%47
     * => ((((1*2)%47 * 3%47)%47 * 4%47) * 5%47)%47
     * => ((((1%47 * 2%47)%47 * 3%47)%47 * 4%47) * 5%47)%47
     * ...  and so on ...
     */
}