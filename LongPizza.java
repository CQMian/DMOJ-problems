import java.util.*;
import java.io.*;
public class LongPizza {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int length = readInt();
        long total = 0;
        int ls = readInt();
        int rs = readInt();
        int diff = rs-ls+1;
        int num = readInt();
        for(int i = 0;i<num;i++){
            int lst = readInt();
            int rst = readInt();
            if(lst<=ls&&rst>=rs)
                total+=diff;
            else if(lst<ls&&rst<=rs&&rst>=ls){
                total+=rst-ls+1;
            }
            else if(lst>=ls&&lst<=rs&&rst>rs)
                total+=rs-lst+1;
            else if(lst>=ls&&lst<=rs&&lst<=rs)
                total+=rst-lst+1;
                
        }
        
        System.out.println(total);
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