import java.util.Scanner;
/**
 * Problem Statement
Food Corner home delivers vegetarian and non-vegetarian meals to 
its customers based on the order.

A vegetarian combo costs $12 per plate and a non-vegetarian combo 
costs $15 per plate. Apart from the cost per plate of food, customers 
are also charged for home delivery based on the distance in kms from 
the restaurant to the delivery point. 
The delivery charges are as mentioned below:

Given the type of food, quantity (no. of plates) and the distance 
in kms from the restaurant to the delivery point, implement a 
program to calculate the final bill amount to be paid by a customer.

The below information must be used to check the validity of the data 
provided by the customer: 

Type of food must be 'V' for vegetarian and 'N' for non-vegetarian.
Distance in kms must be greater than 0.
Quantity ordered should be minimum 1.
If any of the input is invalid, the bill amount should be displayed as -1.
 */
public class SCSA4 {
    public static int calcBill (int qty, int dist, boolean veg){
        if (qty < 1 || dist <= 0){
            return -1;
        }
        int base = (veg)? 12 : 15;
        dist = (dist > 6)? (dist - 6) * 2 + 3 : (dist > 3)? dist - 3 : 0;
        return base * qty + dist;
    }
    public static void main(String[] args) {
        int qty, dist;
        Scanner sc = new Scanner(System.in);
        System.out.print("Food type = ");
        char ch = sc.nextLine().charAt(0);
        switch (ch) {
            case 'V':
                System.out.print("Qty. = ");
                qty = sc.nextInt();
                System.out.print("Distance = ");
                dist = sc.nextInt();
                System.out.println(calcBill(qty, dist, true));
                break;
            case 'N':
                System.out.print("Qty. = ");
                qty = sc.nextInt();
                System.out.print("Distance = ");
                dist = sc.nextInt();
                System.out.println(calcBill(qty, dist, false));
                break;
            default:
                System.out.println(-1);
                break;
        }
        sc.close();
    }
}
