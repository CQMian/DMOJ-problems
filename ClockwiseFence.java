import java.util.*;
import java.io.*;
public class ClockwiseFence {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
        int num = readInt();
        for(int i = 0; i<num;i++){
            int cw = 0;
            int ccw = 0;
            String input = readLine();
            char dir = input.charAt(0);
            for(int j = 1; j<input.length();j++){
                if(input.charAt(j)!=dir){
                    int prev = calc(dir);
                    int cur = calc(input.charAt(j));
                    if((prev-cur + 4)%4==1)
                        cw++;
                    else
                        ccw++;
                }
                dir = input.charAt(j);
            }
            if(cw<ccw)
                System.out.println("CCW");
            else
                System.out.println("CW");
        }
	}
    public static int calc(char c){
        switch(c){
            case 'E':
                return 0;
            case 'N':
                return 1;
            case 'W':
                return 2;
            case 'S':
                return 3;
        }
        return -1;
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
// if(input.size()==1){
        //     if(input.get(0)==1){
        //         if(start == 'N')
        //             return "CW";
        //         else
        //             return "CWW";
        //     }
        //     else if(input.get(0)==2){
        //         if(start == 'W')
        //             return "CW";
        //         else
        //             return "CCW";
        //     }
        //     else if(input.get(0)==3){
        //         if(start == 'S')
        //             return "CW";
        //         else
        //             return "CCW";
        //     }
        //     else if(input.get(0)==4){
        //         if(start == 'E')
        //             return "CW";
        //         else
        //             return "CCW";
        //     }
        // }
        // else if(input.size()==2){
        //     if(input.get(0) == 1 && input.get(1)== 4)
        //         return "CCW";
        //     else{
        //         if(input.get(0)>input.get(1))
        //             return "CW";
        //         return "CCW";
        //     }
        // }
        // else if(input.size()==3){
        //     String temp = "";
        //     int quad = input.get(1);
        //     if(input.get(0) == 1 && input.get(1)== 4)
        //         temp = "CCW";
        //     else{
        //         if(input.get(0)>input.get(1))
        //             temp = "CW";
        //         temp = "CCW";
        //     }
        //     if(quad+1==input.get(2)||quad-3==input.get(2))
        //         return temp;
        //     else{
        //         if(temp.equals("CW"))
        //             return "CCW";
        //         else
        //             return "CW";
        //     }
        // }
        // else{

        // }
        // return "0";