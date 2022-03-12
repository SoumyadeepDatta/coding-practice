//lex_auth_012906913553276928258
//do not modify the above line

package stringassignment5;

public class Tester {

	public static String removeDuplicatesandSpaces(String str) {
		String res = "";
		char[] arr = new char[257];
		for (int i = 0; i < str.length(); i++){
			if (arr[str.charAt(i)] == 0 && str.charAt(i) != ' '){
				res = res + str.charAt(i);
				arr[str.charAt(i)] += 1;
			}
		}
		return res;
	}

	public static void main(String args[]) {
		String str = "object oriented programming";
		System.out.println(removeDuplicatesandSpaces(str));
	}

}
