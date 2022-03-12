import java.math.BigDecimal;
import java.util.*;
class BigDecimalEg{
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();
        
        
        int j;
        String t;
        //Write your code here
        for(int i=1;i<n;i++){
            j = i;
            while(j>0 && ((new BigDecimal(s[j]).compareTo(new BigDecimal(s[j-1])))==1)){
                t = s[j];
                s[j] = s[j-1];
                s[j-1] = t;
                j -= 1;
            }
        }

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}