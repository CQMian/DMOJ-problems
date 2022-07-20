import java.util.*;
import java.io.*;
public class GBTTD {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
        int nums = readInt();
        ArrayList <String> arr = new ArrayList<String>();
        for(int i = 0; i<nums;i++)
            arr.add(readLine());
        sort(arr);
        for(String i:arr){
            System.out.print(i);
        }
        
        // for(int i = 0; i < nums-1; ++i) {
        //     for (int j = i + 1; j < nums; ++j) {
        //        if (arr.get(i).compareTo(arr.get(j)) > 0) {
        //           String temp = arr.get(i);
        //           arr.set(i,arr.get(j));
        //           arr.set(j,temp);
        //        }
        //     }
        //  }
        //  for(int i = arr.size()-1;i>=0;i--){
        //      System.out.print(arr.get(i));
        //  }
        
        // TreeMap<String,ArrayList<Integer>> arr = new TreeMap<String,ArrayList<Integer>>();
        // int nums = readInt();
        // ArrayList<Integer> output = new ArrayList<Integer>();
        // for(int i = 0; i<nums;i++){
        //     int temp = readInt();
        //     String temp1 = String.valueOf(temp).substring(0,1);
        //     if(arr.containsKey(temp1)){
        //         arr.get(temp1).add(temp);
        //         Collections.sort(arr.get(temp1));
        //     }
        //     else{
        //         arr.put(temp1,new ArrayList<Integer>());
        //         arr.get(temp1).add(temp);
        //     }
        // }
        // for(Map.Entry<String,ArrayList<Integer>> entry : arr.entrySet()){
        //     for(int i = 0; i<entry.getValue().size();i++)
        //         output.add(entry.getValue().get(i));
        // }
       
        // for(int i = output.size()-1;i>=0;i--)
        //     System.out.print(output.get(i));
	}
    public static void sort(ArrayList<String> arr){
        Collections.sort(arr, new Comparator<String>(){
            @Override
            public int compare(String a, String b){
                String temp1 = a+b;
                String temp2 = b+a;
                return temp1.compareTo(temp2)>0 ? -1:1;
            }
        });
        
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