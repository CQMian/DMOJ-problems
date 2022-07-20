import java.util.*;
import java.io.*;
public class BoardGames {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
        int n = readInt();
        int m = readInt();
        int[] dis = new int[10000000];
        boolean[] visited = new boolean[10000000];
        dis[n] = 0;
        visited[n] = true;
        Queue<Integer> q = new LinkedList<>();
        q.add(n);
        while(!q.isEmpty()){
            int cur = q.poll();

            if(3*cur < 1e7 && !visited[3*cur]) {
                q.add(3 * cur);
                dis[3 * cur] = dis[cur] + 1;
                visited[3 * cur] = true;
            }

            if(cur-1 > 0 && cur-1<1e7 && !visited[cur-1]) {
                q.add(cur - 1);
                dis[cur - 1] = dis[cur] + 1;
                visited[cur - 1] = true;
            }

            if(cur-3 > 0 && cur-3 < 1e7 && !visited[cur-3]) {
                q.add(cur - 3);
                dis[cur - 3] = dis[cur] + 1;
                visited[cur - 3] = true;
            }

            if(cur/2 > 0 && cur%2 == 0 && !visited[cur/2]){
                q.add(cur / 2);
                dis[cur / 2] = dis[cur] + 1;
                visited[cur / 2] = true;
            }

            if(visited[m]){
                System.out.println(dis[m]);
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