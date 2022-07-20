import java.util.*;
import java.io.*;
public class PermsAndProducts {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int n = readInt();
        long min = Integer.MAX_VALUE;
        long[] arr = new long[n+5];
        long[] ans = new long[n+5];
        boolean flag = false;
        for(int i = 2;i<=n;i++){
            System.out.println("? " + 1 + " " + i);
            System.out.flush();
            long temp = readLong();
            if (temp > n) {
                flag = true;
            }
            min = Math.min(min,temp);
            arr[i] = temp;
        }
        if (!flag) {
            min = 1;
        }
        ans[1] = min;
        for(int i = 2;i<=n;i++){
            ans[i] = arr[i] / ans[1];
        }
        System.out.print("!");
        for(int i = 1;i<=n;i++){
            System.out.print(" " + ans[i]);
        }
        System.out.println();
        System.exit(0);

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