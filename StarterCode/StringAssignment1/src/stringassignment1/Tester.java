//lex_auth_012907356798779392287
//do not modify the above line

package stringassignment1;

public class Tester {
	
	 public static String moveSpecialCharacters(String str){
		String l = "";
		String s = "";
		for (int i = 0; i < str.length(); i++){
				if ((str.charAt(i) >= 65 && str.charAt(i) <= 90) || (str.charAt(i) >= 97 && str.charAt(i) <= 122)){
					l = l + str.charAt(i);
				}
				else {
					s = s + str.charAt(i);
				}
				
			}
			return l + s;
		}
		
		public static void main(String args[]){
		    String str = "He@#$llo!*&";
		    System.out.println(moveSpecialCharacters(str));
		}

}
