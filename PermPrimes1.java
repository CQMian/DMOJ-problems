import java.util.*;
import java.io.*;
public class PermPrimes1 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException{
        int n = readInt();
        if(n > 4) {
            StringBuilder output = new StringBuilder();
            int start = 0;
            if(n%2 == 0)
                start = n-1;
            else
                start = n;

            for(int i = start; i>5; i -= 2){
                output.append(i).append(" ");
            }
            output.append("1 3 5 4 2");
            for(int i = 6; i<=n; i+=2){
                output.append(" ").append(i);
            }
            System.out.println(output);

        } 
        else {
            if(n == 1)
                System.out.println(1);
            else
                System.out.println(-1);
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