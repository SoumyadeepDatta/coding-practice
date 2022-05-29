public class Factorial {
    public static int factRec(int n) {
        return (n == 0)? 1 : n * factRec(n - 1);
    }
    public static int factItr(int n) {
        int fact = 1;
        while(n > 0) {
            fact *= n--;
        }
        return fact;
    }
    public static void main(String[] args) {
        System.out.println(factRec(5));
        System.out.println(factItr(5));
    }
}
