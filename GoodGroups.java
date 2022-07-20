import java.util.*;
import java.io.*;
public class GoodGroups {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static Map<String, Integer> map;
    static pair[] same;
    static pair[] diff;
    static int[] parent;
    static class pair{
        String a;
        String b;
        public pair(String a, String b){
            this.a = a;
            this.b = b;
        }
    }
    public static void main(String[] args) throws IOException {
        int n = readInt();
        map = new HashMap<>();
        same = new pair[n];
        int counter = 1;
        for(int i = 0; i<n; i++){
            String a = next();
            String b = next();
            same[i] = new pair(a, b);
        }
        int m = readInt();
        diff = new pair[m];
        for(int i = 0; i<m; i++){
            String a = next();
            String b = next();
            diff[i] = new pair(a, b);
        }
        int g = readInt();
        parent = new int[g*3+1];
        for(int i = 1; i<=g*3; i++){parent[i] = i;}
        for(int i = 0; i<g; i++){
            String a = next();
            String b = next();
            String c = next();

            map.put(a, counter);
            counter++;


            map.put(b, counter);
            counter++;


            map.put(c, counter);
            counter++;

            parent[map.get(b)] = map.get(a);
            parent[map.get(c)] = map.get(a);
        }
        int ans = 0;
        for(int i = 0; i<n; i++){
            int a = map.get(same[i].a);
            int b = map.get(same[i].b);
            if(parent[a] != parent[b]){
                ans++;
            }
        }
        for(int i = 0; i<m; i++){
            int a = map.get(diff[i].a);
            int b = map.get(diff[i].b);
            if(parent[a] == parent[b]){
                ans++;
            }
        }
        System.out.println(ans);

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