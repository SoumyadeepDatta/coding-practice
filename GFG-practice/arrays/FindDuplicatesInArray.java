// { Driver Code Starts
import java.io.*;
import java.util.*;

class FindDuplicatesInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            Solution g = new Solution();
            ArrayList<Integer> ans = g.duplicates(a, n);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        ArrayList<Integer> ans = new ArrayList<Integer>();
        Map<Integer,Integer> sol = new HashMap<>();
        Integer f;
        for(int i:arr){
            f = sol.get(i);
            if(f == null){
                sol.put(i,1);
            }
            else{
                sol.put(i,f+1);
            }
        }
        for(Map.Entry<Integer,Integer> entry : sol.entrySet()){
            if(entry.getValue() > 1){
                ans.add(entry.getKey());
            }
        }
        if(ans.size()==0){
            ans.add(-1);
        }
        Collections.sort(ans);   
        return ans;
    }
}
