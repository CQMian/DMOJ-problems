import java.util.*;
import java.io.*;
public class YOTC {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
    static Scanner in = new Scanner(System.in);
	public static void main(String[] args) throws IOException {
        int lines = in.nextInt();
        String[] year = new String[]{"Ox", "Tiger","Rabbit", "Dragon", "Snake","Horse","Goat","Monkey","Rooster","Dog","Pig","Rat"};
        TreeMap<String, Integer> DistanceFromB = new TreeMap<String,Integer>();
        DistanceFromB.put("Bessie", 0);
        for(int i = 0; i<lines;i++){
            String newCow = in.next();
            in.next();
            in.next();
            String time = in.next();
            int gap = 1;
            if(time.equals("previous"))
                gap = -1;
            String animal  = in.next();
            int newIndex = 0;
            for(int j = 0; j<year.length;j++){
                if(year[j].equals(animal))
                    newIndex = j;
            }
            in.next();
            in.next();
            int oldCow = DistanceFromB.get(in.next());
            int origPos = oldCow;
            while(origPos<0)
                origPos+=12;
            origPos = Math.abs(origPos%12);
            int yearDiff =0 ;
            if(newIndex>origPos){
                yearDiff = oldCow + newIndex-origPos;
                if(gap==-1)
                    yearDiff-=12;
            }
            else if(newIndex<origPos){
                yearDiff = oldCow + newIndex-origPos + 12;
                if(gap==-1)
                    yearDiff-=12;
            }
            else
                yearDiff += gap*12;
            System.out.println(yearDiff);
            DistanceFromB.put(newCow, yearDiff);
            
        }
        System.out.println(Math.abs(DistanceFromB.get("Elsie")));
	}
}