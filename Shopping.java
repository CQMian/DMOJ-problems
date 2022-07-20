import java.util.*;
import java.io.*;
public class Shopping{

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args)throws IOException{

        
        int cases = in.nextInt();
        
        for(int i = 0;i<cases;i++){ 
            int price = 0;
            int storeNum = in.nextInt();
            ArrayList<Store> stores = new ArrayList<Store>();
            for(int j = 0;j<storeNum;j++){  
                int itemNum = in.nextInt();
                stores.add(new Store());
                for(int k = 0;k<itemNum;k++){
                    stores.get(j).addItem(new Item(in.next(),in.nextInt(),in.nextInt()));
                }
            }
            int purchase  = in.nextInt();

            for(int j = 0;j<purchase;j++){
                String wantedItem = in.next();
                int wantedQuantity = in.nextInt();
                Store itemList = new Store();
                for(int k = 0; k<stores.size();k++){
                    for(int h = 0;h<stores.get(k).getItems().size();h++){
                        if(stores.get(k).getItems().get(h).getItemName().equals(wantedItem)){
                            itemList.addItem(new Item(stores.get(k).getItems().get(h).getItemName()
                            ,stores.get(k).getItems().get(h).getItemPrice(),stores.get(k).getItems().get(h).getItemQuantity()));
                        }
                    }
                }  
                while(wantedQuantity!=0){
                    int least = Integer.MAX_VALUE;
                    int index = 0;
                    for(int k = 0;k<itemList.getItems().size();k++){
                        if(itemList.getItems().get(k).getItemPrice()<least&&itemList.getItems().get(k).getItemQuantity()>0){
                            least = itemList.getItems().get(k).getItemPrice();
                            index = k;
                        }
                    }
                    if(itemList.getItems().get(index).getItemQuantity()<=wantedQuantity&&itemList.getItems().get(index).getItemQuantity()!=0){
                        wantedQuantity-=itemList.getItems().get(index).getItemQuantity();
                        price+=itemList.getItems().get(index).getItemQuantity()*itemList.getItems().get(index).getItemPrice();
                        itemList.getItems().get(index).setItemQuantity(0);
                    }
                    else{
                        price+=wantedQuantity*itemList.getItems().get(index).getItemPrice();
                        wantedQuantity = 0;
                    }
                }
                
            }
            System.out.println(price);
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

    public static class Store{
        private ArrayList<Item> items =new ArrayList<Item>();
        public Store(){

        }
        public void addItem(Item input){
            items.add(input);
        }
        public ArrayList<Item> getItems(){
            return items;
        }
    }
    public static class Item {
        private String itemName;
        private int itemPrice, itemQuantity;
        public Item(String itemname, int itemprice, int itemquantity){
            itemName=itemname;
            itemPrice=itemprice;
            itemQuantity=itemquantity;
        }
        public String getItemName(){
            return itemName;
        }
        public void setItemName(String itemname){
            itemName = itemname;
        }
        public int getItemPrice(){
            return itemPrice;
        }
        public void setItemPrice(int itemprice){
            itemPrice = itemprice;
        }
        public int getItemQuantity(){
            return itemQuantity;
        }
        public void setItemQuantity(int itemquantity){
            itemQuantity = itemquantity;
        }
    }

     
}