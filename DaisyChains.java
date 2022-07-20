import java.util.*;
import java.io.*;
public class DaisyChains {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int[] flowers;
    public static void main(String[] args) throws IOException {
        int numFlowers = readInt();
        flowers = new int[numFlowers];
        int photos = 0;
        for(int i = 0; i<numFlowers; i++){
            flowers[i] = readInt();
        }
        photos += numFlowers;
        for(int i = 0; i<numFlowers-1; i++){
            for(int j = i+1; j<numFlowers; j++){
                photos += calc(i, j);
            }
        }
        System.out.println(photos);


    }
    static int calc(int start, int stop){
        double sum = 0;
        for(int i = start; i<=stop; i++){
            sum += flowers[i];
        }
        double average = sum/(stop-start+1);

        for(int i = start; i<=stop; i++){
            if(average == flowers[i]){
                return 1;
            }
        }
        return 0;
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