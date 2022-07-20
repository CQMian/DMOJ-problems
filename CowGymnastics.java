import java.util.*;
import java.io.*;
public class CowGymnastics {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int sessions;
    static int cows;
    static boolean status;
    public static void main(String[] args) throws IOException {
        sessions = readInt();
        cows = readInt();
        int[][] ranks = new int[sessions][cows];
        int output = 0;
        for(int i = 0; i<sessions; i++){
            for(int j = 0; j<cows; j++){
                ranks[i][j] = readInt();
            }
        }
        for(int i = 0; i<cows-1; i++){
            for(int j = i+1; j<cows; j++){
                int cow1 = ranks[0][i];
                int cow2 = ranks[0][j];
                status = i<j;
                int count = 1;
                for(int k = 1; k<sessions;k++){
                    int newIndex1 = 0;
                    int newIndex2 = 0;
                    for(int l = 0; l<cows;l++){
                        if(ranks[k][l]==cow1)
                            newIndex1 = l;
                        if(ranks[k][l]==cow2)
                            newIndex2 = l;
                    }
                    if(newIndex1<newIndex2==status)
                        count++;
                }
                if(count==sessions)
                    output++;
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

    