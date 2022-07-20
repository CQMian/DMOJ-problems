import java.util.*;
import java.io.*;
public class Personnel{
 
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args)throws IOException{
        int nums = in.nextInt();
        int[] skill = new int[nums];
        String[] names = new String[nums];
        for(int i = 0; i<nums;i++){
            names[i] = in.next();
            skill[i] = in.nextInt();
        }
        String[] output = new String[in.nextInt()];

        for(int i = 0;i<output.length;i++){
            int newEmployee = in.nextInt();
            int adpt = in.nextInt();
            String vet = "No suitable teacher!";
            int vetValue = Integer.MAX_VALUE;
            for(int ii = 0;ii<names.length;ii++){
                int temp = skill[ii];
                if((temp>=newEmployee)&&(temp<=newEmployee+adpt)&&(temp<vetValue)){
                    vetValue = temp;
                    vet = names[ii];
                }
                output[i] = vet;
            }
        }
        for(String s: output)
            System.out.println(s);
    }
	static String nextt() throws IOException {
		while (st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine().trim());
		return st.nextToken();
	}
 
	static int readInt() throws IOException {
		return Integer.parseInt(nextt());
	}


     
}
 // int nums = in.nextInt();
        // TreeMap<Integer,String> employees = new TreeMap<Integer,String>();
        // for(int i = 0;i<nums;i++){
        //     String name = in.next();
        //     int skill = in.nextInt();
        //     System.out.println(name);
        //     System.out.println(skill);
        //     if(!employees.containsKey(skill))
        //         employees.put(skill,name);
        // }
        // String [] output = new String[in.nextInt()];

        // for(int i = 0;i<output.length;i++){
        //     int newEmployee = in.nextInt();
        //     int adpt = in.nextInt();
        //     String vet = "No suitable teacher!";
        //     int vetValue = Integer.MAX_VALUE;
        //     for(Map.Entry<Integer,String> entry : employees.entrySet()){
        //         int temp = entry.getKey();
        //         if((temp>=newEmployee)&&(temp<=newEmployee+adpt)&&(temp<vetValue)){
        //             vetValue = temp;
        //             vet = entry.getValue();
        //         }
                
        //     }
        //     output[i] = vet;
        // }