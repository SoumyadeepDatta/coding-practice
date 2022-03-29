import java.util.Scanner;

/**
 * 
 * If the number is a multiple of 3, display "Zip".
 * 
 * If the number is a multiple of 5, display "Zap".
 * 
 * If the number is a multiple of both 3 and 5, display "Zoom",
 * 
 * For all other cases, display "Invalid".
 * 
 */
public class SCSA8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("No. = ");
        int n = sc.nextInt();
        System.out.println(
                (n % 3 == 0 && n % 5 == 0) ? "Zoom" : ((n % 3 == 0) ? "Zip" : ((n % 5 == 0) ? "Zap" : "Invalid")));
        sc.close();
    }
}
