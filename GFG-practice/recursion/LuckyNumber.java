

/**
 * Link to the problem: https://practice.geeksforgeeks.org/problems/lucky-numbers2911/1/?page=1&difficulty[]=0&status[]=unsolved&category[]=Recursion&sortBy=submissions#
 */


import java.util.*;
import java.io.*;
import java.lang.*;

class LuckyNumber
{
    public static void main(String args[])throws IOException
    {
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());//testcases
        
        while(t-- > 0)
        {
            int n = Integer.parseInt(reader.readLine());//input n
            //printing "1" if isLucky() returns true else "0"
            Solution s = new Solution();
            System.out.println(s.isLucky(n)? "1" : "0");
        }
    }
}// } Driver Code Ends


//User function Template for Java



class Solution
{
    // Complete the function
    // n: Input n
    // Return True if the given number is a lucky number else return False
    public static boolean isLucky(int n)
    {
        // Your code here
        /*
        1,2,3,4,5,6,7,8,9,10...
        1,3,5,7,9,11,13,15,17,19...
        1,3,7,9,13,15,19...
        1,3,7,13,15,19...
        1,3,7,13,19...
        
        
        19->1
        10->2
        7->3
        */
        
        return iL(n,n,2);
        
    }
    public static boolean iL(int n, int p, int t){
        if(p<t) return true;
        if(p%t==0) return false;
        
        return iL(n,p-p/t,t+1);
    }
    
}









