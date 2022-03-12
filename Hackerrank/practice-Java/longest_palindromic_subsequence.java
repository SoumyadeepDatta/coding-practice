import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
// import java.util.Vector;

public class longest_palindromic_subsequence {
    static int[][] matrixDP;
    static List<String> inputList;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inpuString = scanner.nextLine();
        String[] inputStringSplit = inpuString.split("");
        // String to ArrayList
        inputList = new ArrayList<String>(Arrays.asList(inputStringSplit));
        // Vector<Vector<Integer>> matrixVector = new Vector<Vector<Integer>>(inputList.size());
        // for(Integer i=0;i<matrixVector.size();i++){
        //     for(Integer j=0;j<matrixVector.get(i).size();i++){
        //         matrixVector.get(i).add(1);
        //     }
        // }
        // for(Integer i=0;i<matrixVector.size();i++){
        //     for(Integer j=0;j<matrixVector.get(i).size();i++){
        //         System.out.print(matrixVector.get(i).get(j)+"\t");
        //     }
        //     System.out.println();
        // }
        matrixDP = new int[inputList.size()][inputList.size()]; 
        System.out.println(dp(0, inputList.size()-1));
        printMatrixDP();
        /*
        // ArrayList to String 
        System.out.println(String.join("", inputList));
        */
        scanner.close();
    }
    public static void printMatrixDP(){
        for(int[] i:matrixDP){
            for(int j:i){
                System.out.print(j+"\t");
            }
            System.out.println();
        }
    }
    public static int max(int x, int y){
        if(x<y){
            return y;
        }
        else{
            return x;
        }
    }
    public static int dp(int i, int j) {
        System.out.print(i+" "+j+"\t");
        for(int a=i;a<=j;a++){
            System.out.print(inputList.get(a));
        }
        System.out.println();
        if(i==j){
            matrixDP[i][j] = 1;
            return matrixDP[i][j];
        }
        else{
            if(i+1==j){
                if(inputList.get(i).equals(inputList.get(j))){
                    matrixDP[i][j] = 2;
                    return matrixDP[i][j];
                }
                else{
                    matrixDP[i][j] = 1;
                    return matrixDP[i][j];
                }
            }
            else{
                
                if(inputList.get(i).equals(inputList.get(j))){
                    matrixDP[i][j] = 2 + dp(i+1, j-1);
                    return matrixDP[i][j];
                }
                else{
                    matrixDP[i][j] = max(dp(i+1, j), dp(i, j-1));
                    return matrixDP[i][j];
                }
            }
            
        }
        
    }
}
