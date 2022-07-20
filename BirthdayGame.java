import java.util.*;
import java.io.*;
public class BirthdayGame {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int n;

    static boolean[] visited = new boolean[n+1];
    static int[] dist = new int[n+1];
    static int maxCycle = -1;
    static void dfs(int start){
        visited[start] = true;
        for(int nxt: adj[start]){
            if(!visited[nxt]) {
                dist[nxt] = dist[start]+1;
                dfs(nxt);
            } else {
                maxCycle = Math.max(maxCycle, Math.abs(dist[start]-dist[nxt]));
            }
        }
    }
    public static void main(String[] args) throws IOException{
        n = readInt();
        ArrayList<Integer>[] adj = new ArrayList[n+1];
        for(int i = 1; i<=n; i++){
            adj[i] = new ArrayList<>();
        }
        for(int i = 1; i<=n; i++){
            int x = readInt();
            adj[i].add(x);
        }
        dfs(1);
        System.out.println(maxCycle);
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