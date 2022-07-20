import java.util.*;
import java.io.*;
public class Chemistry {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
        int questionType = readInt();
        LinkedHashMap <String, ArrayList<Integer>> preference = new LinkedHashMap<String, ArrayList<Integer>>();
        for(int i = 0;i<questionType;i++){
            String temp = readLine();
            preference.put(temp, new ArrayList<Integer>());           
        }
        
        int questions = readInt();
        ArrayList<String> outputOrder = new ArrayList<String>();
        for(int i = 0;i<questions;i++){
            String temp = readLine();
            outputOrder.add(temp);
            preference.get(temp).add(i+1);
        }
        int counter = 1;
        for(Map.Entry<String,ArrayList<Integer>> entry : preference.entrySet()){            
            for(int i = 0; i<entry.getValue().size();i++){
                System.out.println(entry.getValue().set(i,counter));
                counter++;
            }
        }
        
        // for(int i = 0; i<outputOrder.size();i++){
        //     System.out.println(preference.get(outputOrder.get(i)).remove(0));
        // }
        // ArrayList<String> questionList = new ArrayList<String>();
        // for(int i = 0;i<questions;i++)
        //     questionList.add(readLine());
        // int counter = 0;
        // int count = 0;
        // while(counter<questionType){
        //     int temp = questionList.indexOf(preferenceList[counter];
        //     if(temp == -1)
        //         counter++;
        //     else{
        //         questionList.set(temp,null);
        //         output[count] = temp;
        //         count++;
        //     }
        // }
        // for(int i:output)
        //     System.out.println(i+1);
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