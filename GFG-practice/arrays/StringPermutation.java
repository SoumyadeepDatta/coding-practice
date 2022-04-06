// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

public class StringPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        sc.nextLine();
        while (T-- > 0) {

            Solution ob = new Solution();

            String S = sc.nextLine();

            ArrayList<String> arr = ob.permutation(S);
            for (String s : arr) {
                System.out.print(s + " ");
            }
            System.out.println();
        }

    }
}
// } Driver Code Ends

// User function Template for Java

class Solution {
    ArrayList<String> ansList = new ArrayList<>();

    public ArrayList<String> permutation(String S) {
        // Your code here
        char[] arr = S.toCharArray();
        Arrays.sort(arr);
        S = new String(arr);
        permute(S, "");
        return this.ansList;
    }

    public void permute(String s, String ans) {
        if (s.length() == 0) {
            this.ansList.add(ans);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            String s1;
            char c = s.charAt(i);
            if (i == 0) {
                s1 = s.substring(i + 1);
            } else if (i == s.length() - 1) {
                s1 = s.substring(0, i);
            } else {
                s1 = s.substring(0, i) + s.substring(i + 1);
            }
            permute(s1, ans + c);
        }
    }
}
