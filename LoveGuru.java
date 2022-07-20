import java.util.*;
import java.io.*;
public class LoveGuru {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
        String A = readLine();
        String B = readLine();
        System.out.println(calc(A)+calc(B));
    }
    public static long calc(String s){
        long output = 0;
        for(int i = 0;i<s.length();i++){
            int temp = s.charAt(i);
            if(temp>96)
                temp-=96;
            else
                temp-=64;
            output+=Math.pow(temp,i%4+1);
            output%=10;
        }
        if(output==0)
            return 10;
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