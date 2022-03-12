//lex_auth_012907551251406848427
//do not modify the above line

package encapsulationassignment2;

public class Tester {
	
	public static void main(String[] args) {
        MovieTicket movieTicket = new MovieTicket(114, 3);
        double amount = movieTicket.calculateTotalAmount();
        if (amount==0)
            System.out.println("Sorry! Please enter valid movie Id and number of seats");
        else
            System.out.println("Total amount for booking : $" + Math.round(amount*100)/100.0);
    }

}
