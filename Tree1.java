import java.util.*;
import java.io.*;
public class Tree1 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int[][] adj;
    static Boolean[][] arr;
    public static void main(String[] args) throws IOException {
        Boolean tree = true;
        adj = new int[4][4];
        arr = new Boolean[4][4];
        int counter = 0;
        for(int i = 0 ;i<4;i++){
            int rowCounter = 0;
            for(int j = 0; j<4;j++){
                adj[i][j] = readInt();
                if((i==0)||(i==1&&j>0)||(i==2&&j>1)||(i==0&&j>2))
                    if(adj[i][j] == 1){
                        counter++;
                        rowCounter++;
                        if(rowCounter>1){
                            tree=false;
                        }
                    }
            }
        }
        for(int i = 0; i<4;i++){
            for(int j = 0; j<4;j++){
                
            }
        }
        System.out.println((tree&&counter==3) ? "Yes" : "No");
            
        
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