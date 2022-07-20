import java.util.*;
import java.io.*;
public class LetterFrequency {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        String input = readLine();
        int queries = readInt();
        int[][] arr = new int[input.length()][27];
        for(int i = 0; i<input.length();i++){
            char temp = input.charAt(i);
            int temp1 = 0;
            if(temp!= ' ')
                temp1 = temp-96;
            arr[i][temp1] +=1;
            if(i!=0){
                for(int j = 0;j<27;j++){
                    arr[i][j] +=arr[i-1][j];
                }
            }
        }
        for(int i = 0; i<queries;i++){
            int output = 0;
            int start = readInt()-1;
            int end = readInt()-1;
            int key = readCharacter()-96;
            if(start>0)
                output = arr[end][key]-arr[start-1][key];
            else
                output = arr[end][key];
            System.out.println(output);
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