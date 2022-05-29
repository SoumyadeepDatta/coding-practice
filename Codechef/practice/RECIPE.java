/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class RECIPE {
    public static int gcd(int a, int b) {
        if (a == 0)
            return b;

        return gcd(b % a, a);
    }

    public static void main(String[] args) {

        // // your code goes here

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        sc.nextLine();

        while (t-- > 0) {
            String s = sc.nextLine();
            String[] srr = s.split(" ");
            int[] arr = new int[srr.length];
            for (int i = 0; i < srr.length; i++) {
                arr[i] = Integer.parseInt(srr[i]);
            }
            int g = gcd(arr[1], arr[1]);
            for (int i = 2; i < arr.length; i++) {
                g = gcd(g, arr[i]);
            }
            for (int i = 1; i < arr.length; i++) {
                System.out.print(arr[i] / g + " ");
            }
            System.out.println();
        }

    }
}
