import java.util.*;
import java.io.*;
public class PrimeTime {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
    static Scanner sc = new Scanner(System.in);
    static int temp = 2;
    public static void main(String[] args) throws IOException
    {
        for(int i = 0; i <5;i++){
            int input = sc.nextInt();
            System.out.println(calc(input));
        }
    }
    static String calc(int x){
        String output = "";
        boolean start = true;
        for(int i = 2;i<=x;i++){
            if(prime(i)){
                if(!start)
                    output += " * ";

                output+=i + "^" + countFactors(x, i);
            }
            temp =2;
            if(start){
                start=false;
            }
        }
        return output;
    }
	static int countFactors(int n, int p) {
		int result = 0;
		for (; n >= p; n /= p)
			result += n / p;
		return result;
	}
    public static boolean prime(int n)
{    
    if (n == 0 || n == 1)
    {
        return false;
    }
   
    if (n == temp)
        return true;
         
    if (n % temp == 0)
    {
        return false;
    }
    temp++;
    return prime(n);
}
 
}