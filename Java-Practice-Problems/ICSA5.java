import java.util.Scanner;

public class ICSA5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("No. = ");
        int n = sc.nextInt();
        int len = (int) Math.floor(Math.log10((double) n)) + 1;
        int t = n, sum = 0;
        while (t > 0) {
            sum += Math.pow(t % 10, len);
            t = t / 10;
        }
        System.out.println((n == sum)? "Armstrong" : "Not Armstrong");
        sc.close();
    }
}
