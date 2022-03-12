//lex_auth_012907414165159936311
//do not modify the above line

package recursionassignment2;

public class Tester {
	  	public static double findHPSum(int num) {
			if (num == 1) {
				return 1;
			}
			return (1.0 / num) + findHPSum(num - 1);
	    }
	    
	    public static void main(String args[]) {
	        System.out.println(findHPSum(3));
	    }
}
