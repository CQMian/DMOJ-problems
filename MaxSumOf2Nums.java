// import java.util.*;
// import java.io.*;
// public class MaxSumOf2Nums {
// 	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
// 	static StringTokenizer st;

//     public static void main(String[] args) throws IOException
//     {
//         int num = readInt();
//         ArrayList<Long> arr = new ArrayList();
//         long max = readLong();
//         long maxSum = 0;
//         for(int i = 0; i<num;i++){
//             long temp = readLong();
//             if(temp<max)
//                 arr.add(temp);
//         }
//         Collections.sort(arr);
//         for(int i = 0;i<arr.size();i++){
//             long ls = arr.get(i);
//             for(int j = arr.size()-1;j>i;j--){
//                 long rs = arr.get(j);
//                 if(ls!=rs&&(ls+rs)<=max&&(ls+rs)>maxSum){
//                     maxSum = ls+rs;
//                     break;
//                 }
//             }
//             if(maxSum==max)
//                 break;
//         }
//         System.out.println(maxSum);
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