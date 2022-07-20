import java.util.*;
import java.io.*;
public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String args[]) throws IOException 
    {
        int n = readInt();
        int max = 1;
        int leftIndex = 0;
        int rightIndex = n-1;
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = readInt();
        }
        while(leftIndex<rightIndex){
            if(arr[leftIndex]==max&&arr[rightIndex]==max){
                max++;
            }
            if(arr[leftIndex]!=max){
                leftIndex++;
            }
            if(arr[rightIndex]!=max){
                rightIndex--;
            }    
        }
        int ans = max-1;
        if(ans>=1){
            System.out.println(ans);
        }
        else{
            System.out.println("0");
        }
    }

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine().trim());
        }
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