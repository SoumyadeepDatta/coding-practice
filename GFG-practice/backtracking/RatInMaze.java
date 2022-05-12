// { Driver Code Starts
// Initial Template for Java

import java.util.*;

class RatInMaze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++)
                    a[i][j] = sc.nextInt();

            // Solution obj = new Solution();
            ArrayList<String> res = Solution.findPath(a, n);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
        sc.close();
    }
}
// } Driver Code Ends

// User function Template for Java

// m is the given matrix and n is the order of matrix
class Solution {
    public static ArrayList<String> ans = new ArrayList<>();
    public static int[][] visited;

    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        visited = new int[n][n];
        ans.clear();
        solve(0, 0, m, visited, n, "");
        Collections.sort(ans);
        return ans;
    }

    public static void solve(int i, int j, int[][] m, int[][] v, int n, String p) {
        v[i][j] = 1;
        if (m[i][j] == 0) {
            return;
        }
        if (i == n - 1 && j == n - 1) {
            ans.add(p);
        } else {
            // up
            if (i > 0) {
                if (v[i - 1][j] == 0) {
                    solve(i - 1, j, m, v, n, p + "U");
                    v[i - 1][j] = 0;
                }
            }
            // down
            if (i < n - 1) {
                if (v[i + 1][j] == 0) {
                    solve(i + 1, j, m, v, n, p + "D");
                    v[i + 1][j] = 0;
                }
            }
            // left
            if (j > 0) {
                if (v[i][j - 1] == 0) {
                    solve(i, j - 1, m, v, n, p + "L");
                    v[i][j - 1] = 0;
                }
            }
            // right
            if (j < n - 1) {
                if (v[i][j + 1] == 0) {
                    solve(i, j + 1, m, v, n, p + "R");
                    v[i][j + 1] = 0;
                }
            }

        }

    }
}

/**
 * 
 * 1
 * 4
 * 1
 * 0
 * 0
 * 0
 * 1
 * 1
 * 0
 * 1
 * 1
 * 1
 * 0
 * 0
 * 0
 * 1
 * 1
 * 1
 * 
 */

/**
 * 
 * 1
 * 4
 * 1
 * 0
 * 0
 * 0
 * 1
 * 1
 * 0
 * 1
 * 1
 * 1
 * 0
 * 0
 * 0
 * 1
 * 1
 * 1
 * 
 * 
 */