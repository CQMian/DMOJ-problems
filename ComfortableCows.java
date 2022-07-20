import java.util.*;
import java.io.*;
public class ComfortableCows {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
        int cows = readInt();
        int[][] arr = new int[1004][1004];
        int output = 0;
        for(int i = 0; i<cows;i++){
            int x = readInt();
            int y = readInt();
            arr[x][y]= 1;
            output+= calc(arr,x,y);
            output+= calc(arr,x,y+1);
            if(y-1>=0)
                output+= calc(arr,x,y-1);
            output+= calc(arr,x+1,y);
            if(x-1>=0)
                output+= calc(arr,x-1,y);

            System.out.println(output);
        }

    }
    public static int calc(int[][] arr, int x, int y){
        if(arr[x][y]==1){
            int happyCounter = 0;
            happyCounter+=arr[x][y+1];
            happyCounter+=arr[x+1][y];
            if(y-1>=0)
                happyCounter+=arr[x][y-1];
            if(x-1>=0)
                happyCounter+=arr[x-1][y];
            if(happyCounter==3)
                return 1;
            else if(happyCounter==4)
                return -1;
        }
        return 0;
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