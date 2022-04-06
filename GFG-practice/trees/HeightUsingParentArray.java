// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class HeightUsingParentArray{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String a[] = in.readLine().trim().split("\\s+");
            int arr[] = new int[N];
            for(int i = 0;i < N;i++)
                arr[i] = Integer.parseInt(a[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.findHeight(N, arr));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    static int findHeight(int N, int arr[]){
        // code here
        int i, ht;
        int max = -1;
        for(int x = N - 1; x >=0; x--) {
            i = x;
            ht = 0;
            while(i >= 0) {
                i = arr[i];
                ht++;
            }
            if(ht > max) {
                max = ht;
            }
        }
        
        return max;
    }
}