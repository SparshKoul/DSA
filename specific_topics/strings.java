//we cant take two int inout and one string input in between using scanner as it takes enter as input
// public class strings {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         sc.nextLine(); //consume the newline character
//         String str = sc.nextLine();
        
//     }
// }

//need to do like this.











// import java.util.Scanner;

// public class strings {
//     public static void main(String[] args) {
        
//         char arr[] ={'a','b','c'}; //arrat of characters
//         String str = new String(arr); //converting char array to string

//         //declaring string ways
//         String strr ="abcd:";
//         String str2 = new String("abcd");






//         // Scanner sc = new Scanner(System.in);
//         // String name = sc.next(); //input string only takes word before space
//         // System.out.println("output "+name);

//         // String fullLine = sc.nextLine(); //input string takes whole line including space
//         // System.out.println("output full line :"+fullLine);


//         // System.out.println(fullLine.length()); //length of string
//         // System.out.println(fullLine.toLowerCase()); //lowercase
//         // System.out.println(fullLine.toUpperCase()); //uppercase
//         // System.out.println(fullLine.trim()); //removes spaces before and after string








//         //concatenation

//         String first = "abc";
//         String second = "xyz";
//         String third = first + second; //1st way
//         System.out.println(third);

//         String fourth = first.concat(second); //2nd way
//         System.out.println(fourth);





//         //charAt()      charcacter at index

//         String namee = "abcdefgh";
//         char ch = namee.charAt(3);
//         System.out.println(ch);



//         //printing using loops
//         for(int i=0;i<namee.length();i++){
//             System.out.print(namee.charAt(i)+" ");
//         }



//     }
    
// }












//string is palindrome or not

//APPROACH -  COMPARE CAHR AT START WITH END  , THEN SECOND WITH SENCD KAST , SO ONNNN

// public class strings {

//     public static void main(String[] args) {
//         String name = "abcba";
//         boolean isPalindrome = true;

//         for(int i=0;i<name.length()/2;i++){  
//             if(name.charAt(i) != name.charAt(name.length()-i-1)){
//                 isPalindrome = false;
//                 break;
//             }
//         }


//         if(isPalindrome){
//             System.out.println("palindrome");
//         }else{
//             System.out.println("not a palindrome");
//         }
        
//     }
// }




// public class strings {
//     public static boolean isPalindrome(int x) {
//         if (x < 0) return false;      // negative numbers are not palindromes
//         int original = x;
//         int reversed = 0;

//         while (x > 0) {
//             int digit = x % 10;          // take last digit
//             reversed = reversed * 10 + digit;  // build reversed number
//             x /= 10;                     // remove last digit
//         }

//         return original == reversed;
//     }

//     public static void main(String[] args) {
//         int num = 121;
//         if (isPalindrome(num)) {
//             System.out.println(num + " is a Palindrome number.");
//         } else {
//             System.out.println(num + " is NOT a Palindrome number.");
//         }
//     }
// }






//SHORTEST ROUTE
// public class strings {
//     public static float shortestpath(String path){
//         int x=0;
//         int y=0;

//         for(int i=0;i<path.length();i++){
//             char dir =path.charAt(i);
//             //south
//             if(dir=='S'){
//                 y--;
//             }
//             //north
//             else if(dir=='N'){
//                 y++;
//             }
//             //west
//             else if(dir=='W'){
//                 x--;
//             }//east
//             else{
//                 x++;
//             }
//         }
//         int x2 =x*x;
//         int y2=y*y;


//         return (float)Math.sqrt(x2+y2);
//     }

//     public static void main(String[] args) {
//         String path ="WNEENESENNN";
//         System.out.println(shortestpath(path));
        
//     }
// }




//STRING FXM COMPARE
// class strings {
//     public static void main(String[] args) {
//         String name1 = "abcd";
//         String name2 = "abcd";
//         String name3 = new String("abcd");
//         if(name1==name2){ //compares memory location
//             System.out.println("same");
//         }else{
//             System.out.println("not same");
//         }

//         if(name1==name3){ //compares memory location
//             System.out.println("same");
//         }else{
//             System.out.println("not same");
//         }


//         //this will print same - not same, though value is same for all 3
//         //because name1 and name2 are in string pool and name3 is in heap memory


//         //so if we want to check value we use equals method/
//         if(name1.equals(name3)){
//             System.out.println("same");
//         }else{
//             System.out.println("not same");
//         }
//             ////this will print same 
//             /// 
            
            
            
            
        
        
        
//         //subbstring
//         String nameee = "abcdefgh";
//         System.out.println(nameee.substring(2)); //from index 2 to end
//         System.out.println(nameee.substring(2,5)); //from index 2 to 4 (5-1)
//         //last index is exclusive




//         //throught loop

//         int si =2;
//         int ei =5;

//         String substr="";
//         for(int i=si;i<ei;i++){
//             substr+=nameee.charAt(i);
//         }
//         System.out.println(substr);





        

        
//     }
    
// }



//



















//print the largest string for a given set of strings by length
// import java.util.Scanner;

// public class strings {

//     public static String largestString(String arr[], int n) {
//         String largest = arr[0];
//         for (int i = 1; i < n; i++) {
//             if (arr[i].length() > largest.length()) { // if arr[i] is larger
//                 largest = arr[i];
//             }
//         }
//         return largest;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter number of strings: ");
//         int n = sc.nextInt();

//         sc.nextLine(); // consume the leftover newline

//         String arr[] = new String[n];

