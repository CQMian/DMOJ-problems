import java.util.*;
import java.io.*;
public class CountOddDigNums {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;

    public static void main(String[] args) throws IOException
    {
        long num = readLong();
        long digits = Long.toString(num).length();
        long counter = 0;
        for (long i = 1; i < digits; i += 2) 
            counter += 9*(long)Math.pow(10, i-1);
        if(digits%2 != 0)
            counter += num-(long)Math.pow(10, digits-1)+1;
        System.out.println(counter);
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