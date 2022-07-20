import java.util.*;
import java.io.*;
public class BobDivisors {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
        int input = fact(readInt());
        int divisors = 0;
        int counter = 1;
        String temp = String.valueOf(Math.sqrt(input));
        while(counter<=Math.sqrt(input)){
            if(temp.equals(String.valueOf(counter)))
                divisors+=1;
            else if(input%counter==0)
                divisors+=2;
            counter++;
        }
        System.out.println(divisors);
	}
    public static int fact(int input){
        int output = 1;
        for(int i = 2;i<=input;i++){
            output*=i;
        }
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