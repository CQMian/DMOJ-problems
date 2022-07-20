import java.util.*;
import java.io.*;
public class HardcoreGrinding {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
        int tasks = readInt();
        int[] arr = new int[10000002];
        for(int i = 0; i <tasks ;i++){
            int start = readInt();
            int stop = readInt();       
            arr[start] += 1;
            arr[stop] -= 1;
        }
        for(int i = 1; i<arr.length;i++){
            arr[i] += arr[i-1];

        }
        int max = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
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