import java.util.*;
import java.io.*;
public class FoursAndFives {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int n = readInt();
        int ans = 0;
        int rem = n%20;
        if(rem==4||rem==5||rem==8||rem==9||rem==10||rem==12||rem==13||rem==14||rem==15||rem==16||rem==17||rem==18||rem==19||rem==0){
            ans+=n/20+1;
            System.out.println(ans);
        }
        else{
            int lcm = n/20;
            if((rem==6||rem==1||rem==11||rem==7||rem==2||rem==3)&&lcm-1>=0){
                ans+=lcm;
                System.out.println(ans);
            }
            else{
                System.out.println(0);
            }
        }
        
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