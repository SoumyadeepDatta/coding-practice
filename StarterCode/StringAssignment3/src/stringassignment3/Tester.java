//lex_auth_012906912922468352259
//do not modify the above line

package stringassignment3;

public class Tester {

	public static String reverseEachWord(String str) {
		String[] sent = str.split(" ");
		String rev;
		String res = "";
		for (int i = 0; i < sent.length; i++){
			rev = "";
			for (String w : sent[i].split("")){
				rev = w + rev;
			}
			res = res + rev;
			if (i != sent.length - 1){
				res = res + " ";
			}
		}
		return res;
	}

	public static void main(String args[]) {
		String str = "all cows eat grass";
		System.out.println(reverseEachWord(str));
	}

}
