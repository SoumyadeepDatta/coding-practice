import java.util.Scanner;
/**
 * Implement a program to check whether a given number is a lucky number.

 * A lucky number is a number whose sum of squares of every even-positioned 
 * digit (starting from the second position) is a multiple of 9.

 * E.g. - 1623 = 62+32 = 45 is a multiple of 9 and hence is a lucky number.
 */
public class ICSA6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1, sum = 0, rev = 0, t = n;
        while (t > 0){
            rev = rev * 10 + t % 10;
            t = t / 10;
        }
        while (rev > 0) {
            if ((i & 1) == 1) {
                i++;
                rev = rev / 10;
            }
            else {
                sum += Math.pow(rev % 10, 2);
                i++;
                rev = rev / 10;
            }
        }
        // System.out.println(sum);
        System.out.println((sum % 9 == 0)? "Lucky" : "Not lucky");
        sc.close();
    }
}
