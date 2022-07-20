import java.util.*;
import java.io.*;
public class Fractions {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
        int fractions = readInt();
        Long[] num = new Long[fractions];
		Long[] denom = new Long[fractions];
		
        for(int i = 0;i<fractions;i++){
			num[i] = readLong();
			denom[i] = readLong();
		}
        for(int i = 0;i<fractions;i++){
			Long gcf = gcfCalc(num[i], denom[i]);	
			num[i] /=gcf;
			denom[i] /=gcf;
			System.out.println(calc(denom[i], Long.valueOf(0), Long.valueOf(0)));
		}
	}
	public static Long calc(Long input, Long two, Long five){
		if(input%2==0)
			return calc(input/2,two+1,five);
		else if(input%5==0)
			return calc(input/5,two,five+1);
		else if(input == 1)
			return Math.max(two,five);
		else
			return Long.valueOf(-1);
	}
	public static Long gcfCalc(Long a, Long b)
    {
        if (b != 0)
            return gcfCalc(b, a % b);
        else
            return a;
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