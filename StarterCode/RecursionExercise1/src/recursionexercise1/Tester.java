//lex_auth_012907373615120384291
//do not modify the above line

package recursionexercise1;

public class Tester {
	 
    public static int findReverse(int num, int temp){
        if (num == 0) {
            return temp;
        }
        else {
            return findReverse(num / 10, temp * 10 + num % 10);
        }
	}
	
	public static void main(String args[]){
	    int num = 12321;
        int reverseNum = findReverse(num,0);
        if(num == reverseNum)
            System.out.println(num +" is a palindrome!");
        else
            System.out.println(num +" is not a palindrome!");
	}
}
