//lex_auth_012906904764366848254
//do not modify the above line

package stringassignment4;

public class Tester {
	
	public static int findHighestOccurrence(String str){
		char[] arr = new char[257];
		for (int i = 0; i < str.length(); i++){
			if (arr[str.charAt(i)] == 0) {
				arr[str.charAt(i)] = 1;
			}
			else {
				arr[str.charAt(i)] += 1;
			}
		}
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	public static void main(String args[]){
		String str = "success";
	    System.out.println(findHighestOccurrence(str));
	}
}
