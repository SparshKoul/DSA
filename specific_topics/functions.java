
// printing hello world



// public class functions {
//     public static void says() {
//         System.out.println("hello world");
        
//     }
//     public static void main(String[] args) {
//         says();
        
//     }
    
// }

//add two numbers

// public class functions {
//     public static int add(int a, int b) {
//         return a + b;
//     }

//     public static void main(String[] args) {
//         int result = add(5, 10);
//         System.out.println("The sum is: " + result);
//     }
// }



//// check if a number is even or odd
// public class functions{
//     public static void check(int x) {
//         if(x%2==0){
//             System.out.println("Even");
//         } else {
//             System.out.println("Odd");
//         }
        
//     }
//     public static void main(String[] args) {
//         check(10);
//         check(15);
//         check(20);
//         check(25);
//     }
// }


//find maximum of three numbers
// public class functions {

//     public static int max(int a,int b,int c) {
//         if(a>b &&a>c){
//             return a;
//         }
//         else if(b>a &&b>c){
//             return b;
//         }
//         else{
//             return c;
//         }

        
//     }
//     public static void main(String[] args) {
//         System.out.println( "biggest is "+max(1, 5, 0));
//     }
// }




// reversing a string
// public class functions {
//     public static String reverse(String s) {
//         String rev = "";
//         for (int i = s.length() - 1; i >= 0; i--) {
//             rev += s.charAt(i);
//         }
//         return rev;
//     }

//     public static void main(String[] args) {
//         System.out.println(reverse("java")); // "avaj"
//     }
// }


// square of a num

// public class functions{
//     public static int sqq(int x) {
//         return x*x;
//     }

//     public static void main(String[] args) {
//         System.out.println("square is "+sqq(4));
//     }
// }

//prime n0

// public class functions {
//     public static boolean Primecheck(int n) {
//         if (n <= 1) return false;
//         for (int i = 2; i <= Math.sqrt(n); i++) {
//             if (n % i == 0) return false;
//         }
//         return true;
//     }
//     public static void main(String[] args) {
//         System.out.println("is prime "+Primecheck(7)); // true
//         System.out.println("is prime "+Primecheck(10)); // false
//         System.out.println("is prime "+Primecheck(13)); // true
//         System.out.println("is prime "+Primecheck(15)); // false
//     }
// }
















//prime no upto n
// import java.util.Scanner;

// public class functions {

//     // Method to check if a number is prime
//     public static boolean isPrime(int num) {
//         if (num <= 1) return false;
//         if (num == 2) return true;

//         for (int i = 2; i <= Math.sqrt(num); i++) {
//             if (num % i == 0) return false;
//         }
//         return true;
//     }

//     // Method to print all prime numbers up to n
//     public static void printPrimes(int limit) {
//         System.out.println("Prime numbers up to " + limit + ":");
//         for (int i = 2; i <= limit; i++) {
//             if (isPrime(i) == true) {
//                 System.out.print(i + " ");
//             }
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num =sc.nextInt();
//         printPrimes(num);  // Print primes up to 100
//     }
// }




// //prime factor
// import java.util.*;

// public class functions {

//     public static void factor(int num,int div){
//         if(num==1) return;
//         else{
//             if(num%div==0){
//                 System.out.println(div);
//                 factor(num/div, div);
//             }else{
//                 factor(num,div+1);
//             }
//         }

//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         if(n>=2){
//             factor(n,2);
//         } 
        
//     }
// }




// //armstrong no
// import java.util.Scanner;

// public class functions {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();
        
//         int original = num;
//         int sum = 0;
//         int digits = String.valueOf(num).length(); // Number of digits
        
//         while(num != 0) {
//             int digit = num % 10;           // Extract last digit
//             sum += Math.pow(digit, digits); // Raise to power and add
//             num /= 10;                      // Remove last digit
//         }
        
//         if(sum == original) {
//             System.out.println(original + " is an Armstrong number.");
//         } else {
//             System.out.println(original + " is NOT an Armstrong number.");
//         }
//     }
// }



// import java.util.Scanner;

// public class ArmstrongNumber {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();
        
//         int original = num;
//         int sum = 0;
//         int digits = String.valueOf(num).length(); // Number of digits
        
//         while(num != 0) {
//             int digit = num % 10;           // Extract last digit
//             sum += Math.pow(digit, digits); // Raise to power and add
//             num /= 10;                      // Remove last digit
//         }
        
//         if(sum == original) {
//             System.out.println(original + " is an Armstrong number.");
//         } else {
//             System.out.println(original + " is NOT an Armstrong number.");
//         }
//     }
// }


//// wrong ans in functionsfile line  258,   ques, given aarray with pos, neg integres in it move the array's elemesnts of array in such  way that all negative elements are moved to the end of the array without using any extra space, in same order that they apppear in the original array

//wrong code, correcr in arrays file line 805
import java.util.Scanner;
public class functions {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count =0;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                count++;
            }
        }
        int k=count;

        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-k;j++){
                if(arr[i]<0){
                    int temp = arr[i];
                    arr[i]=arr[i+k];
                    arr[i+k]=temp;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    

}