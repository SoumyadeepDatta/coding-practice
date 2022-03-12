//lex_auth_012909487205638144539
//do not modify the above line

package arrayassignment5;

public class Tester {
	
	public static int[] findNumbers(int num1, int num2) {
		int[] numbers = new int[6];

		// Implement your code here

		return numbers;
	}

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 30;

		int[] numbers = findNumbers(num1, num2);
		if (numbers[0] == 0) {
			System.out.println("There is no such number!");
		} else {
			for (int index = 0; index <= numbers.length - 1; index++) {
				if (numbers[index] == 0) {
					break;
				}
				System.out.println(numbers[index]);
			}
		}

	}

}
