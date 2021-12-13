import java.io.*;
import java.lang.*;
import java.util.*;
/**
 *  76543210 <-- Position of bits        
 *  10111011
 *  ^      ^
 * MSB    LSB
 * Set bit = 1
 * Unset bit = 0
 * 1000 - 1 = 111
 * 100000 - 1 = 11111
 * 1000... (upto n times) ...000 = 111... (upto n times) ...111
 * In binary (2 to the power n) - 1 = all bits 1 
 */
public class Bin_bits {
    public static void main(String[] args) throws java.lang.Exception{
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        // Check wether 'i'th bit of a number n is set or not
        // i starts from 0
        int n = Integer.parseInt(br.readLine());
        System.out.println(Integer.toBinaryString(n));
        int i = Integer.parseInt(br.readLine());
        System.out.println("n = "+Integer.toBinaryString(n)+" i = "+i);
        // System.out.println("i = "+Integer.toBinaryString(i));
        // System.out.println(Integer.toBinaryString(n&(1<<i)));
        if((n&(1<<i)) == 0){    // check wether set or unset
            System.out.println("Unset");
            System.out.print("Making it set bit...\t");
            System.out.println(decimal_to_bin(n|(1<<i)));
            /**
             * to make 'i'th bit unset...
             * say n = 1001 and i = 2 . after making 2nd bit(starting from 0) unset it will look like 1001
             * so we need to operate '|' on n with 0100 (every bit 0 except 'i'th bit)
             * to generate 0100 we write (1<<i) where i = 2
             *   1001
             * | 0100
             * ------
             *   1101 (answer)
             */
        }
        else{
            System.out.println("Set");
            System.out.print("Making it unset bit...\t");
            // ~n means 1's compliment of n
            System.out.println(decimal_to_bin(n&(~(1<<i))));
            /**
             * to make 'i'th bit unset...
             * say n = 1101 and i = 2 . after making 2nd bit(starting from 0) unset it will look like 1001
             * so we need to operate '&' on n with 1011 (every bit 1 except 'i'th bit)
             * to generate 1011 we first generate 0100 which is (1<<i) where i = 2
             * then we take 1's compliment of it. i.e ~(1<<i)
             *   1101
             * & 1011
             * ------
             *   1001 (answer)
             */
        }
        // toggle every bit (1's compliment) with XOR (^)
        /**
         * 1 XOR 0 = 01 = 1 (ignore carry here)
         * 1 XOR 1 = 10 = 0 (ignore carry here)
         * if we want to toggle 1st bit of 101
         *   101
         * ^ 010 (got by shifting left 1 by i position where i = 1)
         * -----
         *   111 (answer)
         */
        System.out.println("Original number = "+decimal_to_bin(n));
        System.out.println("Toggling '"+i+"'th bit...\t"+decimal_to_bin(n^(1<<i)));
        System.out.println("Decimal to binary = "+decimal_to_bin(n));

        // count the total number of set bits
        // for 32 bit number i = 31 to 0 (total 32)
        int set_cnt = 0;
        for (i = 31; i >= 0; --i) {
            if (((n>>i)&1) == 1){
                set_cnt++;
            }
        }
        System.out.println("Total set bits in "+decimal_to_bin(n)+" = "+set_cnt);
    }
    public static long decimal_to_bin(int n){
        String bin = "";
        // for 32 bit number i = 31 to 0 (total 32)
        for (int i = 31; i >= 0; --i) {
            bin += (n>>i)&1;
        }
        return Long.parseLong(bin);
    }
}
