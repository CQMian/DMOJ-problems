import java.util.*;
import java.io.*;
public class WordProcessor {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int words = readInt();
        int max = readInt();
        String nextInput = next();
        int length = nextInput.length();
        System.out.print(nextInput);
        for(int i = 0; i<words-1; i++){
            nextInput = next();
            if(length + nextInput.length() > max){
               System.out.println();
               System.out.print(nextInput);
               length = nextInput.length();
            }
            else {
               System.out.print(" " + nextInput);
               length += nextInput.length();
            }
        }
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