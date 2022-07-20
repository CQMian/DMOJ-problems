import java.util.*;
import java.io.*;
public class MimiAndPrimes {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
        int num = readInt();
        long gcf = readLong();
        for(int i = 0; i<num-1;i++){
            long newLong = readLong();
            gcf = gcd(gcf,newLong);
        }
        long output = maxPrimeFactors(gcf);
        System.out.println(output==-1 ? "DNE" : output);
	}
    static long gcd(long a, long b)
    {
      if (b == 0)
        return a;
      return gcd(b, a % b);
    }
    static long maxPrimeFactors(long n)
    {
        long maxPrime = -1;

        while (n % 2 == 0) {
            maxPrime = 2;
            n >>= 1;
        }
        while (n % 3 == 0) {
            maxPrime = 3;
            n = n / 3;
        }
        for (int i = 5; i <= Math.sqrt(n); i += 6) {
            while (n % i == 0) {
                maxPrime = i;
                n = n / i;
            }
            while (n % (i + 2) == 0) {
                maxPrime = i + 2;
                n = n / (i + 2);
            }
        }
        if (n > 4)
            maxPrime = n;
 
        return maxPrime;
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