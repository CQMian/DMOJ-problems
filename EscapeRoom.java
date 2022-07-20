    import java.util.*;
    import java.io.*;

    public class EscapeRoom {
        static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        static StringTokenizer st;
        static int[] values = new int[1000001];
        public static void main(String[] args) throws IOException {
            int m = readInt();
            int n = readInt();
            boolean[][] visited = new boolean[m+1][n+1];

            int curPosValue = 1;
            int[][] adj = new int[m+1][n+1];
            for(int r = 1;r<=m;r++){
                for(int c = 1; c<=n;c++){
                    adj[r][c] = readInt();
                }
            }
            Stack<Pair> q = new Stack<>();
            
    //Optimal solutino is starting from M N and working backwards
            q.add(new Pair(1, 1));
            while(!q.isEmpty()){
                int x = q.peek().x;
                int y = q.peek().y;
                q.pop();
                curPosValue = adj[x][y];
                int z = divisors(curPosValue);
                for(int i = 0; i<z; i++){
                    int newX = values[i];
                    int newY = curPosValue/newX;
                    //System.out.println(newX + " " + newY);
                    if(newX > m || newY > n || visited[newX][newY])
                        continue;
                    q.add(new Pair(newX, newY));
                    visited[newX][newY] = true;
                }
                if(visited[m][n]){
                    System.out.println("yes");
                    break;
                }
            }
            if(!visited[m][n]){
                System.out.println("no");
            }
        }
        static int divisors(int n)
        {
            int counter = 0;
            for (int i=1; i<=Math.sqrt(n); i++)
            {
                if (n%i==0)
                {
                    if (n/i == i){
                        values[counter] = i;
                        counter++;
                    }
        
                    else{
                        values[counter] = i;
                        counter++;
                        values[counter] = n/i;
                        counter++;
                    }
                }
            }
            return counter;
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