//         System.out.println("Enter " + n + " strings:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextLine();
//         }

//         System.out.println("Largest string is: " + largestString(arr, n));
//     }
// }









// //or 

//same logic same code, just change is struct of input that sometimes gives error
// import java.util.Scanner;

// public class strings {

//     public static String largestString(String arr[], int n) {
//         String largest = arr[0];
//         for (int i = 1; i < n; i++) {
//             if (arr[i].length() > largest.length()) { // if arr[i] is larger
//                 largest = arr[i];
//             }
//         }
//         return largest;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter number of strings: ");
//         int n = sc.nextInt();

//         String arr[] = new String[n];

//         System.out.println("Enter " + n + " strings:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.next();
//         }

//         System.out.println("Largest string is: " + largestString(arr, n));
//     }
// }





//print the largest string  but by ith letter
//apple<ban    as a<b
//str.comareTo(str2) - if str1<str2  -ve value , if str1>str2 +ve value , if equal then  0,
// import java.util.Scanner;

// public class strings {

//     public static String largestString(String arr[], int n) {
//         String largest = arr[0];
//         for (int i = 1; i < n; i++) {
//             if (largest.compareTo(arr[i]) < 0) { // if arr[i] is larger
//                 largest = arr[i];
//             }
//         }
//         return largest;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter number of strings: ");
//         int n = sc.nextInt();

//         String arr[] = new String[n];

//         System.out.println("Enter " + n + " strings:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.next();
//         }

//         System.out.println("Largest string is: " + largestString(arr, n));
//     }
// }







//what are immutable strings

// public class strings {

//     public static void main(String[] args) {
//         String name = "abcd";
//         name = "xyz"; //this is not changing the string, it is creating a new string in memory and pointing name to it
//         System.out.println(name);//xyz



//         String str1 ="tony";
//         String str2 ="tony";
//         String str3 = new String("tony");








//         //string buider - mutable, changes can be made in string

//         StringBuilder sb = new StringBuilder("tony");
//         sb.append("stark");

//         System.out.println(sb);//tonystark

//         StringBuilder sbf = new StringBuilder("");
//         for(char ch='a';ch<='z';ch++){
//             sbf.append(ch);
//         }
//         System.out.println(sbf);




        

//     }
// }









//convert each letter of word to capital letter

// import java.util.Scanner;

// public class strings {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         String x  =str.toUpperCase();
//         System.out.println(x);
//     }
// }





//convert first letter of each word to capital letter
import java.util.Scanner;
public class strings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String arr[]= str.split(" ");
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<arr.length;i++){
            String word = arr[i];
            String first = word.substring(0,1);
            first = first.toUpperCase();
            String rem = word.substring(1,word.length());
            sb.append(first+rem+" ");
        }
        System.out.println(sb);

    }
}



// import java.util.Scanner;

// public class strings {


//     public static String capitalizefxn(String x){
//         StringBuilder sb = new StringBuilder("");
//         char ch = Character.toUpperCase(x.charAt(0));
//         sb.append(ch);

//         for(int i=1;i<x.length();i++){
//             if(x.charAt(i)==' ' && i<x.length()-1){
//                 sb.append(x.charAt(i));
//                 i++;
//                 sb.append(Character.toUpperCase(x.charAt(i)));
//             }else{
//                 sb.append(x.charAt(i));
//             }
//         }
//         return sb.toString();
//     }

//     public static void main(String[] args) {
//         //after evry space make next letter capital. convert to char array and check for space, and it is operated as 0th index
//         Scanner sc = new Scanner(System.in);
//         String strr = sc.nextLine();
//         System.out.println(capitalizefxn(strr));

//     }
// }










//String compression
//aaabbcccdd- a3b2c3d2
//abc -abc  not a1b1c1 as it got bigger

// import java.util.Scanner;

// public class strings {
//     public static String compression(String str){
//         StringBuilder sb = new StringBuilder("");
//         for(int i=0;i<str.length();i++){
//             Integer count =1;
//             while(i<str.length()-1 ){
//              if(str.charAt(i)==str.charAt(i+1)){
//
//                 count++;
//                 i++;
//             }}
//             sb.append(str.charAt(i));
//             if(count>1){
//                 sb.append(count.toString());
//             }
//         }
//         return sb.toString();
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();

        
//         System.out.println(compression(str));
        
//     }
// }






//sum of digits

//123 = 1+2+3 =6
// // -123  = -6
// import java.util.Scanner;
// public class strings {
//     public static int sumofdigits(int num){
//         int sum =0;
//         int n = Math.abs(num);
//         while(n>0){
//             int rem = n%10;
//             sum+=rem;
//             n=n/10;
//         }
//         if(num<0){
//             sum = -sum;
//         }
//         return sum;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int x =sc.nextInt();
//         System.out.println(sumofdigits(x));
        
//     }
// }


//rev a number
// public class strings {
//     public static int revnum(int num){
//         int rev =0;
//         int n = Math.abs(num);
//         while(n>0){
//             int rem = n%10;
//             rev = rev*10 + rem;
//             n=n/10;
//         }
//         if(num<0){
//             rev = -rev;
//         }
//         return rev;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int x =sc.nextInt();
//         System.out.println(revnum(x));
//}
// }







//rev string
// public class strings {
//     public static String revString(String str){
//         StringBuilder sb = new StringBuilder("");
//         for(int i=str.length()-1;i>=0;i--){
//             sb.append(str.charAt(i));
//         }
//         return sb.toString();
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         System.out.println(revString(str));
//}
// }
 