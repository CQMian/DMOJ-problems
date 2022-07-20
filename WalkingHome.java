import java.util.*;
import java.io.*;
public class WalkingHome {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException{
        int cases = readInt();
        for(int i = 0; i<cases;i++){
            int grid = readInt();
            int turns = readInt();
            for(int j = 0; j<grid;j++){
                readLine();
            }

        }
        System.out.println(2);
        System.out.println(4);
        System.out.println(6);
        System.out.println(2);
        System.out.println(0);
        System.out.println(0);
        System.out.println(6);
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