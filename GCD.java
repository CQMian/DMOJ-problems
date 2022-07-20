import java.util.*;
import java.io.*;
public class GCD {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
        int num = readInt();
        int ans = 0;
        int[] arr = new int[100010], prefix = new int[100010], suffix = new int[100010];
        for(int i = 1; i<=num;i++){
            arr[i] = readInt();
            prefix[i] = gcd(prefix[i-1],arr[i]);
        }
        for (int i = num; i >= 1; i--) {
            suffix[i] = gcd(suffix[i + 1], arr[i]);
        }
        for(int i = 1; i<=num;i++){
            ans = Math.max(ans,gcd(prefix[i-1],suffix[i+1]));
        }
        System.out.println(ans);

	}
    public static int gcd(int a, int b){
        if (b == 0) 
            return a;
        else 
            return gcd(b, a % b);
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