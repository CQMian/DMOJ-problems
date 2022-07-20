import java.util.*;
import java.io.*;
public class FreeShirts {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
        for(int k = 0; k<10;k++){
            int shirts = readInt();
            int cleanShirts = shirts;
            int numEvents = readInt();
            int days = readInt();
            int[] events = new int[1001];
            for(int i = 0;i<numEvents;i++){
                events[readInt()]++;
            }
            int counter = 0;
            for(int i = 1; i<=days;i++){
                if(cleanShirts == 0){
                    counter++;
                    cleanShirts = shirts;
                }
                shirts+=events[i];
                cleanShirts+=events[i];
                cleanShirts--;
            }
            System.out.println(counter);
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