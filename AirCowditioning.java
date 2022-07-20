import java.util.*;
import java.io.*;
public class AirCowditioning {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException{
        int num = readInt();
        int output = 0;
        int diff[] = new int[num+2];
        for(int i = 1;i<=num;i++){
            diff[i] = readInt();
        }
        for(int i = 1; i<=num;i++)
            diff[i]-=readInt();
        for(int i = 1;i<=num;i++){
            // for(int n:diff){
            //     System.out.print(n+ " ");
            // }
            // System.out.println();
            if(diff[i]!=0){
                int moves = diff[i];
                boolean pos1 = moves>0;
                for(int j = i+1;j<=num;j++){
                    int nextNum = diff[j];
                    boolean pos2 = nextNum>0;
                    if((pos1&&pos2&&moves>nextNum||!pos1&&!pos2&&moves<nextNum)&&nextNum!=0){
                        moves = nextNum;

                    }
                    if((!pos1&&pos2)||(pos1&&!pos2)||j==num||nextNum==0){
                        for(int k = j-1;k>i;k--){
                            diff[k]-=moves;
                        }
                        if((pos1&&pos2||!pos1&&!pos2)&&nextNum!=0)
                            diff[j]-=moves;
                        break;
                    }
                }
                diff[i]-=moves;
                i--;
                output+=Math.abs(moves);
            }
        }
        System.out.println(output);
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