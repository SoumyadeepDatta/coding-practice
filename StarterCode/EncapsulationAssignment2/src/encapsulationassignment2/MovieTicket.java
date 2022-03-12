//lex_auth_012907551251406848427
//do not modify the above line

package encapsulationassignment2;

public class MovieTicket {
	
	private int movieId;
	private int noOfSeats;
	private double costPerTicket;

	MovieTicket(int movieId, int noOfSeats) {
		this.movieId = movieId;
		this.noOfSeats = noOfSeats;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public double getCostPerTicket() {
		return costPerTicket;
	}

	public void setCostPerTicket(double costPerTicket) {
		this.costPerTicket = costPerTicket;
	}

	public double calculateTotalAmount() {
		switch (this.movieId) {
			case 111:
				this.costPerTicket = 7;
				break;
			case 112:
				this.costPerTicket = 8;
				break;
			case 113:
				this.costPerTicket = 8.5;
				break;
			default:
				this.costPerTicket = 0;
				break;
		}
		double totalAmount = this.costPerTicket * this.noOfSeats;
		totalAmount += (totalAmount / 50);
		return totalAmount;

	}
	
}
