// import java.util.*;
// import java.io.*;
// public class Towers {
// 	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
// 	static StringTokenizer st;
// 	public static void main(String[] args) throws IOException {
//         int towers = readInt();
// 		int[] arr = new int[towers];
// 		int[] output = new int[towers];
// 		for(int i = 0;i<towers;i++)
// 			arr[i] = readInt();
		
//         Stack<Integer> tower = new Stack();
// 		tower.add(0);
// 		for(int i = 1; i<towers;i++){
// 			while (!tower.isEmpty() && arr[tower.peek()] <= arr[i]) {
//                 tower.pop();
//             }
// 			if(tower.size()==0)
// 				output[i] = i;
// 			else
// 				output[i] = i-tower.peek();
// 			tower.add(i);
// 		}
// 		for(int i: output)
// 			System.out.print(i+ " ");
// 	}
 
// 	static String next() throws IOException {
// 		while (st == null || !st.hasMoreTokens())
// 			st = new StringTokenizer(br.readLine().trim());
// 		return st.nextToken();
// 	}
 
// 	static long readLong() throws IOException {
// 		return Long.parseLong(next());
// 	}
 
// 	static int readInt() throws IOException {
// 		return Integer.parseInt(next());
// 	}
 
// 	static double readDouble() throws IOException {
// 		return Double.parseDouble(next());
// 	}
 
// 	static char readCharacter() throws IOException {
// 		return next().charAt(0);
// 	}
 
// 	static String readLine() throws IOException {
// 		return br.readLine().trim();
// 	}
// }