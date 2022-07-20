import java.util.*;
import java.io.*;
public class Deforestation {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
        int trees = readInt();
        int[] treeHeight = new int[trees];
        treeHeight[0] = readInt();
        for(int i = 1; i<trees;i++){
            treeHeight[i] = treeHeight[i-1] + readInt();
        }
        int queries = readInt();
        for(int i = 0; i<queries;i++){
            int start = readInt();
            int stop = readInt();
            int output = treeHeight[stop];
            if(start!=0)
                output-=treeHeight[start-1];
            System.out.println(output);
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