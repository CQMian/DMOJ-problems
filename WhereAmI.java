import java.util.*;
import java.io.*;
public class WhereAmI {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
       int num = readInt();
       String input = readLine();
       for(int i = 1; i<num; i++) {
           boolean unique = true;
           for (int j = 0; j < num-i+1; j++) {
               String temp = input.substring(j, i+j);
               if (input.indexOf(temp) != input.lastIndexOf(temp)){
                    unique = false;
                    break;
               }
           }
           if(unique){
               System.out.println(i);
               break;
           }
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