import java.util.*;
import java.lang.*;
import java.io.*;
/**
 * NUM239
 */
class NUM239 {
    public static void main (String[] args) throws java.lang.Exception
	{
		InputStreamReader rd = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(rd);
        // your code goes here
		try {
		    int t = Integer.parseInt(br.readLine());
            while(t-->0){
                String range = br.readLine();
                String R[] = range.split(" ");
                int l = Integer.parseInt(R[0]);
                int r = Integer.parseInt(R[1]);
                solve(l,r);
            }
		} catch(Exception e) {
		    return;
		}
	}
    public static void solve(int l,int r) throws java.lang.Exception{
        int cnt=0;
        if(r>=l){
            if((r>=1 && r<=Math.pow(10, 5))&&(l>=1 && l<=Math.pow(10, 5))){
                if(r==l){
                    if(check_pretty(r)){
                        System.out.println(1);
                    }
                    else{
                        System.out.println(0);
                    }
                }
                else{
                    for(int i=l;i<=r;i++){
                        if(check_pretty(i)){
                            cnt++;
                        }
                    }
                    System.out.println(cnt);
                }
            }
        }
    }
    public static boolean check_pretty(int n){
        if(n%10==2 || n%10==3 || n%10==9){
            return true;
        }
        return false;
    }
}