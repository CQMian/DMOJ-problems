import java.util.*;
import java.io.*;
public class Knapsack1 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static class pair{
        int val;
        int weight;
        public pair(int val, int weight){
            this.val = val;
            this.weight = weight;
        }
    }
    public static void main(String[] args) throws IOException {
        int items = readInt();
        int max = readInt();
        long[] dp = new long[max+1];
        pair[] arr = new pair[items+1];

        for(int i = 1; i<=items; i++){
            int weight = readInt();
            int value = readInt();
            arr[i] = new pair(value, weight);
        }

        for(int i = 1; i<=items; i++){
            for(int j = max; j>=0; j--){
                if(j == 0||(arr[i].weight>j)){
                    continue;
                }
                dp[j] = Math.max(dp[j], arr[i].val + dp[j-arr[i].weight]);
            }
        }

        System.out.println(dp[max]);
    }
    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine().trim());
        }
    return st.nextToken();
    }

    static long readLong() throws IOException {
        return Long.parseLong(next());
    }

    static int readInt() throws IOException {
        return Integer.parseInt(next());
    }

    static double readDouble() throws IOException {
        return Double.parseDouble(next());
    }

    static char readCharacter() throws IOException {
        return next().charAt(0);
    }

    static String readLine() throws IOException {
        return br.readLine().trim();
    }
}