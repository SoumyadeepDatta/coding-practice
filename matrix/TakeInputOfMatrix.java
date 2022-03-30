package matrix;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TakeInputOfMatrix {
    public static void main(String[] args) throws java.lang.Exception {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        int noOfRows = Integer.parseInt(br.readLine());
        int[][] matrix = new int[noOfRows][];
        for (int i = 0; i < noOfRows; i++) {
            matrix[i] = Arrays.stream(br.readLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
        }
        printMatrix(matrix);
    }

    public static void printMatrix(int[][] m) {
        for (int[] i : m) {
            for (int j : i) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
    }
}
