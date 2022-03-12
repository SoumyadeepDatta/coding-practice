import java.util.Scanner;

/**
 * Divisors
 */
public class Divisors {
    public static int sumOfDivisors(int n){
        if (n <= 1) {
            return n;
        }
        int flag = 0;
        if (Math.floor(Math.sqrt((double) n)) == Math.ceil(Math.sqrt((double) n))) {
            flag = 1;
        }
        int sum = 0;
        for (int i = 1; i <= Math.sqrt((double) n); i++) {
            if (n % i == 0) {
                if (flag == 1 && i == Math.sqrt((double) n)) {
                    sum += i;
                }
                else{
                    sum += i + n / i;
                }
                // System.out.print(i + " " + (n/i) + " ");
            }
        }
        // System.out.println();
        
        return sum;
    }
    public static void main(String[] args) {
        int n = (new Scanner(System.in)).nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i + " is " + sumOfDivisors(i));
        }
    }
}