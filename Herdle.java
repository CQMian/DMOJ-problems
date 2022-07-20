import java.util.*;
import java.io.*;

public class Herdle {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int[][] arr = new int[3][3];
        int[] contains = new int[26];
        int[] newContains = new int[26];
        int green = 0;
        int yellow = 0;
        for(int i = 0; i<3;i++){
            String temp = readLine();
            for(int j = 0; j<3;j++){
                int a = temp.charAt(j)-65;
                arr[i][j] = a;
                contains[a]++;
            }
        }
        for(int i = 0; i<3;i++){
            String temp = readLine();
            for(int j = 0; j<3;j++){
                int a = temp.charAt(j)-65;
                if(a==arr[i][j]){
                    green++;
                    contains[a]--;
                }
                else{
                    newContains[a]++;
                }
            }
        }
        for(int i = 0; i<26;i++){
            if(contains[i]>=newContains[i])
                yellow+=newContains[i];
            else{
                yellow+=contains[i];
            }
        }
        System.out.println(green);
        System.out.println(yellow);


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