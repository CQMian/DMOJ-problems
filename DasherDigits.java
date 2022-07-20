import java.util.*;
import java.io.*;
public class DasherDigits {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException{
        int N = readInt();
        int M = readInt();
        int[] cheer = new int[M];
        int maxValue = 0;
        int index = 0;
        int zero = 0;
        String s = readLine();
        for(int i = 0; i<N;i++){
            if(s.charAt(i)=='0'){
                cheer[zero] = i-zero;
                zero++;
            }
        }
        String output = s.replaceAll("0","");
        for(int i = 0; i<M;i++){
            int num = readInt();
            if(num>=maxValue){
                maxValue = num;
                index = i;
            }
        }
        System.out.println(output.substring(cheer[index])+output.substring(0,cheer[index]));
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