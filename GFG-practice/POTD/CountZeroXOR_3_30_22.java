// { Driver Code Starts
//Initial Template for Java

//Initial Template for Java

//Initial Template for Java

//Initial Template for Java

//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class CountZeroXOR_3_30_22 {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    String line = br.readLine();
		    String[] element = line.trim().split("\\s+");
		    int sizeOfArray = Integer.parseInt(element[0]);
		    
		    int arr [] = new int[sizeOfArray];
		    
		    line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    for(int i = 0;i<sizeOfArray;i++){
		        arr[i] = Integer.parseInt(elements[i]);
		    }
		    
		    
		    Complete obj = new Complete();
		    long res = obj.calculate(arr, sizeOfArray);
		    System.out.println(res);
		}
	}
}




// } Driver Code Ends


//User function Template for Java


class Complete{
    
   
    // Function for finding maximum and value pair
    public static long calculate (int arr[], int n) {
        //Complete the function
        Arrays.sort(arr);
        Map<Integer, Long> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0l) + 1);
        }
        Long cnt = 0l;
        for (Map.Entry<Integer, Long> e : map.entrySet()) {
            if (e.getValue() > 1) {
                cnt += fact(e.getValue()) / 2;
            }
        }
        return cnt;
    }
    
    public static long fact (long n) {
        if (n <= 1) {
            return 1;
        }
        return n * fact(n - 1);
    }
}


