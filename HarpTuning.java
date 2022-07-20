import java.util.*;
import java.io.*;
public class HarpTuning {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int counter = 0;
        String[] strArr = new String[20];
        boolean[] arr = new boolean[20];
        int[] turnArr = new int[20];
        String s = readLine();
        int prevPoint = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)=='+'||s.charAt(i)=='-'){
                if(s.charAt(i)=='+'){
                    arr[counter] = true;
                }
                strArr[counter] = s.substring(prevPoint,i);
                prevPoint = i+1;
                i++;
                while(i<s.length()&&s.charAt(i)>=45&&s.charAt(i)<=57){
                    i++;
                }
                turnArr[counter] = Integer.parseInt(s.substring(prevPoint,i));
                prevPoint = i;
                counter++;
            }
            

        }
        for(int i = 0; i<counter;i++){
            String output = strArr[i] + " ";
            output+= arr[i]?"tighten":"loosen";
            output+=" "  + turnArr[i];
            System.out.println(output);
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