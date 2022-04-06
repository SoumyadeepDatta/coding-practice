/**
 * StringPermutation
 */
public class StringPermutation {
    public static void printPermutations(String s, String ans) {
        if(s.length() == 0) {
            System.out.println(ans);
            return;
        }
        for(int i = 0; i < s.length(); i++) {
            String s1;
            char c= s.charAt(i);
            if(i == 0) {
                s1 = s.substring(i + 1);
            }
            else if(i == s.length() - 1) {
                s1 = s.substring(0, i);
            }
            else {
                s1 = s.substring(0, i) + s.substring(i + 1);
            }
            printPermutations(s1, ans + c);
        }
    }
    public static void main(String[] args) {
        printPermutations("above", "");
    }
}