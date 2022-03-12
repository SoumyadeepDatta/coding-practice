import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the substrCount function below.

    static boolean isSpecial(String str){
        String[] arr = str.split("");

        if (arr.length == 0) {
            return false;
        }

        if (arr.length == 1) {
            
            return true;
        }
        
        String s = arr[0];
        if (arr.length % 2 == 0) {
            if ((String.join("", Collections.nCopies(arr.length, s))).equals(String.join("", arr))) {
                
                return true;
            }
        }
        
        if (arr.length % 2 != 0) {
            
            String odd = "";
            odd += (String.join("", arr)).substring(0, arr.length / 2);
            odd += (String.join("", arr)).substring((arr.length / 2) + 1, arr.length);
            if ((String.join("", Collections.nCopies(arr.length - 1, s))).equals(odd)) {
                
                return true;
            }
        }

        return false;
    }

    static long substrCount(int n, String s) {
        long cnt = 0;

        for (int k = 0; k < n; k++){
            for (int i = 0, j = i + k + 1; j <= n; i++, j++){
                if (isSpecial(s.substring(i, j))) {
                    cnt++;
                }
            }
        }

        return cnt;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        long result = substrCount(n, s);

        System.out.println(result);

        // bufferedWriter.write(String.valueOf(result));
        // bufferedWriter.newLine();

        // bufferedWriter.close();

        scanner.close();
    }
}
