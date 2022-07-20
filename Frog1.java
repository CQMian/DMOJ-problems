import java.util.*;
import java.io.*;
public class Frog1 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static class edge implements Comparable<edge>{
        int u;
        int w;
        public edge(int u0, int w0){
            this.u = u0;
            this.w = w0;
        }
        public int compareTo(edge e){
            return Integer.compare(w, e.w);
        }

    }
    public static void main(String[] args) throws IOException {
        int n = readInt();
        ArrayList<edge>[] adj = new ArrayList[n+1];
        for(int i = 1; i<=n; i++){
            adj[i] = new ArrayList<>();
        }
        int[] heights = new int[n+1];
        for(int i = 1; i<=n; i++){
            heights[i] = readInt();
        }
        for(int i = 1; i<=n-2; i++){
            adj[i].add(new edge(i+1, Math.abs(heights[i]-heights[i+1])));
            adj[i].add(new edge(i+2, Math.abs(heights[i]-heights[i+2])));
        }
        adj[n-1].add(new edge(n, Math.abs(heights[n-1]-heights[n])));

        int[] dis = new int[n+1];
        Arrays.fill(dis, (int)1e9);
        boolean[] vis = new boolean[n+1];
        PriorityQueue<edge> q = new PriorityQueue<>();
        dis[1] = 0;
        q.add(new edge(1, 0));
        while(!q.isEmpty()){
            edge cur = q.poll();
            int u = cur.u;
            if(vis[u]){
                continue;
            }
            vis[u] = true;
            for(edge e:adj[u]){
                int v = e.u;
                int w = e.w;
                if(dis[u] + w < dis[v]){
                    dis[v] = dis[u] + w;
                    q.add(new edge(v, dis[v]));
                }
            }
        }
        System.out.println(dis[n]);
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