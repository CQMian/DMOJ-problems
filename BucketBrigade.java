import java.util.*;
import java.io.*;
public class BucketBrigade {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{
        int rockX= 0, rockY= 0, lakeX= 0,lakeY = 0, barnX= 0,barnY= 0,ans;  
        for(int i = 0; i<10;i++){
            String s = readLine();
            for(int j = 0; j<10;j++){
                char temp = s.charAt(j);
                if(temp=='R'){
                    rockX =i;
                    rockY = j;
                }
                if(temp=='B'){
                    barnX = i;
                    barnY= j;
                }
                if(temp=='L'){
                    lakeX=i;
                    lakeY=j;
                }
            }
        }
        ans = Math.abs(lakeX-barnX)+Math.abs(lakeY-barnY)-1;
        if(lakeX==barnX&&lakeX==rockX){
            if(barnX>rockX&&rockX>lakeX||barnX<rockX&&rockX<lakeX)
                ans+=2;
        }
        if(lakeY==barnY&&lakeY==rockY){
            if(barnX>rockX&&rockX>lakeX||barnX<rockX&&rockX<lakeX)

                ans+=2;
        }
            
        System.out.println(ans);

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