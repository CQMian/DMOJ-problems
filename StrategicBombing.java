import java.util.*;
import java.io.*;
public class StrategicBombing {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
        int counter = 0;
        ArrayList<String> output = new ArrayList<>();
        boolean adj[][] = new boolean[26][26];
        String input = readLine();
        while(!input.equals("**")){
            output.add(input);
            adj[(int)input.charAt(0)-65][(int)input.charAt(1)-65] = true;
            adj[(int)input.charAt(1)-65][(int)input.charAt(0)-65] = true;
            input = readLine();
        }

        for(int i = output.size()-1; i>=0;i--){
            String temp = output.get(i);
            adj[(int)temp.charAt(0)-65][(int)temp.charAt(1)-65] = false;
            adj[(int)temp.charAt(1)-65][(int)temp.charAt(0)-65] = false;
            boolean visited[] = new boolean[26];
            Queue<Integer> q = new LinkedList<Integer>();
            q.add(0);
            visited[0] = true;



            while (!q.isEmpty()) {
                int currentNode = q.poll();


                for (int child = 0; child<26;child++) {
    
                    if (adj[currentNode][child]&&!visited[child]) {
                        visited[child] = true; 
                            q.add(child);
                    }
                }
            }
            if(!visited[1]){
                counter++;
            }
            else
                output.remove(i);
            adj[(int)temp.charAt(0)-65][(int)temp.charAt(1)-65] = true;
            adj[(int)temp.charAt(1)-65][(int)temp.charAt(0)-65] = true;
        }
        for(String s: output){
            System.out.println(s);
        }
        System.out.println("There are " + counter + " disconnecting roads.");

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