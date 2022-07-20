import java.util.*;
import java.io.*;
public class Race {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int distance = readInt();
        int num = readInt();
        int[] speedLim = new int[num];
        for(int i = 0; i<num; i++)
            speedLim[i] = readInt();
        
        for(int i = 0; i<num;i++){
            int counter = 0;
            int distanceTraveled = 0;
            int speed = 0;
            while(true){
                speed++;
                counter++;
                distanceTraveled+=speed;
                if(distanceTraveled>=distance)
                    break;
                if(speed>=speedLim[i]){
                    distanceTraveled+=speed;
                    counter++;
                    if(distanceTraveled>=distance)
                        break;
                }
            }
            System.out.println(counter);
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