import java.util.*;
import java.io.*;
public class BattlePos {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
        int stations = readInt();
        int minimum = readInt();
        int waves = readInt();
        int[] arr = new int[stations+2];
        for(int i = 0; i <waves ;i++){
            int temp1 = readInt();
            int temp2 = readInt();
            int nums = readInt();        
            arr[temp1-1] += nums;
            arr[temp2] -= nums;
        }
        for(int i = 1; i<stations;i++){
            arr[i] += arr[i-1];
        }
        int counter = 0;
        for(int i = 0; i<stations; i++){
            if(arr[i]<minimum){
                counter++;
            }
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