import java.util.*;
import java.io.*;
public class ArithGeo {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static long mod = 1000000007;
    public static void main(String[] args) throws IOException {
        
        int numTests = readInt();
        for(int i = 0; i<numTests; i++){
            long first = readLong();
            long second = readLong();
            long third = readLong();
            long k = readLong();
            long num = 0;
            if((third-second) == (second-first)){
                long increase = (second-first);
                num = first + (k-1)*(increase)%mod;
            }
            else if((third/second) == (second/first)){
                long base = (second/first)%mod;
                num = first*quickpow(base,k-1)%mod;
            } 
            System.out.println(num%mod);
        }
    }
    static long quickpow(long x, long n) {
        if(n == 0) 
            return 1;
        long t = quickpow(x, n/2);
        t = t*t % mod;
        if(n % 2 == 0) 
            return t;
        return t*x % mod;
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