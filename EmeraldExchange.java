import java.util.*;
import java.io.*;
public class EmeraldExchange {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int num = readInt();
        int max = 0;
        int temp = 0;
        for(int i = 0; i<num;i++){
            int val = readInt();
            if(val%2==0){
                temp+=val;
            }
            else{
                max = Math.max(max,temp);
                temp = 0;
            }
            max = Math.max(max,temp);
            System.out.println(temp);
        }
        System.out.println(max);
    }


    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine().trim());
        }
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