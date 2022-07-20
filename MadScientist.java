import java.util.*;
import java.io.*;
public class MadScientist {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {

        String a = readLine();
        String b= readLine();
        int counter=  0;
        Boolean inFlip = false;
        while(a.length()!=0){
            if(a.charAt(0)==b.charAt(0)){
                inFlip = false;

            }
            else if(!inFlip){
                inFlip = true;
                counter++;
            }
            
            a = a.substring(1);
            b = b.substring(1);
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