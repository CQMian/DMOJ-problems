import java.util.*;
import java.io.*;
public class HitchhikingFun {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException{
        int n = readInt();
        int m = readInt();
        int dangerous = 0;
        List<edge> adj[] = new ArrayList[n+1];
        for(int i = 1; i<=n;i++)
            adj[i] = new ArrayList<>();
        for(int i = 1; i<=m;i++){
            int u = readInt();
            int v = readInt();
            int w = readInt();
            if(w==1)
                dangerous++;
            adj[u].add(new edge(v,w));
            adj[v].add(new edge(u,w));
        }
        int dis[] = new int[n+5];
        int moves[] = new int[n+5];
        boolean vis[] = new boolean[n+5];
        Arrays.fill(moves,Integer.MAX_VALUE);
        Arrays.fill(dis, Integer.MAX_VALUE);
        if(dangerous!=1){
        PriorityQueue<edge> pq = new PriorityQueue<>();

        dis[1] = 0;
        moves[1] = 0;
        pq.add(new edge(1,0));
        while(!pq.isEmpty()){
            edge cur = pq.poll();
            int u = cur.v;
            // if(vis[u])
            //     continue;
            vis[u] = true;
            for(edge e : adj[u]){
                int v = e.v;
                int w = e.w;
                if(dis[v]>dis[u]+w){
                    dis[v]=dis[u]+w;
                    moves[v] = moves[u]+1;
                    pq.add(new edge(v,dis[v]));
                }
                else if(dis[v]>=dis[u]+w&&moves[v]>moves[u]+1){
                    dis[v] = dis[u]+w;
                    moves[v] = moves[u]+1;
                    pq.add(new edge(v,dis[v]));
                }

            }
        }
        }
        else{
            dis[1] = 0;
            moves[1] = 0;
            Queue<edge> q = new LinkedList<>();
            q.add(new edge(1,0));
            while(!q.isEmpty()){
                edge cur = q.poll();
                int u = cur.v;
                if(vis[u])
                    continue;
                vis[u] = true;
                for(edge e:adj[u]){
                    int v = e.v;
                    int w = e.w;
                    if(dis[v]>dis[u]+w)
                        dis[v]=w+dis[u];
                    if(w!=1){
                        if(moves[v]>moves[u]+1){

                            moves[v] = moves[u]+1;
                            q.add(new edge(v,0));
                        }
                    }
                    else{
                        if(moves[v]>moves[u]+1){
                            moves[v] = moves[u]+1;
                            q.add(new edge(v,0));
                        }
                    }
                }
            }
        }
        System.out.println(vis[n]?dis[n] + " " + moves[n]:-1);

        
        
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