// import java.util.*;
// import java.io.*;
// public class ItsToughBeingATeen {
//     static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//     static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
//     static StringTokenizer st;
//     public static void main(String[] args) throws IOException {
//         ArrayList<Integer>[] arr = new ArrayList[8];
//         int[] inDegree = new int[8];
//         for(int i = 0; i<8; i++){
//             arr[i] = new ArrayList<>();
//         }
//         arr[1].add(7);
//         inDegree[7]++;
//         arr[1].add(4);
//         inDegree[4]++;
//         arr[2].add(1);
//         inDegree[1]++;
//         arr[3].add(4);
//         inDegree[4]++;
//         arr[3].add(5);
//         inDegree[5]++;
//         int x = readInt();
//         int y = readInt();
//         while(x != 0 || y != 0){
//             arr[x].add(y);
//             inDegree[y]++;
//             x = readInt();
//             y = readInt();
//         }
//         ArrayList<Integer> holder = new ArrayList<>();
//         PriorityQueue<Integer> q = new PriorityQueue<Integer>();
//         for(int i = 1; i<8; i++){
//             if(inDegree[i] == 0){
//                 q.add(i);
//             }
//         }
//         int counter = 0;
//         while(!q.isEmpty()){
//             int cur = q.poll();
//             counter++;
//             holder.add(cur);
//             for(int nxt: arr[cur]){
//                 inDegree[nxt]--;
//                 if(inDegree[nxt] == 0){
//                     q.add(nxt);
//                 }
//             }
//         }
//         if(counter != 7){
//             System.out.println("Cannot complete these tasks. Going to bed.");
//         } else {
//             for(int i = 0; i<holder.size(); i++){
//                 System.out.print(holder.get(i) + " ");
//             }
//         }

//     }
//     static String next() throws IOException {
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
