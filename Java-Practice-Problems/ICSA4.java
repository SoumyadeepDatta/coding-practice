import java.util.Scanner;
/**
 * Implement a program to find out whether a number is a seed of another number.
 * A number X is said to be a seed of number Y if multiplying X by its every 
 * digit equates to Y.
 * E.g.: 123 is a seed of 738 as 123*1*2*3 = 738
 */
public class ICSA4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("No. = ");
        int num = sc.nextInt();
        System.out.print("Seed = ");
        int n = sc.nextInt();
        int sum = 1, t = n;
        while (t > 0){
            sum *= t % 10;
            t = t / 10;
        }
        System.out.println((n * sum == num)? "Yes" : "No");
        sc.close();
    }
}
