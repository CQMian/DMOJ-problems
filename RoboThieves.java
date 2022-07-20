import java.util.*;
import java.io.*;

public class RoboThieves {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static char[][] arr;
    static char[][] newArr;
    static int n,m;
    static boolean dead;
    public static void main(String[] args) throws IOException {
        n = readInt();
        m = readInt();
        arr = new char[n+1][m+1];
        newArr = new char[n+1][m+1];
        int[][] moves = new int[n+1][m+1];
        int sr = 0;
        int sc = 0;
        for(int r = 0; r<n; r++){
            String temp = readLine();
            for(int c = 0; c<m; c++){
                char a = temp.charAt(c);
                moves[r][c] = Integer.MAX_VALUE;
                arr[r][c] = a;
                newArr[r][c] = a;
                if(a == 'S'){
                    sr = r;
                    sc = c;
                }
            }
        }
        for(int r = 0; r<n; r++){   
            for(int c = 0; c<m; c++){
                if(arr[r][c] == 'C')
                    camera(r,c);    
            }
        }

        Queue<Pair> q = new LinkedList<>();
        int[][] s = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        q.add(new Pair(sr, sc));
        moves[sr][sc] = 0;
        while(!q.isEmpty()&&!dead){
            int x = q.peek().x;
            int y = q.peek().y;
            q.poll();
            //System.out.println(x+" " + y);

            for(int i = 0; i<4; i++){
                int newX = x + s[i][0];
                int newY = y + s[i][1];
                if(newX < 0 || newX >= n || newY<0 || newY >= m ||newArr[newX][newY]=='W'||moves[x][y]+1>=moves[newX][newY])
                    continue;
                if(newArr[x][y]=='L'||newArr[x][y]=='R'||newArr[x][y]=='U'||newArr[x][y]=='D')
                    continue;
                q.add(new Pair(newX, newY));
                moves[newX][newY] = moves[x][y] + 1;
            }
            int oldX = x;
            int oldY = y;
            boolean[][] cycle = new boolean[n+1][m+1];
            while(newArr[x][y]!='.'&&newArr[x][y]!='W'&&newArr[x][y]!='S'){
                if(newArr[x][y]=='L'){
                    cycle[x][y] =true;
                    y--;
                }
                else if(newArr[x][y] == 'R'){
                    cycle[x][y] =true;
                    y++;
                }
                else if(newArr[x][y] == 'U'){
                    cycle[x][y] =true;
                    x--;
                }
                else if(newArr[x][y] == 'D'){
                    cycle[x][y] =true;
                    x++;
                }
                if(cycle[x][y])
                    break;
            }
            if(oldX!=x||oldY!=y){
                if(newArr[x][y]!='.'||moves[oldX][oldY]>moves[x][y])
                    continue;
                q.add(new Pair(x,y));
                moves[x][y] = moves[oldX][oldY];
            }
        }
        for(int r = 0; r<n; r++){   
            for(int c = 0; c<m; c++){
                if(arr[r][c] == '.'){
                    if(moves[r][c]!=Integer.MAX_VALUE)
                        System.out.println(moves[r][c]);
                    else
                        System.out.println(-1);
                }
            }
        }
    }
    static void camera(int r, int c){
        for(int i = r-1;i>=0;i--){
            if(arr[i][c]=='.')
                newArr[i][c] = 'W';
            else if(arr[i][c] == 'W')
                break;
            if(arr[i][c]=='S'){
                dead = true;
                return;
            }
        }
        for(int i = r+1;i<n;i++){
            if(arr[i][c]=='.')
                newArr[i][c] = 'W';
            else if(arr[i][c] == 'W')
                break;
            if(arr[i][c]=='S'){
                dead = true;
                return;
            }
        }
        for(int i = c-1;i>=0;i--){
            if(arr[r][i]=='.')
                newArr[r][i] = 'W';
            else if(arr[r][i] == 'W')
                break;
            if(arr[r][i]=='S'){
                dead = true;
                return;
            }
        }
        for(int i = c+1;i<m;i++){
            if(arr[r][i]=='.')
                newArr[r][i] = 'W';
            else if(arr[r][i] == 'W')
                break;
            if(arr[r][i]=='S'){
                dead = true;
                return;
            }
        }
        
        newArr[r][c] = 'W';
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