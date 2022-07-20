import java.util.*;
import java.io.*;
public class AliceShoping {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
        int time = readInt();
        int shops = readInt();
        int output = 0;
        int distance = 0;
        int lastPos = 0;
        TreeMap<Integer,Boolean> arr = new TreeMap<Integer,Boolean>();
        for(int i = 0; i<shops;i++){
            int temp = readInt();
            if(temp<0)
                arr.put(Math.abs(temp),false);
            else
                arr.put(Math.abs(temp),true);
            
        }
        while(distance<=time){
            for(Map.Entry<Integer,Boolean> entry : arr.entrySet()){
                int temp = entry.getKey();
                
                if(!entry.getValue())
                    temp*=-1;
                distance+=Math.abs(temp-lastPos);
                if(distance>time)
                    distance = time+1;
                else{
                    output++;
                    lastPos = temp;
                }


            }
        }
        System.out.println(output);
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