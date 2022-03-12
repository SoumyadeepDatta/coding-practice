//lex_auth_012908251670077440518
//do not modify the above line

package staticassignment3;

public class Tester {
	
	 public static void main(String[] args) {
	        Booking booking1 = new Booking("jack@email.com", 100);
	        Booking booking2 = new Booking("jill@email.com", 350);

	        //Create more objects and add them to the bookings array for testing your code
	        
	        Booking[] bookings = { booking1, booking2 };
	              
	        for (Booking booking : bookings) {
	            if (booking.isBooked()) {
	                System.out.println(booking.getSeatsRequired()+" seats successfully booked for "+booking.getCustomerEmail());
	            }
	            else {
	                System.out.println("Sorry "+booking.getCustomerEmail()+", required number of seats are not available!");
	                System.out.println("Seats available: "+Booking.getSeatsAvailable());
	            }
	         }
	    }

}
