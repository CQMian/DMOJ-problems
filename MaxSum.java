import java.util.*;
import java.io.*;
public class MaxSum{
 
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args)throws IOException{
        int nums = in.nextInt();
        int negative = 0;
        int smallest = Integer.MAX_VALUE;
        long sum = 0;
        boolean fullyFlipped = false;
        for(int i = 0; i<nums;i++){
            int temp = in.nextInt();
            if(temp<0)
                negative++;
            if(Math.abs(temp)<smallest)
                smallest = Math.abs(temp);
            sum+=Math.abs(temp);
        }
        if(negative%2==0)
            fullyFlipped = true;
        if(!fullyFlipped)
            sum-=smallest;
        System.out.println(sum);
        
    }
     
}
