import java.util.*;
import java.io.*;
public class PrefixPostFix {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
		String input = br.readLine();
		ArrayList<String> output = new ArrayList<String>();
        while(!input.equals("0")){
			output.add(postfix(input));
			input = br.readLine();

		}
		for(String s: output)
        	System.out.println(s);
	}
	public static String postfix(String input){
		Stack<String> stacks = new Stack<String>();
		int length = input.length()-1;
		for(int i = length;i>=0;i-=2){
			if(input.charAt(i)=='+' || input.charAt(i) == '-'){
				String temp =  stacks.pop();
				String temp1 =  stacks.pop();
				stacks.push(temp + " " + temp1 + " " + input.charAt(i));
			}
			else{
				stacks.push(String.valueOf(input.charAt(i)));
			}
		}
		return stacks.peek();
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