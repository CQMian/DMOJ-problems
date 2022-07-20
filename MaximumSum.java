import java.util.*;
import java.io.*;
public class MaximumSum {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = readInt();
        int[] dp = new int[n];
        int[] arr = new int[n];

        for(int i = 0; i<n; i++){
            int num = readInt();
            arr[i] = num;
        }
        dp[0] = arr[0];
        if(n>1){
            dp[1] = Math.max(arr[0],arr[1]);
        }

        //Arrays.sort(arr);
        for(int i = 2; i<n; i++){
            dp[i] = Math.max(dp[i-2]+arr[i],dp[i-1]);
        }
        System.out.println(dp[n-1]);
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