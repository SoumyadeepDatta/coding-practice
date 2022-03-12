import java.util.Scanner;

public class SCSA5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Account No. = ");
        int accNo = sc.nextInt();
        System.out.print("Salary = ");
        int sal = sc.nextInt();
        System.out.print("Account Balance = ");
        int accBal = sc.nextInt();
        System.out.print("Loan Type (Car/House/Business) = ");
        sc.nextLine();
        String lType = sc.nextLine();
        System.out.print("Expected Loan Amount = ");
        int lExp = sc.nextInt();
        System.out.print("Expected EMIs = ");
        int eExp = sc.nextInt();
        sc.close();
        if (Math.floor(Math.log10((double) accNo)) + 1 == 4 && Integer.toString(accNo).startsWith("1")) {
            if (accBal >= 1000) {
                switch (lType) {
                    case "Car":
                        System.out.println((lExp <= 500000 && eExp <= 36 && sal > 25000)? "Eligible Loan Amount = 500000\nEligible EMIs = 36": "Not eligible for loan!!!");
                        break;
                    case "House":
                        System.out.println((lExp <= 6000000 && eExp <= 60 && sal > 50000)? "Eligible Loan Amount = 6000000\nEligible EMIs = 60": "Not eligible for loan!!!");
                        break;
                    case "Business":
                        System.out.println((lExp <= 7500000 && eExp <= 84 && sal > 75000)? "Eligible Loan Amount = 7500000\nEligible EMIs = 84": "Not eligible for loan!!!");
                        break;
                    default:
                        System.out.println("Invalid loan type!!!");
                        break;
                }
            } else {
                System.out.println("A minimum of $1000 account balance is required.");
            }
        }
        else{
            System.out.println("Invalid account number!!!");
        }
    }
}
