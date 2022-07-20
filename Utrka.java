import java.util.*;
import java.io.*;
public class Utrka {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        HashMap<String,Integer> list = new HashMap<>();
        int numRunners = readInt();
        for(int i = 0;i<numRunners;i++){
            String runner = readLine();
            if(list.containsKey(runner))
                list.put(runner,list.get(runner)+1);
            else
                list.put(runner,1);
        }
        for(int i = 0;i<numRunners-1;i++){
            String runner = readLine();
            list.put(runner,list.get(runner)-1);
        }
        for(String s:list.keySet()){
            if(list.get(s)!=0){
                System.out.println(s);
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