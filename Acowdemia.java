import java.util.*;
import java.io.*;
public class Acowdemia {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
        int papers = readInt();
        int limit = readInt();
        int hIndex = 0;
        int index = 0;
        int[] paperList = new int[papers];
        for(int i = 0; i<papers; i++)
            paperList[i] = readInt();
        Arrays.sort(paperList);
        for(int i = papers-1;i>=0;i--){
            if(papers-i>=paperList[i]){
                hIndex = paperList[i];
                index = i;
                i = -1; 
            }
        }
        boolean correctIndex = false;
        while(!correctIndex){
            if(index+1<papers&&hIndex+1<=paperList[index+1]&&hIndex<papers-1-index){
                hIndex++;
            }
            else
                correctIndex = true;
        }
        int duplicates = 0;
        boolean identical = true;
        while(identical){
            if(index+1<papers&&paperList[index+1]==paperList[index])
                index++;
            else
                identical = false;
        }
        int larger = papers-index-1;
        while(index>=0){
            if(paperList[index]==hIndex){
                duplicates++;
                index--;
            }
            else
                index = -1;
        }
        int usuable = duplicates;
        if(usuable>limit)
            usuable = limit;
        if(limit!=0&&usuable+larger>=hIndex+1)
            hIndex++;       
        
        System.out.println(hIndex);
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