import java.util.*;
import java.io.*;
import java.math.BigDecimal;
public class Villages{
 
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args)throws IOException{
        //Scanner in = new Scanner(System.in);
        int nums = Integer.parseInt(br.readLine());
        Double[] input = new Double[nums];
        for(int i = 0; i<nums;i++)
            input[i] = Double.parseDouble(br.readLine());
        Arrays.sort(input);
        double min = (input[1]+input[2])/2-(input[1]+input[0])/2;
        for(int i = 2; i<input.length-1;i++){
            if((input[i]+input[i+1])/2-(input[i]+input[i-1])/2<min)
                min = (input[i]+input[i+1])/2-(input[i]+input[i-1])/2;
        }
         
 
    String ans = BigDecimal.valueOf(min).toPlainString();
    if(ans.indexOf(".")==-1)
        ans+=".0";
    System.out.println(ans);
      
    }
}
