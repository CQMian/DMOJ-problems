// import java.util.*;
// import java.io.*;
// public class StuckInRut {
//     static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//     static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
//     static StringTokenizer st;
//     public static void main(String[] args) throws IOException {
//         int num = readInt();
//         int[] xPos = new int[num], yPos = new int[num];
//         char[] dir = new char[num];
//         for(int i = 0; i<num;i++){
//             dir[i] = readCharacter();
//             xPos[i] = readInt();
//             yPos[i] = readInt();
//         }
//         int output[] = new int[num];
//         ArrayList<Integer> differences = new ArrayList();
//         Arrays.fill(output,Integer.MAX_VALUE);
//         for(int i = 0; i<num;i++){
//             for(int j = i+1; j<num;j++){
//                 differences.add(Math.abs(xPos[i]-xPos[j]));
//                 differences.add(Math.abs(yPos[i]-yPos[j]));
//             }
//         }
//         Collections.sort(differences);
//         for (int d : differences) {
//             for (int j = 0; j < num; j++) {
//                 for (int k = 0; k < num; k++) {
//                     if (dir[j] == 'E' && dir[k] == 'N' && xPos[j] < xPos[k] && yPos[k] < yPos[j]) {
//                         if (xPos[j] + d == xPos[k] && yPos[k] + Math.min(output[k], d) > yPos[j]) {
//                             output[j] = Math.min(output[j], d);
//                         } else if (yPos[k] + d == yPos[j] && xPos[j] + Math.min(output[j], d) > xPos[k]) {
//                             output[k] = Math.min(output[k], d);
//                         }
//                     }
//                 }
//             }
//         }
//         for (int j = 0; j < num; j++) {
//             System.out.println(output[j] == Integer.MAX_VALUE ? "Infinity" : output[j]);
//         }

//     }


//     static String next() throws IOException {
//         while (st == null || !st.hasMoreTokens())
//             st = new StringTokenizer(br.readLine().trim());
//         return st.nextToken();
//     }

//     static long readLong() throws IOException {
//         return Long.parseLong(next());
//     }

//     static int readInt() throws IOException {
//         return Integer.parseInt(next());
//     }

//     static double readDouble() throws IOException {
//         return Double.parseDouble(next());
//     }

//     static char readCharacter() throws IOException {
//         return next().charAt(0);
//     }

//     static String readLine() throws IOException {
//         return br.readLine().trim();
//     }
// }