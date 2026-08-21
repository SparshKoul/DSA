//tiling problem
// public class adv {
//     public static int tiling(int n){  //2*n floor
//         if(n==0 || n==1){
//             return 1;
//         }
//         //vertical
//         int fnm1 = tiling(n-1);
//         //horizontal
//         int fnm2 = tiling(n-2);

//         int totalways = fnm1 + fnm2;
//         return totalways;
//     }
    
//     public static void main(String[] args) {
//         int n = 4;
//         System.out.println(tiling(n));  
        
        
//     }
    
// }











// //removing dublicaates from string
// import java.util.*;
// public class adv {
//     public static void removedublicates(String str, int idx, StringBuilder newstr, boolean map[]){
//         if(idx == str.length()){
//             System.out.println(newstr);
//             return;
//         }
//         char currchar = str.charAt(idx);
//         if(map[currchar - 'a'] == true){
//             //dublicate if true
//             removedublicates(str, idx+1, newstr, map);
//         }else{
//             map[currchar - 'a'] = true;//makew it true if not dublicate (false)
//             removedublicates(str, idx+1, newstr.append(currchar), map);
//         }
//     }
//     public static void main(String[] args) {
//         String str = "appnacollege";
//         boolean map[] = new boolean[26];
//         removedublicates(str, 0, new StringBuilder(""), map);
//     }
// }
    






//friend pairing problem
//given n friends, each one can remain single or can be paired up with some other friend. Each friend can be paired only once. Find the total number of ways in which friends can remain single or can be paired up.

// public class adv {
//     public static int friendspairing(int n){
//         if(n==1 || n==2){
//             return n;
//         }
//         //single
//         int fnm1 = friendspairing(n-1);
//         //pair
//         int fnm2 = friendspairing(n-2);
//         int pairways = (n-1) * fnm2;

//         int totalways = fnm1 + pairways;
//         return totalways;
//     }
//     public static void main(String[] args) {
//         int n = 4;
//         System.out.println(friendspairing(n));
//     }
// }



