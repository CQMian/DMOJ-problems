import java.util.*;
import java.io.*;
public class EMOP{
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
        int cows = readInt();
        int even = 0, odd = 0;
        int output = 0;
        for(int i = 0; i<cows;i++){
            int temp = readInt();
            if(temp%2==0)
                even++;
            else
                odd++;
        }
        if(even>odd)
            output = 2*odd+1;
        else{
            output = oddCalc(odd,even);
        }

        System.out.println(output);
	}
    public static int oddCalc(int odd, int even){
        int difference = odd-even;
        if(difference == 0)
            return odd+even;
        else if(difference == 1)
            return odd+even-2;
        else if(difference == 2)
            return odd+even-1;
        else{
            odd-=2;
            even+=1;
            return oddCalc(odd, even);
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