import java.util.*;
import java.lang.*;
import java.io.*;
class PINS {
    public static void main(String[] args) throws java.lang.Exception {
        InputStreamReader rd = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(rd);
        // your code goes here
		try {
		    int t = Integer.parseInt(br.readLine());
            if (t>=1 && t<=100) {
                while(t-->0){
                    long n = Long.parseUnsignedLong(br.readLine());
                    if (n>=1 && n<=Math.pow(10, 5)) {
                        solve(n);
                    }
                }
            }
            
		} catch(Exception e) {
		    return;
		}
    }
    public static void solve(long n) throws java.lang.Exception{
        if(n==1){
            System.out.println(1+" "+1);
        }
        else{
            
            String ans_one = "1";
            String zero = "0";
            long length = (long)(n - Math.ceil((double)n/2));
            String ans_zero = String.join("", Collections.nCopies((int)length, zero));      // string multiplication in Java (JDK 1.8 or above)
            String ans = ans_one + ans_zero;
            
            System.out.println(1+" "+ans);
        }
        
    }
}
