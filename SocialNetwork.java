import java.util.*;
import java.io.*;
public class SocialNetwork {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int[] parent;
    static int findParent(int p){
        if(p != parent[p]){
            parent[p] = findParent(parent[p]);
        }
        return parent[p];
    }
    public static void main(String[] args) throws IOException {
        int n = readInt();
        parent = new int[n*2+1];
        int[] size = new int[n*2+1];
        for(int i = 1; i<=n*2; i++){
            size[i] = 1;
            parent[i] = i;
        }
        Map<String, Integer> map = new HashMap<>();
        int counter = 1;
        for(int i = 0; i<n; i++){
            String a = next();
            String b = next();
            if(!map.containsKey(a)){
                map.put(a, counter);
                counter++;
            }
            if(!map.containsKey(b)){
                map.put(b, counter);
                counter++;
            }
            int index1 = map.get(a);
            int index2 = map.get(b);
            int findP1 = findParent(index1);
            int findP2 = findParent(index2);
            if(findP1 != findP2){
                parent[findP1] = parent[findP2];
                size[findP2] += size[findP1];
                size[findP1] = size[findP2];
            }
            System.out.println(size[index2]);
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