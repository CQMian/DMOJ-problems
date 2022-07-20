import java.util.*;
import java.io.*;
public class Nightmareathon {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
        int eps = readInt();
        int queries = readInt();
		int[] arr = new int[eps+1];
        int[] leftArr = new int[eps+2];
		int[] leftOcc = new int[eps+2];
		for(int i = 1;i<eps+1;i++){
			arr[i] = readInt();
			if(arr[i]>leftArr[i-1]){
				leftArr[i] = arr[i];
				leftOcc[i] ++;
			}
			else if(arr[i]<leftArr[i-1]){
				leftArr[i] = leftArr[i-1];
				leftOcc[i] = leftOcc[i-1];
			}
			else{
				leftArr[i] = leftArr[i-1];
				leftOcc[i] = leftOcc[i-1]+1;
			}
		}

		int[] rightArr = new int[eps+2];
		int[] rightOcc = new int[eps+2];
		for(int i = eps;i>0;i--){
			if(arr[i]>rightArr[i+1]){
				rightArr[i] = arr[i];
				rightOcc[i] ++;
			}
			else if(arr[i]<rightArr[i+1]){
				rightArr[i] = rightArr[i+1];
				rightOcc[i] = rightOcc[i+1];
			}
			else{
				rightArr[i] = rightArr[i+1];
				rightOcc[i] = rightOcc[i+1]+1;
			}
		}

		for (int i = 1; i < queries+1; i++) {
            int x = readInt(), y = readInt();
            int leftMax = leftArr[x-1]; 
			int leftCount = leftOcc[x-1];
			int rightMax = rightArr[y+1];
			int rightCount = rightOcc[y+1];
            if(leftMax > rightMax)
				System.out.println(leftMax + " " + leftCount);
			else if(leftMax < rightMax)
				System.out.println(rightMax + " " + rightCount);
           	else
			   	System.out.println(leftMax + " " + (leftCount+rightCount));
        }
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
