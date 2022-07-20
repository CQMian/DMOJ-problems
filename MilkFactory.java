import java.util.*;
import java.io.*;
public class MilkFactory {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
    static ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
    static int num = 0;
	public static void main(String[] args) throws IOException{
        num = readInt();
        int output = -1;
        for(int i = 0; i<num;i++){
            arr.add(new ArrayList<Integer>());
        }
        for(int i = 0;i<num-1;i++){
            int a = readInt()-1;
            int b = readInt()-1;
            arr.get(b).add(a);
        }
        for(int i = 0;i<num;i++){

            if(check(i)){
                output = i+1;
                break;
            }
        }
        System.out.println(output);
        
    }
    public static boolean check(int i){
        boolean[] v = new boolean[num];
        dfs(i,v);
        for(boolean b:v){
            if(!b)
                return false;
        }
        return true;
    }
    public static void dfs(int i, boolean[] v) {
		v[i] = true;
		for (Integer next: arr.get(i))
			if (!v[next])
				dfs(next, v);
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