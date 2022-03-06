package dp;



public class DPTableTraversal {
    public static void main(String[] args) {
        int[][] m={
            {1,2,3,4,5},
            {6,7,8,9,10},
            {11,12,13,14,15},
            {16,17,18,19,20},
            {21,22,23,24,25}
        };
        
        printTable(m);
        System.out.println("--------------------------------------------------");
        printTableDiagonaly(m);
    }
    public static void printTable(int[][] dp) {
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[i].length;j++){
                System.out.print(dp[i][j]+"\t");
            }
            System.out.println();
        }
    }
    /**
     * Print the elements of the table diagonal wise
     */
    public static void printTableDiagonaly(int[][] dp) {
        System.out.print("Diagonal 1:\t");
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[i].length;j++){
                if(i==j) System.out.print(dp[i][j]+"\t");
            }
        }
        System.out.println();
        for(int diagonal=2;diagonal<=dp.length;diagonal++){
            System.out.print("Diagonal "+diagonal+":\t");
            for(int i=0;i<dp.length-diagonal+1;i++){
                int j=diagonal+i-1;
                System.out.print(dp[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
