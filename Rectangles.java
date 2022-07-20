import java.util.*;
import java.io.*;
public class Rectangles {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
        int points = readInt();
        int maxSize = 0;
        TreeMap<Integer,ArrayList<Integer>> xCoord = new TreeMap<Integer,ArrayList<Integer>>();
        TreeMap<Integer,ArrayList<Integer>> yCoord = new TreeMap<Integer,ArrayList<Integer>>();
        for(int i = 0; i<points;i++){
            int x = readInt();
            int y = readInt();
            if(xCoord.containsKey(x)){
                xCoord.get(x).add(y);
                Collections.sort(xCoord.get(x));
            }
            else{
                xCoord.put(x,new ArrayList<Integer>());
                xCoord.get(x).add(y);
            }
            if(yCoord.containsKey(y)){
                yCoord.get(y).add(x);
                Collections.sort(yCoord.get(y));
            }
            else{
                yCoord.put(y,new ArrayList<Integer>());
                yCoord.get(y).add(x);
            }
        }
        for(Map.Entry<Integer, ArrayList<Integer>> xEntry : xCoord.entrySet()){
        //     int counter = 1;
             int xKey = xEntry.getKey();
             if(xEntry.getValue().size()>1){
                for(int i = xEntry.getValue().size()-1; i>=0; i--){
                    int pointAy = xEntry.getValue().get(i);
                    if(yCoord.get(pointAy)!=null){
                        ArrayList<Integer> yList = yCoord.get(pointAy);
                        for(int j = yList.size()-1; j>=0;j--){
                            int pointBx = yList.get(j);
                            if(xCoord.get(pointBx)!=null){
                                ArrayList<Integer> xList = xCoord.get(pointBx);
                                for(int k = 0; k<xList.size();k++){
                                    int pointCy = xList.get(k);
                                    if(yCoord.get(pointCy)!=null){
                                        ArrayList<Integer> yList1 = yCoord.get(pointCy);
                                        for(int h = 0; h<yList1.size();h++){
                                            int pointDx = yList1.get(h);
                                            if(pointDx == xKey){
                                                int temp = (pointAy-pointCy)*(pointBx-pointDx);
                                                maxSize= Math.max(temp, maxSize);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
             }
        }

        System.out.println(maxSize);
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