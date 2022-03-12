import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.*;
/**
 * Solution
 */

public class RansomNote {
    static List<String> magazine;
    static List<String> note;
    
    static Map<String,Integer> magazineMap = new HashMap<>();
    static Map<String,Integer> noteMap = new HashMap<>();
    

    public static void solve(List<String> magazine, List<String> note) throws Exception{
        Integer freq;

        for(String i:magazine){
            freq = magazineMap.get(i);
            if(freq == null){
                magazineMap.put(i, 1);
            }
            else{
                magazineMap.put(i, freq+1);
            }
        }

        for(String i:note){
            freq = noteMap.get(i);
            if(freq == null){
                noteMap.put(i, 1);
            }
            else{
                noteMap.put(i, freq+1);
            }
        }

        for(String i:note){
            if((magazineMap.get(i)==null)||(magazineMap.get(i)<noteMap.get(i))){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
        
    }
    public static void main(String[] args) throws Exception{
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        String[] ranges = br.readLine().split(" ");
        int m = Integer.parseInt(ranges[0]);
        int n = Integer.parseInt(ranges[1]);
        
        String[] l1 = br.readLine().split(" ");
        String[] l2 = br.readLine().split(" ");

        l1 = Arrays.copyOfRange(l1, 0, l1.length);
        l2 = Arrays.copyOfRange(l2, 0, l2.length);
        

        magazine = Arrays.asList(l1);
        note = Arrays.asList(l2);

        solve(magazine, note);
        
        
    }
}
