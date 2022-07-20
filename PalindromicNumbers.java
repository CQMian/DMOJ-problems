import java.util.*;
import java.io.*;
public class PalindromicNumbers {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int ans = 0;
    public static void main(String[] args) throws IOException {
        int n = readInt();
        int m = readInt();
        calc(n,m);
        System.out.println(ans);
    }
    static int palin(int n)
    {
        int newP = 0;
        for (int i = n; i > 0; i /= 10)
            newP = newP*10+i%10;
             
        return(n == newP) ? 1 : 0;
    }
     
    static void calc(int min, int max)
    {
        for (int i = min; i <= max; i++)
            if (palin(i)==1)
                ans++;
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