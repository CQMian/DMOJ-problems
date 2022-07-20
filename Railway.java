import java.util.*;
import java.io.*;
public class Railway{
 
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args)throws IOException{
        int[] outputs = new int[10];
        for(int i = 0;i<10;i++){
            ArrayList<Integer> railway = new ArrayList<Integer>();
            int nums = in.nextInt();
            for(int j = 0;j<nums;j++){
                railway.add(in.nextInt());
            }
            int output = 0;
            for(int j = nums-1;j>=0;j--){
                if(railway.indexOf(j) > railway.indexOf(j+1)){
                    output += railway.indexOf(j);
                    railway.add(0, railway.remove(railway.indexOf(j)));
                    //railway.remove(railway.lastIndexOf(j));
                }
            
                
                }
                System.out.println(output);
                outputs[i] = output;
            }
        for(int i:outputs){
            System.out.println(i);
        }
    }
        
    
    
	static String next() throws IOException {
		while (st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine().trim());
		return st.nextToken();
	}
 
	static long readInt() throws IOException {
		return Integer.parseInt(next());
	}
}