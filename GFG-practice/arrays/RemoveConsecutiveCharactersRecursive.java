// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class RemoveConsecutiveCharactersRecursive {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {

            String S = read.readLine().trim();

            Solution ob = new Solution();
            String ans = ob.removeConsecutiveCharacter(S);

            System.out.println(ans);
        }
    }
}
// } Driver Code Ends

// User function Template for Java

class Solution {
    private StringBuilder ans;

    public String removeConsecutiveCharacter(String S) {
        ans = new StringBuilder(S);
        fun(ans, 1, 0, ans.length());
        return ans.toString();
    }

    public void fun(StringBuilder sb, int i, int p, int n) {
        if (i >= n) {
            return;
        } else {
            if (sb.charAt(i) == sb.charAt(p)) {
                sb.deleteCharAt(i);
                fun(sb, i, p, n - 1);
            } else {
                fun(sb, i + 1, i, n);
            }
        }
    }
}