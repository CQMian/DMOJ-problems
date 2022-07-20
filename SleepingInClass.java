import java.util.*;
import java.io.*;
public class SleepingInClass {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int batches = readInt();
        for(int z = 0; z<batches; z++){
            int state = 0;
            int classes = readInt();
            int sum = 0;
            int[] arr = new int[classes+1];
            for(int i = 0; i<classes;i++){
                int input = readInt();
                arr[i+1] = input+arr[i];
            }
            double max = (0.0+arr[classes])/classes;
            int moves = 0;
            int n = 0;
            while(state!=0){
                state = 0;
                n++;
                if(arr[n]-arr[0]>max){
                    state = 2;
                    break;
                }
                else if(arr[0+n]-arr[0]<max){
                    state = 1;
                }
                else
                    state = 0;
            }
            if(state == 0){
                System.out.println(arr[n]);
            }
            else if(state ==2)
                System.out.println(classes-1);
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