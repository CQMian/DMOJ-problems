import java.util.*;
import java.io.*;
public class HanoiTower {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
        int num = readInt();
        calc(num, 'A', 'C', 'B');
	}
    static void calc(int n, char from, char to, char aux)
    {
        if (n == 1)
        {
            System.out.println(from + "" + to);
            return;
        }
        calc(n-1, from, aux, to);
        System.out.println(from + ""+ to);
        calc(n-1, aux, to, from);
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

    