import java.util.*;
import java.io.*;
public class MonkeyMarket {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
        int days = readInt();
        int[] arr = new int[days];
        ArrayList<String> output = new ArrayList<>();
        for(int i = 0; i<days;i++)
            arr[i] = readInt();
        Arrays.sort(arr);
        for(int i = 0;i<days/2;i++){
            System.out.print(arr[i] + " " + arr[days-1-i]);
            if(days/2-1!=i)
                System.out.print(" ");
            if(arr[i]==arr[days-1-i])
                output.add("EE");
            else
                output.add("BS");
        }
        if(days%2==1){
            System.out.print(" " + arr[days/2]);
            output.add("E");
        }
        System.out.println();
        for(String s: output)
            System.out.print(s);
        System.out.println();
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