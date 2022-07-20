import java.util.*;
import java.io.*;
public class AlexAndAnimalRights {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;static char[][] grid;
	static int [] moveX = {-1, 1, 0 , 0}, moveY = {0, 0, -1, 1};
	static int rows, cols;
	public static void main(String[] args) throws IOException{
		rows = readInt();
        cols = readInt();
        grid = new char[rows][cols];
		for(int i = 0; i < rows; i++)
			grid[i] = readLine().toCharArray();
		int output = 0;
		for(int i = 0; i < rows; i++){ 
			for(int j = 0; j < cols; j++){
				if(dfs(i,j) && grid[i][j] == 'X')
					output++;
			}
		}
		System.out.println(output);
	}
	static boolean dfs(int i, int j){
		boolean temp = false;
		if(grid[i][j] == 'M') 
			temp = true;
		grid[i][j]  = 'X';
		for(int x = 0; x < 4; x++){
			int movex = moveX[x] + i, movey = moveY[x] + j;
			if(movex < 0 || movey < 0 || movex >= rows || movey >= cols || grid[movex][movey] == 'X' || grid[movex][movey] == '#') 
				continue;
			if(dfs(movex, movey)) 
				temp = !dfs(movex, movey);
		}
		return temp;
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