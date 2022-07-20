import java.util.*;
import java.io.*;
public class HelloOfficer {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException{
        int n = readInt();
        int m = readInt();
        int b = readInt();
        int query = readInt();
        List<edge> adj[] = new ArrayList[n+1];
        for(int i = 1; i<=n;i++)
            adj[i] = new ArrayList<>();
        for(int i = 1; i<=m;i++){
            int u = readInt();
            int v = readInt();
            int w = readInt();
            adj[u].add(new edge(v,w));
            adj[v].add(new edge(u,w));
        }
        int dis[] = new int[n+1];
        boolean vis[] = new boolean[n+1];
        PriorityQueue<edge> q = new PriorityQueue<>();
        Arrays.fill(dis, Integer.MAX_VALUE);
        dis[b] = 0;
        q.add(new edge(b,0));
        while(!q.isEmpty()){
            edge cur = q.poll();
            int u = cur.v;
            int d = cur.w;
            if(vis[u])
                continue;
            vis[u] = true;
            for(edge e : adj[u]){
                int v = e.v;
                int w = e.w;
                if(dis[v]>dis[u]+w){
                    dis[v]=dis[u]+w;
                    q.add(new edge(v,dis[v]));
                }
            }
        }
        for(int i = 1;i<=query;i++){
            int pos = readInt();
            System.out.println(vis[pos]?dis[pos]:-1);
        }
    }
    static class edge implements Comparable<edge>{
        int v, w;
        edge(int v0,int w0){
            v = v0;
            w = w0;
        }
        public int compareTo(edge x){
            return Integer.compare(w,x.w);
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