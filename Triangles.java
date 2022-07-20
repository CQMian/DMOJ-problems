import java.util.*;
import java.io.*;
public class Triangles {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
        int fences = readInt();
        int output = 0;
        int[] x = new int[fences];
        int[] y = new int[fences];
        for(int i = 0; i<fences;i++){
            x[i] = readInt();
            y[i] = readInt();
        }
        for(int i = 0 ;i<fences;i++){
            for(int j = i+1;j<fences;j++){
                for(int k = j+1;k<fences;k++){
                    int x1 = x[i];
                    int y1 = y[i];
                    int x2 = x[j];
                    int y2 = y[j];
                    int x3 = x[k];
                    int y3 = y[k];
                    if((x1==x2||x1==x3||x2==x3)&&(y1==y2||y1==y3||y2==y3)){
                        int width = Math.max(Math.abs(x1-x2),Math.abs(x2-x3));
                        int height = Math.max(Math.abs(y1-y2),Math.abs(y2-y3));
                        output = Math.max(output,width*height);
                    }
                }
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