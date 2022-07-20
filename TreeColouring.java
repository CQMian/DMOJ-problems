import java.util.*;
import java.io.*;
public class TreeColouring {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static ArrayList<edge>[] adj;
    static class edge implements Comparable <edge>{
        int u;
        int w;
        public edge(int u, int w){
            this.u = u;
            this.w = w;
        }
        public int compareTo(edge y){
            return Integer.compare(w, y.w);
        }
    }
    public static void main(String[] args) throws IOException {
        int n = readInt();
        adj = new ArrayList[n+1];
        for(int i = 1; i<=n; i++){
            adj[i] = new ArrayList<>();
        }
        for(int i = 0; i<n-1; i++){
            int u = readInt();
            int v = readInt();
            int w = readInt();
            adj[u].add(new edge(v, w));
            adj[v].add(new edge(u, w));
        }
        PriorityQueue<edge> q = new PriorityQueue<>();
        int[] dist = new int[n+1];
        boolean[] vis = new boolean[n+1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[1] = 0;
        q.add(new edge(1, 0));

        while(!q.isEmpty()){
            edge cur = q.poll();
            int curN = cur.u;
            int d = cur.w;
            if(vis[curN]){
                continue;
            }
            vis[curN] = true;
            for(edge e: adj[curN]){
                int node = e.u;
                int nodeW = e.w;
                if(dist[node] > dist[curN] + nodeW){
                    dist[node] = dist[curN] + nodeW;
                    q.add(new edge(node, dist[node]));
                }
            }
        }
        System.out.print(1);
        for(int i = 2; i<=n; i++){
            if(dist[i]%2 == 0){
                System.out.print(" " + 1);
            } 
            else {
                System.out.print(" " + 0);
            }
        }
        System.out.println();

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