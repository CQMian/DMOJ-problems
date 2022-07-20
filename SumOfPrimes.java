import java.util.*;
import java.io.*;
public class SumOfPrimes {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
    static int max = 10000;

    static long dp[] = new long[max + 1];
 
    static void sieve()
    {
        int arr[] = new int[max + 1];
        arr[0] = 1;
        arr[1] = 1;
 
        for (int i = 2; i <= Math.sqrt(max); i++)
 
            if (arr[i] == 0)
                for (int j = i * i; j <= max; j += i)
                    arr[j] = 1;
 
        long sum = 0;
 
        for (int i = 1; i <= max; i++) {
            if (arr[i] == 0)
                sum += i;
 
            dp[i] = sum;
        }
    }
    public static void main(String[] args) throws IOException
    {
        sieve();
        int num = readInt();
        for(int i = 0; i <num;i++){
            int start = readInt();
            int end = readInt();
        
            System.out.println(dp[end] - dp[start - 1]);
        }
    }
 
	static String next() throws IOException {
		while (st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine().trim());
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