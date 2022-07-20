import java.util.*;
import java.io.*;
public class Fencing {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
        int wood = readInt();
        double[] height = new double[wood+1];
        double[] width = new double[wood];
        double output = 0;
        for(int i = 0;i<wood+1;i++){
            height[i] = readDouble();
        }
        for(int i = 0; i<wood;i++){
            width[i] = readDouble();
        }
        for(int i = 0; i<wood;i++)
            output+= Math.max(height[i+1],height[i])*width[i]-Math.abs(height[i+1]-height[i])*width[i]/2;
        if(output%1==0.0){
            int ans = (int)output;
            System.out.println(ans);
        }
        else
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