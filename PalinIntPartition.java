import java.util.*;
import java.io.*;
public class PalinIntPartition {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
    static long memory[];
	public static void main(String[] args) throws IOException {
        int num = readInt();
        memory = new long[num+1];
        System.out.println(calc(num));
    }
    public static long calc(int num){
        if(memory[num]!=0)
            return memory[num];
        if(num<=1){
            memory[num] = 1;
            return 1;
        }
        long output = 1;
        for(int i = 1; i<=num/2;i++){
            output+= calc(num-2*i);
        }
        memory[num] = output;
        return output;
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