import java.util.*;
import java.io.*;
public class ShopAndShip {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException{
        int N = readInt();
        int M = readInt();
        int[][] adj = new int[N+1][N+1];
        for(int i = 1; i<=N; i++) Arrays.fill(adj[i],(int)1e9);
        for(int i = 1; i<=M;i++){
            int u = readInt();
            int v = readInt();
            int w = readInt();
            adj[u][v] = adj[v][u] = w;
        }
        int k = readInt();
        int[] city = new int[k];
        int[] cost = new int[k];
        for(int i = 0; i<k;i++){
            city[i] = readInt();
            cost[i] = readInt();
        }
        int d = readInt();
        int dis[] = new int[N+1];
        boolean vis[] = new boolean[N+1];
        Arrays.fill(dis, (int)1e9);
        dis[d] = 0;
        for(int K = 1; K<=N; K++){
            int u = -1;
            int min = (int)1e9;
            for(int i = 1; i<=N; i++){
                if(!vis[i]&&dis[i]<min){
                    min = dis[i];
                    u = i;
                }
            }
            if(u==-1)
                break;
            vis[u] = true;
            for(int v = 1; v<=N; v++){
                if(!vis[v]&&dis[v]>dis[u]+adj[u][v])
                    dis[v] = dis[u]+adj[u][v];
            }
        }
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i<k;i++){
            ans = Math.min(ans,dis[city[i]]+cost[i]);
        }
        System.out.println(ans);
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