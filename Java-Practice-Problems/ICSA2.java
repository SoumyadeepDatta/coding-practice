import java.util.Scanner;
/**
 * Implement a program to find the number of rabbits and chickens in a farm. 
 * Given the number of heads and legs of the chickens and rabbits in a farm, 
 * identify and display the number of chickens and rabbits in the farm.

 * If the given input cannot make a valid number of rabbits and chickens, 
 * then display an appropriate message.
 */
public class ICSA2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Head = ");
        int head = sc.nextInt();
        System.out.print("Leg = ");
        int leg = sc.nextInt();
        int chicken, rabbit;
        if (Math.ceil((double) leg / 2) != Math.floor((double) leg / 2) || head >= leg) {
            System.out.println("Not found");
            sc.close();
            return;
        }
        chicken = 2 * head - leg / 2;
        rabbit = leg / 2 - head;
        if (chicken < 0 || rabbit < 0){
            System.out.println("Not found");
            sc.close();
            return;
        }
        System.out.println("Chicken = " + chicken + "\nRabbit = " + rabbit);
        sc.close();
    }
}
