import java.util.Scanner;

public class ICSA1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0, t = n;
        while (t > 0) {
            rev = rev * 10 + (t % 10);
            t = t / 10;
        }
        System.out.println((rev == n)? "Palindrome" : "Not Palindrome");
        sc.close();
    }
}
