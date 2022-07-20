import java.util.*;
import java.io.*;
public class BiggerBigInteger {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int length = readInt();
        String input = next();
        int pos = -1;
        for(int i = 0; i<length-1;i++){
            if((int)input.charAt(i)<(int)input.charAt(i+1)){
                pos = i;
                break;
            }
        }
        if(pos!=-1)
            System.out.println(input.substring(0,pos)+input.substring(pos+1,pos+2)+input.substring(pos,pos+1)+input.substring(pos+2));
        else{
            System.out.println(input);
        }
        
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