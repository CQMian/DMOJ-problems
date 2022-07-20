// import java.util.*;
// import java.io.*;
// public class Perket {
// 	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
// 	static StringTokenizer st;
//     static int output = Integer.MAX_VALUE;
//     static int num; 
//     static int[] sour, bitter;
// 	public static void main(String[] args) throws IOException { 
//         num = readInt();
//         sour = new int[num];
//         bitter = new int[num];
//         for(int i=0; i<num; i++) {
//             sour[i] = readInt(); 
//             bitter[i] = readInt();
//         }
//         ArrayList<Integer> arr = new ArrayList();
//         calc(0, arr);
//         System.out.println(output);
//     }
//     public static void calc(int index, ArrayList<Integer> arr) {
//         if(index == num) {
//             if(arr.isEmpty())
//                 return;
//             int totalSour = 1;
//             int totalBitter = 0;
//             for(int i: arr) {
//                 totalSour *= sour[i]; 
//                 totalBitter += bitter[i];
//             }
//             output = Math.min(output, Math.abs(totalSour - totalBitter));
//             return; 
//         }
//         calc(index+1, arr);
//         arr.add(index); 
//         calc(index+1, arr); 
//         arr.remove(arr.size()-1);
//     }
 
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