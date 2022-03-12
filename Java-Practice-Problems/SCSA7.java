import java.util.Scanner;
// program to find next date in dd-mm-yyyy format
public class SCSA7 {
    public static boolean isLeap (int yr) {
        return (yr % 400 == 0)? true : (yr % 100 == 0)? false : (yr % 4 == 0)? true : false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Day = ");
        int day = sc.nextInt();
        System.out.print("Month = ");
        int month = sc.nextInt();
        System.out.print("Year = ");
        int year = sc.nextInt();
        // not feasible
        if (day == 0 || month == 0 || year == 0 || month > 12 || day > 31){
            sc.close();
            return;
        }
        // month w 31 d
        if ((month <= 7 && (month & 1) == 1) || ((month > 7) && (month & 1) == 0)) {
            System.out.println((day == 31)? ((month == 12)? "1-1-" + ++year : "1-" + ((++month - 1) % 12 + 1) + "-" + year) : ++day + "-" + month + "-" + year);
        }
        // month w 30 d or less
        else {
            // feb is exception
            if (month == 2){
                if ((isLeap(year) && day > 29) || ((! isLeap(year) && day > 28))){
                    sc.close();
                    return;
                }
                else if ((isLeap(year) && day == 29) || ((! isLeap(year) && day == 28))) {
                    System.out.println("1-" + ((++month - 1) % 12 + 1) + "-" + year);
                }
                else {
                    System.out.println(++day + "-" + month + "-" + year);
                }
            }
            else {
                // not feasible for month w 30 d
                if (day == 31) {
                    sc.close();
                    return;
                }
                System.out.println((day == 30)? "1-" + ((++month - 1) % 12 + 1) + "-" + year : ++day + "-" + month + "-" + year);
            }
        }

        sc.close();
    }
}
