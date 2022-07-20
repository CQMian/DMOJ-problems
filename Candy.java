import java.util.*;
import java.io.*;
public class Candy {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        long input = readLong();
        ArrayList<Long> arr = new ArrayList<>();
        for(long i = 1; i<= Math.sqrt(input); i++) {
            if (input % i == 0) {
                if (input / i == i) {
                    arr.add(i);
                }
             else {
                arr.add(i);
                arr.add(input/i);
                }
            }
        }
        Collections.sort(arr);
        for(Long l:arr){
            System.out.println(l);
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