import java.util.*;
import java.io.*;

public class NonTransitiveDice {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int cases = readInt();
        
        for(int o = 0; o<cases; o++){
            boolean nonTransitive = false;
            int[] diceA = new int[4];
            int[] diceB = new int[4];
            int[] diceC = new int[]{1,1,1,1};
            int[] wins = new int[4];
            for(int i = 0; i<4;i++)
                diceA[i] = readInt();
            for(int i = 0; i<4;i++)
                diceB[i] = readInt();
            int result = versus(diceA,diceB);
            if(result == 0){
                wins[0]++;
            }
            else if(result == 1){
                wins[1]++;
            }
            if(wins[0]==1){
                int counter =0;
                while(!nonTransitive&&counter!=10000){
                    if(versus(diceB,diceC)==0&&versus(diceC,diceA)==0){
                        nonTransitive = true;
                    }
                    else{
                        counter++;
                        diceC[0] = counter/1000%10+1;
                        diceC[1] = counter/100%10+1;
                        diceC[2] = counter/10%10+1;
                        diceC[3] = counter%10+1;
                    }
                }
            }
            else if(wins[1]==1){
                int counter =0;
                while(!nonTransitive&&counter!=10000){
                    if(versus(diceC,diceB)==0&versus(diceA,diceC)==00){
                        nonTransitive = true;
                    }
                    else{
                        counter++;
                        diceC[0] = counter/1000%10+1;
                        diceC[1] = counter/100%10+1;
                        diceC[2] = counter/10%10+1;
                        diceC[3] = counter%10+1;
                    }
                }
            }
            System.out.println(nonTransitive?"yes":"no");
            
            
        }

    }
    static int versus(int[] x, int[]y){
        int wins = 0;
        int ties = 0;
        for(int i = 0; i<4;i++){
            for(int k = 0; k<4; k++){
                if(x[i]>y[k])
                    wins++;
                else if(x[i]==y[k])
                    ties++;
            }
        }
        int loss = 16-ties-wins;
        if(wins>loss)
            return 0;
        else if(wins<loss)
            return 1;
        else
            return 2;
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