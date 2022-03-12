//lex_auth_012906905893519360253
//do not modify the above line

package stringassignment2;

public class Tester {

	public static boolean checkPalindrome(String str) {
		String rev = "";
		for (String s : str.split("")){
			rev = s + rev;
		}
		return (rev.equals(str))? true : false;
	}

	public static void main(String args[]) {
		String str = "radar";
		if (checkPalindrome(str))
			System.out.println("The string is a palindrome!");
		else
			System.out.println("The string is not a palindrome!");
	}

}
