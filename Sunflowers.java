import java.util.*;
import java.io.*;
public class Sunflowers {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int n = readInt();
        long[][] arr = new long[n][n];
        for(int r = 0; r<n; r++){
            for(int c = 0; c<n; c++){
                arr[r][c] = readLong();
            }
        }
        boolean left = true, up = true;
        for(int r = 0; r<n; r++){
            long temp = arr[r][0];
            for(int c = 1; c<n; c++){
                if(arr[r][c]<=temp){
                    left = false;
                }
                else
                    temp = arr[r][c];
            }
        }
        for(int c = 0; c<n; c++){
            long temp = arr[0][c];
            for(int r = 1; r<n; r++){
                if(arr[r][c]<=temp){
                    up = false;
                    break;
                }
                else
                    temp = arr[r][c];
            }
        }
        if(left&&up){
            for(int r = 0; r<n; r++){
                for(int c = 0; c<n; c++){
                    System.out.print(arr[r][c]+ " ");
                }
                System.out.println();
            }
        }
        else if(!left&&up){
            for(int c = n-1; c>=0; c--){
                for(int r = 0; r<n; r++){
                    System.out.print(arr[r][c]+ " ");
                }
                System.out.println();
            }
        }
        else if(!left&&!up){
            for(int r = n-1; r>=0; r--){
                for(int c = n-1; c>=0; c--){
                    System.out.print(arr[r][c]+ " ");
                }
                System.out.println();
            }
        }
        else{
            for(int c = 0; c<n; c++){
                for(int r = n-1; r>=0; r--){
                    System.out.print(arr[r][c] + " ");
                }
                System.out.println();
            }
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