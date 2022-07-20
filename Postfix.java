import java.util.*;
import java.io.*;
public class Postfix {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
		String input = br.readLine();
		System.out.println(calc(input));	
	}
	public static String calc(String input){
		Stack<String> stacks = new Stack<String>();
        stacks.push("");
		int length = input.length();
		for(int i = 0;i<length;i++){
			if(input.charAt(i)=='+' || input.charAt(i) == '-' || input.charAt(i)== '*' || input.charAt(i)=='/'||input.charAt(i)=='%'||input.charAt(i)=='^'){
				stacks.pop();
                String temp =  stacks.pop();
				String temp1 =  stacks.pop();
                char operation = input.charAt(i);
                Double temp2= 0.0;
                if(operation == '+')
                    temp2 = Double.parseDouble(temp) + Double.parseDouble(temp1);
                else if(operation == '-')
                    temp2 = Double.parseDouble(temp1) - Double.parseDouble(temp);
                else if(operation == '*')
                    temp2 = Double.parseDouble(temp1) * Double.parseDouble(temp);   
                else if(operation == '/')
                    temp2 = Double.parseDouble(temp1) / Double.parseDouble(temp); 
                else if(operation == '%')
                    temp2 = Double.parseDouble(temp1) % Double.parseDouble(temp);
                else if(operation == '^')
                    temp2 = Math.pow(Double.parseDouble(temp1), Double.parseDouble(temp));
				stacks.push(String.valueOf(temp2));
			}
			else if(input.charAt(i) == ' '){
                stacks.push("");
            }
            else{
				stacks.push(stacks.pop()+String.valueOf(input.charAt(i)));;
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