public class BottomDiagonal {
    public static void main(String[] args) {
        int[][] m = {
                { 1, 2, 3, 4, 5 },
                { 6, 7, 8, 9, 10 },
                { 11, 12, 13, 14, 15 },
                { 16, 17, 18, 19, 20 },
                { 21, 22, 23, 24, 25 }
        };
        for (int[] i : m) {
            for (int j : i) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }

        printMatrixBottomDiagonal(m);

    }

    public static void printMatrixBottomDiagonal(int[][] m) {
        int sum = m.length - 1 + m[0].length - 1;
        for (int s = sum; s >= 0; s--) {
            System.out.print("Diagonal " + (sum - s) + "\t:\t");
            for (int x = m.length - 1; x >= 0; x--) {
                for (int y = 0; y < m[x].length; y++) {
                    if (s == x + y) {
                        System.out.print(m[x][y] + "\t");
                    }
                }
            }
            System.out.println();
        }
    }
}
