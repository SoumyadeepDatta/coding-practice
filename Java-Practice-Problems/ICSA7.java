import java.util.Scanner;

public class ICSA7 {
    public static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        if (b == 0) {
            return a;
        }
        if (a == 1 || b == 1) {
            return 1;
        }
        // euclid's formula for gcd
        while (a != b) {
            if (a > b) {
                a = a - b;
            }
            else {
                b = b - a;
            }
        }
        return a;
    }
    public static int lcm(int a, int b) {
        /**
         * lcm = gcd * (a / gcd) * (b / gcd);
         */
        return a * b / gcd(a, b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();
        System.out.println("LCM = " + lcm(a, b));
        System.out.println("GCD = " + gcd(a, b));
        sc.close();
    }
}
