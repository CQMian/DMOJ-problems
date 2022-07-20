import java.util.*;
import java.io.*;
public class PrettyAveragePrime {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;

    public static void main(String[] args) throws IOException
    {
        int num = readInt();
        for(int i = 0; i <num;i++){
            System.out.println(calc(readInt()));
        }
    }
    static String calc(int x){
        for(int i = 0;i<x;i++){
            if(prime(i)&&prime(x*2-i)){
                return i + " " + (x*2-i);
            }
        }
        return null;
    }
    static boolean prime(int x){
        if(x == 1)
            return false;
        for(int i = 2;i<Math.sqrt(x)+1;i++){
            if(x%i==0)
                return false;
        }
        return true;
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