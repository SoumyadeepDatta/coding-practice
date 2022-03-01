package arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


/**
 * @author Soumyadeep Datta, Roll 26, CSE 5TH SEM
 * SubsetGen: Generate subsets of a given integer array
 * First enter number of test cases
 * Then n space separated inputs for each test case for input array
 * Output is obtained instantly in each test case
 * This program works for arrays with duplicate elements as well
 */
public class SubsetGen {
    /**
     * This function is for generating the subsets
     * Returns a list of List<List<String>>
     * Explanation: Let an array arr = [1, 2, 5]
     * arr.length = 3
     * 2^3 in binary = 111 = 7 in decimal 
     * But it starts from 0
     * So total 8 elements (0 through 7) = total number of subsets
     * 
     * 210 -> index
     * add elements arr[2] if place of 2 contains 1
     * add elements arr[1] if place of 1 contains 1
     * add elements arr[0] if place of 0 contains 1
     * 
     * 000 -> null
     * 001 -> 1
     * 010 -> 2
     * 011 -> 1, 2
     * 100 -> 5
     * 101 -> 1, 5
     * 110 -> 2, 5
     * 111 -> 1, 2, 5
     * 
     * @param arr
     * @return
     */
    public static List<List<String>> subsetGen(String[] arr) {
        List<List<String>> subsets = new ArrayList<>();
        for(int i = 0; i < (1 << arr.length); i++){
            List<String> elements = new ArrayList<>();
            for (int j = 0; (i >> j) > 0; j++) {
                if (((i >> j) & 1) == 1) {
                    elements.add(arr[j]);
                }
            }
            
            subsets.add(elements);
        }
        return subsets;
    }
    /**
     * Formatted display for the subsets
     * @param arr
     */
    public static void subsetDisplay (String[] arr) {
        List<List<String>> subsetArray = subsetGen(arr);
        for(List<String> i: subsetArray){
            System.out.print("[");
            for(String j: i){
                /**
                 * If reference of j is equal to reference of the last element
                 * Then j is the last element
                 * Didn't use j.equals() method, as it only compares the values
                 * And the array might contain duplicate elements 
                 * So for e.g., if the array contains two 2(s)
                 * And if one of them is at the last position
                 * Then the last occurance of the 2 
                 * Won't print the trailing ", " 
                 */
                if (j == (i.get(i.size() - 1))) {
                    System.out.print(j);
                }
                else{
                    System.out.print(j + ", ");
                }
            }
            if (i == subsetArray.get(subsetArray.size() - 1)) {
                System.out.print("]");
            }
            else{
                System.out.print("], ");
            }
            
        }
        System.out.println();
    }
    /**
     * Driver 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception{
        
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        int t = Integer.parseInt(br.readLine());
        
        
        while (t-- > 0) {
            String[] arr = br.readLine().split(" ");
            subsetDisplay(arr);
        }
        
        
    }
 
}