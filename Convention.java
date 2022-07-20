import java.util.*;
import java.io.*;
public class Convention {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
    static ArrayList<Integer> arr = new ArrayList<>();
    static int cows, buses, capacity;
    
    
    public static void main(String[] args) throws IOException{
        cows = readInt();
        buses = readInt();
        capacity = readInt();
        for(int i = 0;i<cows;i++){
            arr.add(readInt());
        }
        Collections.sort(arr);
        System.out.println(binSearch(0,1000000000);

    }
    static boolean pos(int wait)
    {
        int wagons = 1;
        int firstArrival = arr.get(0);
        int firstIndex = 0;
        for(int i=1;i<cows;i++)
        {
            if(arr.get(i) - firstArrival > wait || i + 1 - firstIndex > capacity)
            {
                wagons += 1;
                firstArrival = arr.get(i);
                firstIndex = i;
            }
        }
        return (wagons <= buses);
    }
     
    static int binSearch(int low,int high)
    {
        if(low == high) return low;
        if(low + 1 == high)
        {
            if(pos(low)) return low;
            return high;
        }
        int mid = (low+high)/2;
        if(pos(mid)) return binSearch(low,mid);
        else return binSearch(mid+1,high);
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