import java.util.*;
import java.io.*;
public class ChristmasGifts {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int numFriends = readInt();
        int money = readInt();
        Cost[] arr = new Cost[numFriends];
        int[] cost = new int[numFriends];
        for (int i = 0; i < numFriends; i++) {
            arr[i] = new Cost(readInt(), readInt());
            cost[i] = arr[i].price;
        }
        Arrays.sort(arr, new PricesComparator());

        int counter = 0;
        int count = 0;
        for(int i = 0; i<numFriends; i++){
            int totalPrice = arr[i].price + arr[i].ship;
            if(counter+totalPrice<=money){
                counter += totalPrice;
                count++;
            } else {
                totalPrice -= arr[i].price/2;
                if(counter + totalPrice <= money){
                    count++;
                    counter += totalPrice;
                } else {
                    break;
                }
            }
        }
        System.out.println(count);
    }
    static class Cost {
        int price;
        int ship;

        public Cost(int price, int ship) {
            this.price = price;
            this.ship = ship;
        }
    }
    static class PricesComparator implements Comparator<Cost> {
        public int compare (Cost a, Cost b){
            return Integer.compare(a.price + a.ship, b.price + b.ship);
        }
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