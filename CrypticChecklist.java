import java.util.*;
import java.io.*;
public class CrypticChecklist {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
        int items = readInt();
        int assignments = readInt();
        int completable = 0;
        ArrayList<String> itemList = new ArrayList<String>();
        for(int i = 0; i<items;i++)
            itemList.add(readLine());
        for(int i = 0;i<assignments;i++){
            int assignmentItemNum = readInt();
            ArrayList<String> assignmentItems = new ArrayList<String>();
            for(int j = 0; j<assignmentItemNum;j++)
                assignmentItems.add(readLine());
            boolean hasItem = true;
            for(int j = 0; j<assignmentItems.size();j++){
                if(itemList.indexOf(assignmentItems.get(j))==-1){
                    hasItem = false;
                    j = assignmentItems.size();
                }
            }
            if(hasItem)
                completable++;
        
        }
        System.out.println(completable);
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