import java.util.*;
import java.io.*;
public class Rankings{
 
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args)throws IOException{
        int nums = readInt();
        int pp = readInt();
        int[] hours = new int[nums];
        String[] names = new String[nums];
        for(int i = 0; i<nums;i++){
            names[i] = readString();
        }
        for(int i = 0;i<pp;i++){
            for(int ii = 0; ii<nums;ii++){
                hours[ii]+=readInt();
            }
        }
        quickSort(hours,names,0,nums-1);
        
        for(int i = 3; i<nums+3;i++){
            System.out.println(i+". "+names[nums+2-i]);
        }
    }
	static String next() throws IOException {
		while (st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine().trim());
		return st.nextToken();
	}
 
	static int readInt() throws IOException {
		return Integer.parseInt(next());
	}
    static String readString() throws IOException {
        return next();
    }
    public static int partition(int[] arr1, String[] arr2, int low, int high) { 
        int pi = arr1[high];  
        int i = (low-1); 
        for (int j=low; j<high; j++) { 
            if (arr1[j] <= pi) { 
                i++; 
                int temp = arr1[i]; 
                String temp1 = arr2[i];
                arr1[i] = arr1[j]; 
                arr2[i] = arr2[j];
                arr1[j] = temp; 
                arr2[j] = temp1;
            } 
        } 
   
        int temp = arr1[i+1]; 
        String temp1 = arr2[i+1];
        arr1[i+1] = arr1[high]; 
        arr2[i+1] = arr2[high];
        arr1[high] = temp; 
        arr2[high] = temp1;
   
        return i+1; 
    } 
   
    public static void quickSort(int[] arr1, String[] arr2, int low, int high) { 
        if (low < high) { 
            int pi = partition(arr1,arr2, low, high); 
            quickSort(arr1,arr2, low, pi-1); 
            quickSort(arr1,arr2, pi+1, high); 
        } 
    }

     
}