import java.util.*;
import java.io.*;
public class QueenCannotAttack {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
        int boardsize = readInt();
        int queens = readInt();
        Boolean[][] arr = new Boolean[boardsize+2][boardsize+2];
        for(int i = 0; i<queens;i++){
            int xPos = readInt(),yPos = readInt();
            for(int j = xPos;j>0;j--)
                arr[j][yPos] = true;
            for(int j = xPos;j<=boardsize;j++)
                arr[j][yPos] = true;
            for(int j = yPos;j>0;j--)
                arr[xPos][j] = true;
            for(int j = yPos;j<=boardsize;j++)
                arr[xPos][j] = true;
            int tempX = xPos, tempY = yPos;
            while(tempX>0&&tempY>0){
                tempX--;
                tempY--;
                arr[tempX][tempY]=true;
            }
            tempX = xPos;
            tempY = yPos;
            while(tempX>0&&tempY<=boardsize){
                tempX--;
                tempY++;
                arr[tempX][tempY]=true;
            }
            tempX = xPos;
            tempY = yPos;
            while(tempX<=boardsize&&tempY<=boardsize){
                tempX++;
                tempY++;
                arr[tempX][tempY]=true;
            }
            tempX = xPos;
            tempY = yPos;
            while(tempX<=boardsize&&tempY>0){
                tempX++;
                tempY--;
                arr[tempX][tempY]=true;
            }
        }
        int counter = 0;
        for(int i = 1;i<=boardsize;i++){
            for(int j = 1; j<=boardsize;j++){
                if(arr[i][j] == null)
                    counter++;
            }
        }
        System.out.println(counter);
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