import java.util.*;
import java.io.*;
public class Spreadsheet {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
        int rows = readInt();
        int cols = readInt();
        int[][] array = new int[rows][cols];
        for(int i = 0; i<rows;i++){
            for(int j = 0;j<cols;j++)
                array[i][j] = readInt();
        }
        int sorts = readInt();
        for(int i = 0; i<sorts;i++){
            int col = readInt();
            sort(array,col-1);
        }
        for(int i = 0;i<rows;i++){
            for(int j = 0;j<cols;j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
	}
    public static void sort(int arr[][],int col)
    {
        int n = arr.length;
        int cols = arr[0].length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j][col] > arr[j+1][col])
                {
                    int[] tmep = new int[cols];
                    for(int k = 0; k<cols;k++)
                        tmep[k] = arr[j][k];
                    
                    for(int k = 0; k<cols;k++)
                        arr[j][k] = arr[j+1][k];
                    for(int k = 0; k<cols;k++)
                        arr[j+1][k] = tmep[k];
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