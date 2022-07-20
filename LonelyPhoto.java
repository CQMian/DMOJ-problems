import java.util.*;
import java.io.*;
public class LonelyPhoto {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException{
        int cows = readInt();
        long output = 0; 
        String order = readLine();
        int arr[][] = new int[order.length()+2][2];
        for(int i = 1; i<=order.length();i++){
            if(order.charAt(i-1)=='G'){
                arr[i][0] = arr[i-1][0]+1;
                arr[i][1] = arr[i-1][1];
            }
            else{
                arr[i][0] = arr[i-1][0];
                arr[i][1] = arr[i-1][1]+1;
            }
        }
        for(int i = 0; i<arr.length;i++){
            for(int k = 0; k<arr[0].length;k++){
                System.out.print(arr[i][k] + " ");
            }
            System.out.println();
        }
        for(int i = 1; i<=cows-2;i++){
            for(int k= i+2;k<=cows;k++){
                if(arr[k][0]-arr[i][0]>1&&arr[k][1]-arr[i][1]>1)
                    break;
                else if(arr[k][0]-arr[i][0]==1||arr[k][1]-arr[i][1]==1)
                    output++;
            }
        }
        System.out.println(output);
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