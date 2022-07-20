import java.util.*;
import java.io.*;
public class Phonebook{
 
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args)throws IOException{
        int nums = in.nextInt();
        long[] phoneNum = new long[nums];
        String[] names = new String[nums];
        for(int i = 0; i<nums;i++){
            names[i] = in.next();
            phoneNum[i] = in.nextLong();
        }
        int[] output = new int[nums];
        int phonecalls = in.nextInt();
        for(int i = 0;i<phonecalls;i++){
            long temp = in.nextLong();
            for(int j = 0; j<nums;j++){
                if(temp==phoneNum[j]){
                    output[j] +=1;
                    j=nums;
                }
            }
            
        }
        int largest = 0;
        int largestIndex = 0;
        for(int i = 0; i<nums;i++){
            if(output[i]>largest){
                largest = output[i];
                largestIndex = i;
            }
            else if(output[i]==largest){
                if(phoneNum[i]<phoneNum[largestIndex]){
                    largestIndex = i;
                }
            }
        }
        System.out.println(names[largestIndex]);
        
    }
	// static String next() throws IOException {
	// 	while (st == null || !st.hasMoreTokens())
	// 		st = new StringTokenizer(br.readLine().trim());
	// 	return st.nextToken();
	// }
 
	// static int readInt() throws IOException {
	// 	return Integer.parseInt(next());
	// }
    // static long readLong() throws IOException {
    //     return Long.parseLong(next());
    // }


     
}