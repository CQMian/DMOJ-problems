import java.util.*;
import java.io.*;

public class SearchingForSoulmates {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = readInt();
        for(int o = 0; o<n; o++){
            long start = readLong();
            long stop = readLong();
            long ans = 0;
            if(start<stop){
               ans += below(start,stop);

            }
            else if(start>stop){
                long min = Integer.MAX_VALUE;
                long prevAns = Integer.MAX_VALUE;
                while(start!=stop){
                    if(start>stop&&start%2==1){
                        start++;
                        start/=2;
                        ans+=2;
                    }
                    else if(start>stop&&start%2==0){
                        start/=2;
                        ans++;
                    }
                    if(start<stop){
                        if(min>below(start,stop))
                            min = below(start,stop);
                        prevAns = ans+min;
                        System.out.println(below(start,stop) + " " + min + " " + ans + " " + start + " " + prevAns);
                        if(start>=2){
                            if(start%2==0){
                                ans++;
                                start/=2;
                            }
                            else{
                                start++;
                                start/=2;
                                ans+=2;
                            }
                        }
                        else{
                            start = stop;
                        }

                    }
                    
                }
                
            }
            else if(start==stop){
                ans = 0;
            }
            System.out.println(ans);
            
        }
    }
    static long target(long stop){
        if(stop%2==1){
            stop-=1;
            stop/=2;
        }
        else{
            stop/=2;
        }
        return stop;
    }
    static long below(long start, long stop){
        long ans = 0;
        while(start!=stop){
            if(start<stop&&2*start>stop){
                ans+=stop-start;
                start+=stop-start;

            }
            if(start*2<=stop){
                start++;
                ans++;
            }
            if(start*2>stop&&(start-1)*2<=stop){
                start--;
                start*=2;
                
            }
        }
        return ans;
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
// import java.util.*;
// import java.io.*;

// import java.util.*;
// import java.io.*;
// public class Main {
//     static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//     static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
//     static StringTokenizer st;
//     static class pair{
//         long num;
//         long lvl;
//         public pair(long num, long lvl){
//             this.num = num;
//             this.lvl = lvl;
//         }
//     }
//     static long bfs(long start, long end){
//         Set<Long> vis = new HashSet<>();
//         Queue<pair> q = new LinkedList<>();
//         q.add(new pair(start, 0));
//         vis.add(start);
//         if(start == end){
//             return 0;
//         }
//         while(!q.isEmpty()){
//             pair cur = q.poll();
//             long curNum = cur.num;
//             long curLvl = cur.lvl;
//             if(curNum%2 == 0 && curNum/2 > 0 && !vis.contains(curNum/2)){
//                 vis.add(curNum/2);
//                 q.add(new pair(curNum/2, curLvl+1));
//             }
//             if(curNum*2 < 1e18 && !vis.contains(curNum*2)){
//                 vis.add(curNum*2);
//                 q.add(new pair(curNum*2, curLvl+1));
//             }
//             if(curNum+1 < 1e18 && !vis.contains(curNum+1)){
//                 vis.add(curNum+1);
//                 q.add(new pair(curNum+1, curLvl+1));
//             }
//             if(vis.contains(end)){
//                 return curLvl+1;
//             }
//         }
//         return 1;
//     }
//     public static void main(String[] args) throws IOException {
//         int n = readInt();
//         for(int i = 0; i<n; i++){
//             long a = readLong();
//             long b = readLong();
//             long thing = bfs(a, b);
//             System.out.println(thing);
//         }
//     }


//     static String next() throws IOException {
//         while (st == null || !st.hasMoreTokens()) {
//             st = new StringTokenizer(br.readLine().trim());
//         }
//         return st.nextToken();
//     }

//     static long readLong() throws IOException {
//         return Long.parseLong(next());
//     }

//     static int readInt() throws IOException {
//         return Integer.parseInt(next());
//     }

//     static double readDouble() throws IOException {
//         return Double.parseDouble(next());
//     }

//     static char readCharacter() throws IOException {
//         return next().charAt(0);
//     }

//     static String readLine() throws IOException {
//         return br.readLine().trim();
//     }
// }