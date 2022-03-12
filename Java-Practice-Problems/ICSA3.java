import java.util.Scanner;
/**
 * Implement a program to find out whether a number is divisible 
 * by the sum of its digits. 
 */
public class ICSA3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("No. = ");
        int n = sc.nextInt();
        int sum = 0, t = n;
        while (t > 0){
            sum += t % 10;
            t = t / 10;
        }
        System.out.println((n % sum == 0)? "Yes" : "No");
        sc.close();
    }
}