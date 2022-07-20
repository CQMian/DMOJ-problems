import java.util.*;
import java.io.*;
public class ModernArt {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int m = readInt();
        int n = readInt();
        int k = readInt();
        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];
        for(int i = 0; i<k;i++){
            char dir = readCharacter();
            int line = readInt();
            if(dir=='R'){
                if(row[line-1]==false)
                    row[line-1] = true;
                else
                    row[line-1] = false;
            }
            else{
                if(col[line-1]==false)
                    col[line-1] = true;
                else
                    col[line-1] = false;
            }
        }
        long ans = 0;
        for(int r = 0;r<m;r++){
            boolean rowV = row[r];
            for(int c = 0; c<n;c++){
                if(rowV&&!col[c]||!rowV&&col[c])
                    ans++;
            }
        }
        System.out.println(ans);
        
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