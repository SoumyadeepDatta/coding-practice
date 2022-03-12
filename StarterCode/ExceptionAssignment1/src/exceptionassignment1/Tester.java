//lex_auth_012921592276475904109
//do not modify the above line

package exceptionassignment1;

public class Tester {
	public static void main(String[] args) {
		BusBooking booking = new BusBooking(101,"Orlando", "Regular");
		String result = booking.bookTrip("BIGBUS", 11);
		if(result.equals("Booking successful")){
			System.out.println(result);
			System.out.println("Total amount for the trip: " + booking.getTotalAmount());
		}
		else{
			System.out.println(result);
			System.out.println("Your booking was not successful, please try again!");
		}
	}
}
