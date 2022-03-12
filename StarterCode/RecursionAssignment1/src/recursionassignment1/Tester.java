//lex_auth_012907378628927488293
//do not modify the above line

package recursionassignment1;

public class Tester {
	public static int findFibonacci(int n) {
		if (n <= 2) {
			return n - 1;
		}
		return findFibonacci(n - 1) + findFibonacci(n - 2);
	}

	    public static void main(String args[]) {
	        int n = 0;
	        if(n!=0)
	            System.out.println(findFibonacci(n));
	        else
	            System.out.println("Please enter a valid value for n");
	    }
}
