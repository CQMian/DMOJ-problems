import java.util.*;
import java.io.*;
public class stalling {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
        int nums = readInt();
        int[] cows = new int[nums];
        int[] stalls = new int[nums];
        long output = 1;
        for(int i = 0; i<nums;i++)
            cows[i] = readInt();
        for(int i = 0; i<nums;i++)
            stalls[i] = readInt();
        Arrays.sort(cows);
        Arrays.sort(stalls);
        int counter = 0;
        for(int i = 0; i<nums;i++){
            while(counter<nums && stalls[nums-counter-1]>=cows[nums-i-1])
                counter++;
            output *= counter-i;
        }

        System.out.println(output);
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