// import java.util.*;

// import jdk.internal.jshell.tool.resources.l10n;

// import java.io.*;
// public class RimuruNumGame {
// 	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
// 	static StringTokenizer st;
//     static String s;
// 	public static void main(String[] args) throws IOException{
//         Long num = readLong();
//         s = "2";
//         int counter = 0;
//         while(Long.parseLong(s)<num){
//             s = (nextNum(s));
//             counter++;
//         }
//         System.out.println(counter);
//     }
//     static String nextNum(String s){
//         String output = "";
//         for(int i = s.length()-1; i>=0;i--){
//             if(s.charAt(i)=='3'){
//                 output = 2 + output;
//             }
//             else{
//                 output = 3 + output;
//                 output = s.substring(0,i) + output;
//                 break;
//             }
//         }
//         for(int i = 0; i<s.length();i++)
//             if(output.charAt(i)!='2')
//                 return output;
//         return 2 + output;
//     }
// 	static String next () throws IOException {
// 		while (st == null || !st.hasMoreTokens())
// 			st = new StringTokenizer(br.readLine().trim());
// 		return st.nextToken();
// 	}
// 	static long readLong () throws IOException {
// 		return Long.parseLong(next());
// 	}
// 	static int readInt () throws IOException {
// 		return Integer.parseInt(next());
// 	}
// 	static double readDouble () throws IOException {
// 		return Double.parseDouble(next());
// 	}
// 	static char readCharacter () throws IOException {
// 		return next().charAt(0);
// 	}
// 	static String readLine () throws IOException {
// 		return br.readLine().trim();
// 	}
// }