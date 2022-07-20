import java.util.*;
import java.io.*;
public class BobBox {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;

    public static void main(String[] args) throws IOException
    {
        int boxes = readInt();
        int odd = readInt();
        int even = readInt();
        int output = 0;
        if(boxes%2==1){
            output = (even+odd)*(boxes/2)+odd;
        }
        else{
            output = (even+odd)*(boxes/2);
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