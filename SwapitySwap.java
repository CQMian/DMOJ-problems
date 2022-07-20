import java.util.*;
import java.io.*;
public class SwapitySwap {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
        int[] arr = new int[readInt()];
        int[] orig = new int[arr.length];
        for(int i = 0; i<arr.length;i++){
            arr[i] = i+1;
            orig[i] = i+1;
        }
        int cycles = readInt();
        int start1 = readInt()-1, stop1 = readInt()-1, start2 = readInt()-1, stop2 = readInt()-1;
        int cycleLength = 0;
        Boolean Continue = true;
        while(Continue){
            swap(arr,start1,stop1);
            swap(arr,start2,stop2);
            for(int i = 0; i<arr.length;i++){
                
                if(arr[i]!=orig[i]){
                    Continue = false;
                    cycleLength++;
                    break;
                } 
            }
            if(Continue){
                cycleLength++;
                Continue = false;
            }
            else
                Continue = true;
        }
        for(int i =0; i<cycles%cycleLength;i++){
            swap(arr,start1,stop1);
            swap(arr,start2,stop2);
        }
        for(int i:arr)
            System.out.println(i);


	}
    public static void swap(int[] arr, int start, int stop){
        int temp = 0;
        for (int i = start; i <= start + (stop-start) / 2; i++) {
            temp = arr[i];
            arr[i] = arr[stop - i + start];
            arr[stop - i +start] = temp;
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