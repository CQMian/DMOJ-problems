// import java.util.*;
// import java.io.*;
// public class LivestockLineup {
//     static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//     static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
//     static StringTokenizer st;
//     static Scanner sc = new Scanner(System.in);
//     static ArrayList<String> stored = new ArrayList();
//     static String[] arr = new String[]{"Bessie", "Buttercup", "Belinda", "Beatrice", "Bella", "Blue", "Betsy", "Sue"};
//     public static void main(String[] args) throws IOException {
//         int num = sc.nextInt();
//         Arrays.sort(arr);
//         for(int i = 0;i<num;i++){
//             String cow1 = sc.next();
//             sc.next();
//             sc.next();
//             sc.next();
//             sc.next();
//             String cow2 = sc.next();
//             stored.add(cow1);
//             stored.add(cow2);
//         }
//         ArrayList<String> output = new ArrayList();
//         for(int i = 0; i<8;i++){
//             ArrayList<String> temp = new ArrayList();
//             temp.add(arr[i]);
//             for(int j = 0; j<8;j++){
//                 if(j!=i)
//                     temp.add(arr[j]);
//                 for(int k = 0; k<8;k++){
//                     if(k!=i&&k!=j)
//                         temp.add(arr[k]);
//                     for(int l = 0; l<8;l++){
//                         if(l!=i&&l!=j&&l!=k)
//                             temp.add(arr[l]);
//                         for(int m = 0; m<8;m++){
//                             if(m!=i&&m!=j&&m!=k&&m!=l)
//                                 temp.add(arr[m]);
//                             for(int n = 0; n<8;n++){
//                                 if(n!=i&&n!=j&&n!=k&&n!=l&&n!=m)
//                                 temp.add(arr[n]);
//                                 for(int b = 0; b<8;b++){
//                                     if(b!=i&&b!=j&&b!=k&&b!=l&&b!=m&&b!=n)
//                                     temp.add(arr[b]);
//                                     for(int v = 0; v<8;v++){
//                                         if(v!=i&&v!=j&&v!=k&&v!=l&&v!=m&&v!=b&&v!=b)
//                                         temp.add(arr[v]);
//                                     }
//                                 }
//                             }
//                         }
//                     }
//                 }
//             }
//             calc(temp);
//             System.out.println(temp);
//         }
//     }
//     public static void calc(ArrayList<String> array){
//         for(int i = 0; i<stored.size();i+=2){
//             if(Math.abs(array.indexOf(stored.get(i))-array.indexOf(stored.get(i+1)))!=1)
//                 return;
//         }
//         for(String s:array){
//             System.out.println(s);
//         }
//     }
// }