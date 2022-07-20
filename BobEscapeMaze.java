import java.util.*;
import java.io.*;

public class BobEscapeMaze {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int m = readInt();
        int n = readInt();
        boolean[][] visited = new boolean[m+1][n+1];
        int[][] moves = new int[m+1][n+1];
        int sr = readInt()-1;
        int sc = readInt()-1;
        int er = readInt()-1;
        int ec = readInt()-1;
        for(int c = 0; c<m; c++){
            String temp = readLine();
            for(int r = 0; r<n; r++){
                char a = temp.charAt(r);
                if(a == '#'){
                    visited[c][r] = true;
                }
            }
        }
        Queue<Pair> q = new LinkedList<>();
        int[][] k = {{2, 1}, {2, -1}, {1, 2}, {1, -2}, {-1, 2}, {-1, -2}, {-2, 1}, {-2, -1}};
        int[][] s = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

        q.add(new Pair(sr, sc));
        while(!q.isEmpty()){
            int x = q.peek().x;
            int y = q.peek().y;
            q.poll();

            for(int i = 0; i<8; i++){
                int newX = x + k[i][0];
                int newY = y + k[i][1];
                if(newX < 0 || newX >= m || newY<0 || newY >= n || visited[newX][newY])
                    continue;
                q.add(new Pair(newX, newY));
                visited[newX][newY] = true;
                moves[newX][newY] = moves[x][y] + 1;
            }

            for(int i = 0; i<4; i++){
                int newX = x + s[i][0];
                int newY = y + s[i][1];
                if(newX < 0 || newX >= m || newY<0 || newY >= n || visited[newX][newY])
                    continue;
                q.add(new Pair(newX, newY));
                visited[newX][newY] = true;
                moves[newX][newY] = moves[x][y] + 1;
            }
            if(visited[er][ec]){
                System.out.println(moves[er][ec]);
                break;
            }
        }
        if(!visited[er][ec]){
            System.out.println(-1);
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
class Pair{
    int x;
    int y;

    public Pair(int x, int y){
        this.x = x;
        this.y = y;
    }
}