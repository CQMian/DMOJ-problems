import java.util.*;
import java.io.*;
public class TracysBread {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{
        int pumMin = readInt();
        int pumMax = readInt();
        int sourMin = readInt();
        int sourMax = readInt();
        int cornMin = readInt();
        int cornMax = readInt();
        int temp = readInt();
        if(temp>=pumMin&&temp<=pumMax)
            System.out.println("pumpernickel");
        else if(temp>=sourMin&&temp<=sourMax)
            System.out.println("sourdough");
        else if(temp>=cornMin&&temp<=cornMax)
            System.out.println("cornbread");
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