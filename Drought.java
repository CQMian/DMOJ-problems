import java.util.*;
import java.io.*;

public class Drought {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int cases = readInt();
        for(int o = 0; o<cases;o++){
            boolean possible = true;
            long output = 0;
            int min = Integer.MAX_VALUE;
            int cows = readInt();
            int[] line = new int[cows+5];
            for(int i = 0 ;i<cows;i++){
                int newCow = readInt();
                line[i] = newCow;
                if(newCow<min)
                    min = newCow;
            }
            if(cows==1)
                possible = false;
            if(cows!=1&&(line[0]>line[1]||line[cows-1]>line[cows-2])){
                possible = false;
            }
            int allSame = 0;
            while(possible&&allSame!=cows){
                allSame = 0;
                int newMin = min;
                //System.out.println(line[2]);
                for(int i = 0;i<cows-1;i++){
                    if(line[i]>min){
                        output+=(line[i]-min);
                        line[i+1]-=(line[i]-min);
                        line[i]-=(line[i]-min);
                        if(line[i+1]<0)
                            possible = false;
                    }
                    if(line[i+1]<newMin)
                        newMin = line[i+1];
                    if(line[i]<newMin)
                        newMin = line[i];
                }
                for(int i = 0; i<cows;i++){
                    if(line[i]==min)
                        allSame++;
                }
                min=newMin;
            }
            if(cows!=1)
                System.out.println(possible?output*2:-1);
            else{
                System.out.println(0);
            }
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