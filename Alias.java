import java.util.*;
import java.io.*;
public class Alias {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static ArrayList<pair>[] arr;
    static int n;
    static long[][] dis;
    static void solveDists(int start){
        PriorityQueue<pair> q = new PriorityQueue<>();
        boolean[] vis = new boolean[n+1];
        q.add(new pair(start, 0));
        dis[start][start] = 0;
        while(!q.isEmpty()){
            pair cur = q.poll();
            int u = cur.n;
            if(vis[u]){
                continue;
            }
            vis[u] = true;
            for(pair nxt: arr[u]){
                int v = nxt.n;
                long w = nxt.w;
                if(dis[start][u] + w < dis[start][v]){
                    dis[start][v] = dis[start][u] + w;
                    q.add(new pair(v, dis[start][v]));
                }
            }
        }
    }
    static class pair implements Comparable<pair> {
        int n;
        long w;

        public pair(int n0, long w0) {
            this.n = n0;
            this.w = w0;
        }
        public int compareTo(pair e){
            return Long.compare(w, e.w);
        }
    }
    public static void main(String[] args) throws IOException {
        n = readInt();
        int m = readInt();
        dis = new long[n+1][n+1];
        arr = new ArrayList[n+1];
        for(int i = 1; i<=n; i++){
            arr[i] = new ArrayList<>();
        }
        for(int i = 1; i<=n; i++){
            Arrays.fill(dis[i], (long)1e18);
        }

        Map<String, Integer> map = new HashMap<>();
        int cur = 1;
        for(int i = 0; i<m; i++){
            String u = next();
            if(!map.containsKey(u)){
                map.put(u, cur);
                cur++;
            }
            String v = next();
            if(!map.containsKey(v)){
                map.put(v, cur);
                cur++;
            }
            long w = readLong();
            arr[map.get(u)].add(new pair(map.get(v), w));
        }
        int q = readInt();
        for(int i = 1; i<=n; i++){
            solveDists(i);
        }
        for(int i = 0; i<q; i++){
            String u = next();
            String v = next();
            int row = map.get(u);
            int col = map.get(v);
            if(dis[row][col] == (long)1e18){
                System.out.println("Roger");
            } else {
                System.out.println(dis[row][col]);
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