// import java.util.*;
// import java.io.*;
// public class Hearth {
// 	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
// 	static StringTokenizer st;
//     static Scanner in = new Scanner(System.in);
// 	public static void main(String[] args) throws IOException {
//         int cards = in.nextInt();
//         int target = in.nextInt();
//         ArrayList<String> output = new ArrayList<String>();
//         TreeMap<String, Integer> cardList = new TreeMap<String, Integer>();
//         for(int i = 0;i <cards; i++)
//             cardList.put(in.next(), in.nextInt());
//         Set<Map.Entry<String, Integer> > entrySet = cardList.entrySet();
//         Map.Entry<String, Integer>[] cardArray = entrySet.toArray(new Map.Entry[entrySet.size()]);
//         for(int i = 0; i<cardArray.length-2;i++){
//             if(cardArray[i].getValue()<target){
//                 for(int j = i+1;j<cardArray.length-1;j++){
//                     if(cardArray[i].getValue()+cardArray[j].getValue()<target){
//                         for(int k = j+1; k<cardArray.length;k++){
//                             if(cardArray[i].getValue()+cardArray[j].getValue()+cardArray[k].getValue()<=target)
//                                 output.add(cardArray[i].getKey()+ " " + cardArray[j].getKey() + " " + cardArray[k].getKey());
//                         }
//                     }
//                 }
//             }
//         }
//         for(String s: output)
//             System.out.println(s);
        
// 	}
 
// 	// static String next() throws IOException {
// 	// 	while (st == null || !st.hasMoreTokens())
// 	// 		st = new StringTokenizer(br.readLine().trim());
// 	// 	return st.nextToken();
// 	// }
 
// 	// static long readLong() throws IOException {
// 	// 	return Long.parseLong(next());
// 	// }
 
// 	// static int readInt() throws IOException {
// 	// 	return Integer.parseInt(next());
// 	// }
 
// 	// static double readDouble() throws IOException {
// 	// 	return Double.parseDouble(next());
// 	// }
 
// 	// static char readCharacter() throws IOException {
// 	// 	return next().charAt(0);
// 	// }
 
// 	// static String readLine() throws IOException {
// 	// 	return br.readLine().trim();
// 	// }
// }