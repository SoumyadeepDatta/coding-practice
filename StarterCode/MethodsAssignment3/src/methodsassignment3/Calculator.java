//lex_auth_012890546057764864103
//do not modify the above line

package methodsassignment3;

public class Calculator {
	//Implement your code here
	public int num;
	
	public int sumOfDigits () {
		int sum = 0;
		while (num > 0) {
			sum += num % 10;
			num = num / 10;
		}
		return sum;
	}
}
