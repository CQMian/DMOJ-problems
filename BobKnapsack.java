import java.util.*;
import java.io.*;
public class BobKnapsack {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
        int nums = readInt();
        int queries = readInt();
        Long[] arr = new Long[nums+1];
        int counter = 0;
        for(int i = 0;i<nums+1;i++){
            arr[i] = Long.valueOf(0);
        }
        for(int i = 0;i<nums;i++){
            Long temp = readLong();
            if(temp>=0){
                arr[counter] = temp;
                counter++;
            }
        }
        Arrays.sort(arr);
        for(int i = nums-1;i>=0;i--){
            arr[i] = arr[i]+arr[i+1];
        }
        for(int i = 0; i<queries;i++){
            Long query = readLong();
            System.out.println(arr[(int)(arr.length-query)]);
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