import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class ResultE {

    /*
     * Complete the 'encryption' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String encryption(String s) {
    // Write your code here
        String str="";
        for(char c:s.toCharArray())
        {
            if(c!=' ')
                str+=c;
        }
        int m=(int)Math.floor(str.length());
        int n=(int)Math.ceil(str.length());
        char[][] g=new char[m][n];
        int idx=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(idx>=str.length())
                    g[i][j]=' ';
                else
                    g[i][j]=str.charAt(idx++);
            }
        }
        System.out.println(str);///
        String ans="";
        for(int j=0;j<n;j++)
        {
            for(int i=0;i<m;i++)
            {
                if(g[i][j]==' ')
                {
                    ans+=' ';
                    break;
                }
                else
                    ans+=g[i][j]; 
                    
            }
            
        }
        System.out.println(ans);///
        return ans;
    }

}

public class Encryption {
    public static void main(String[] args) throws IOException {
        // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        // String s = bufferedReader.readLine();

        String s="Have a nice day";

        String o = ResultE.encryption(s);

        System.out.println(o);

        // bufferedWriter.write(result);
        // bufferedWriter.newLine();

        // bufferedReader.close();
        // bufferedWriter.close();
    }
}
