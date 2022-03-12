import java.util.Scanner;

public class SCSA6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("No. of $1 = ");
        int y = sc.nextInt(); // $1
        System.out.print("No. of $5 = ");
        int x = sc.nextInt(); // $5
        System.out.print("Amount = ");
        int z = sc.nextInt();
        if (x < z / 5) {
            System.out.println(((z / 5 - x) * 5 + z % 5 > y)? -1 : "$1 = " + ((z / 5 - x) * 5 + z % 5) + "\n$5 = " + x);
        }
        else{
            System.out.println((y < z % 5)? -1 : "$1 = " + z % 5 + "\n$5 = " + z / 5);
        }
        sc.close();
    }
}
