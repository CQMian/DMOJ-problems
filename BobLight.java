import java.util.*;
import java.io.*;
public class BobLight {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
        int numLight = readInt();
        int moves = readInt();
        int[] arr = new int[numLight+1];
        int counter = 0;
        for(int i = 0; i<moves;i++){
            int start = readInt()-1;
            int stop = readInt()-1;
            arr[start] +=1;
            arr[stop+1] -=1;
        }
		// for(int i:arr)
		// 	System.out.print(i+  " ");
		// 	System.out.println();
        for(int i = 1;i<numLight;i++)
            arr[i] = arr[i]+arr[i-1];
        for(int i:arr){
			if(arr[i]%2==1)
				counter++;
		}
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