//lex_auth_012906901083594752251
//do not modify the above line

package stringexercise1;

public class Tester {
	
    public static String removeWhiteSpaces(String str){
		String res = "";
		String[] s = str.split("");
		for (String i : s) {
			if (!(i.equals(" "))) {
				res = res + i;
			}
		}
		return res;
	}
	
	public static void main(String args[]){
		String str = "Hello   How are you   ";
		str = removeWhiteSpaces(str);
		System.out.println(str);
	}

}
