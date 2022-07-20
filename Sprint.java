import java.util.*;
import java.io.*;
public class Sprint{
 
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args)throws IOException{
        int nums = Integer.parseInt(br.readLine());
        TreeMap<Integer,Integer> observations = new TreeMap<Integer,Integer>();
        for(int i = 0;i<nums;i++)
            observations.put(readInt(),readInt());
        double max = 0;
        double distance = 0;
        double time = Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer> entry : observations.entrySet()){
            if(time>=0){
                double num = Math.abs(entry.getValue()-distance);
                double denom = entry.getKey()-time;
                if(num/denom>max)
                    max = num/denom;
            }
            time = entry.getKey();
            distance = entry.getValue();
            System.out.println(time);
            System.out.println(distance);
        }
        System.out.println(max);
    }
	static String next() throws IOException {
		while (st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine().trim());
		return st.nextToken();
	}
 
	static int readInt() throws IOException {
		return Integer.parseInt(next());
	}


     
}