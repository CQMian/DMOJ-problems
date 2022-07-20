import java.util.*;
import java.io.*;
public class MonkeyPotato {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
        int length = readInt();
        int nums = readInt();
        String output = "";
        int[] arr = new int[nums];
        for(int i = 0;i<nums;i++)
            arr[i] = readInt();
        Arrays.sort(arr);
        if(arr.length== 1&&arr[0]!=0){
            for(int i = 0; i<length;i++)
                output+=arr[0];
        }
        else if(arr[0]==0){
            if(arr.length==1)
                output = String.valueOf(-1);
            else{
                if(length==1)
                    output += arr[1];
                else{
                    for(int i = 0;i<length-2;i++)
                        output+= "0";
                    output = arr[1]+output+arr[1];
                }
            }
        }
        else{
            for(int i =0; i<length;i++)
                output+=arr[0];
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