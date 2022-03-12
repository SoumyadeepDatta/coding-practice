import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.*;
import java.util.*;
import java.util.StringTokenizer;

public class FastReader_eg {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader()
        {
            br = new BufferedReader(
                new InputStreamReader(System.in));
        }
 
        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt() { return Integer.parseInt(next()); }
 
        long nextLong() { return Long.parseLong(next()); }
 
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
 
        String nextLine()
        {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    public static String cleanStringArray(String str){
        return str.replace("]", "").replace("[", "").replace(",", "").trim();
    }
    public static int mostSignificantDigit(int N){
        double K = Math.log10(N);
        K = K - Math.floor(K);
        return (int)Math.pow(10, K);
    }
    public static int numberOfDigits(int N) {
        return (int)(Math.floor(Math.log10(N)) + 1);
    }
    public static void main(String[] args)
    {
        FastReader s = new FastReader();
        // int n = s.nextInt();
        // int k = s.nextInt();
        // int count = 0;
        // while (n-- > 0) {
        //     int x = s.nextInt();
        //     if (x % k == 0)
        //         count++;
        // }
        // System.out.println(count);
        // Space separeted string input
        // String[] strings = s.nextLine().split(" ");
        // String[] newStrings = s.nextLine().split(" ");
        // print withouts [ ] , etc.
        // System.out.println(cleanStringArray(Arrays.toString(strings)));
        // System.out.println(cleanStringArray(Arrays.toString(newStrings)));
        // mostSignificantDigit
        System.out.println(mostSignificantDigit(2365));
        // numberOfDigits
        System.out.println(numberOfDigits(2365));
        // gcd
        // BigInteger 
    }
}