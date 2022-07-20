import java.util.*;
import java.io.*;
public class PartialGame {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
        int num = readInt();
        long duke = 0, alice = 0;
        int[] arr = new int[2*100000+10];
        for(int i = 0; i<num;i++){
            arr[i] = readInt();
        }
        for(int i = 0; i<num;i++){
            if(arr[i]%2==1)
                alice+=arr[i]+1;
            else
                duke+=arr[i];
        }
        if(duke>alice)
            System.out.println("Duke");
        else
            System.out.println("Alice");
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