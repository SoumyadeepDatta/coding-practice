import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'climbingLeaderboard' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     * 1. INTEGER_ARRAY ranked
     * 2. INTEGER_ARRAY player
     */

    public static int binSearch(List<Integer> arr, int n) {
        int l = 0, r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (arr.get(mid) <= n) {
                ans = arr.get(mid);

                r = mid - 1;
            }

            else {
                l = mid + 1;
            }
        }
        return ans;
    }

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        // Write your code here
        List<Integer> ans = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        int lr = 1;
        for (int i : ranked) {
            if (map.get(i) == null) {
                map.put(i, lr);
                lr++;
            }
        }
        int pr = lr, flag = 0;
        for (int i : player) {
            flag = 0;

            int bs = binSearch(ranked, i);

            if (bs != -1) {
                ans.add(map.get(bs));
                flag = 1;
            }

            if (flag == 0) {
                ans.add(pr);
            }
        }
        return ans;
    }

}

public class ClimbingLeaderboard {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int rankedCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> ranked = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int playerCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> player = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = Result.climbingLeaderboard(ranked, player);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining("\n"))
                        + "\n");

        bufferedReader.close();
        bufferedWriter.close();
    }
}
