// { Driver Code Starts
//Initial Template for Java
//problem link: https://practice.geeksforgeeks.org/problems/7d7f73a59ddc3f9c8046af6bd66ea67311bf877e/1#
//Initial Template for Java

import java.io.*;
import java.util.*;

class MatrixOperations_3_3_22
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            String str[] = read.readLine().trim().split("\\s+");
            int r = Integer.parseInt(str[0]);
            int c = Integer.parseInt(str[1]);
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                int k = 0;
                str = read.readLine().trim().split("\\s+");
                for(int j = 0; j < c; j++){
                  matrix[i][j] = Integer.parseInt(str[k]);
                  k++;
                }
            }
            Solution obj = new Solution();
            int[] p = obj.endPoints(matrix,r,c);
            System.out.print("(" +  p[0]+ ", " +  p[1]+ ")" +"\n");
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static int [] endPoints(int [][]arr, int m, int n){
        int[] ans=new int[2];
        int i=0,j=0,li=0,lj=0;
        int t=1;//0=u 1=r 2=d 3=l
        while(i>=0 && j>=0 && i<=m-1 && j<=n-1){
            li=i;lj=j;
            if(arr[i][j]==1) {
                arr[i][j]=0;
                t=(t+1)%4;
                
            }
            if(t==0) i--;
            if(t==1) j++;
            if(t==2) i++;
            if(t==3) j--;
        }
        ans[0]=li;ans[1]=lj;
        return ans;
    }
}