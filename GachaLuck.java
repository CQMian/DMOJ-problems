import java.util.*;
import java.io.*;
public class GachaLuck {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int n = readInt();
        int k = readInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i<n;i++){
            if(br.read()==49)
                arr.add(i);
            
        }
        int[] smallArr = new int[arr.size()+1];
        if(k>=arr.size()+1)
            System.out.println(n-arr.size());
        else{

            for(int i = 1; i<arr.size();i++){
                smallArr[i] = arr.get(i)-arr.get(i-1)-1;
            }
            smallArr[0] = arr.get(0);
            smallArr[arr.size()] = n-arr.get(arr.size()-1)-1;
            Arrays.sort(smallArr);
            int ans = 0;
            for(int i = 0; i<k; i++){
                ans+= smallArr[arr.size()-i];
            }
            System.out.println(ans);
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