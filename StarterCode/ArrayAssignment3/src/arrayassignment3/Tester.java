//lex_auth_012909125609562112532
//do not modify the above line

package arrayassignment3;

public class Tester {
	public static boolean isLeap(int yr) {
		if (yr % 400 == 0) {
			return true;
		}
		else if (yr % 100 == 0) {
			return false;
		}
		else if (yr % 4 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	public static int[] findLeapYears(int year) {
		int leapYears[] = new int[15];
		int i = 0;
		while (i < 15){
			if (isLeap(year)){
				leapYears[i++] = year;
				year++;
			}
			else {
				year++;
			}
		}
		return leapYears;
	}

	public static void main(String[] args) {
		int year = 2000;
		int[] leapYears;
		leapYears = findLeapYears(year);
		for (int index = 0; index < leapYears.length; index++) {
			System.out.println(leapYears[index]);
		}
	}
}
