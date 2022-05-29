public class GCD {
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
    public static void main(String[] args) {
        System.out.println(gcd(7, 21));
    }
}
