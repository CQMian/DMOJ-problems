import java.util.*;
import java.io.*;
public class UBNH {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
        String alphabet = readLine();
        String word = readLine();
        int output = 1;
        for(int i = 0; i<word.length()-1;i++){
            if(alphabet.indexOf(word.charAt(i))<alphabet.indexOf(word.charAt(i+1))){
            }
            else{
                output++;
            }
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