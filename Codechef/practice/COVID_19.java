/* package codechef; // don't place package name! */

import java.util.*;


class COVID_19 {
    
    public static int sCnt(int s) {
        if((s & 1) == 1) {
		    return (s + 1) / 2;
		}
		else {
		    return s / 2;
		}
    }
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		// un-comment the below code to clear I/P buffer 
 		sc.nextLine();
		
		while(t-- > 0) {
		    // write codes here
		    String[] arr = sc.nextLine().split(" ");
		    int row = Integer.parseInt(arr[0]);
		    int col = Integer.parseInt(arr[1]);
		    
		    System.out.println(sCnt(row) * sCnt(col));
 		}
		
	}
}
