//print number in decreasing order

// import java.util.Scanner;

// public class basic {
//     public static void printDecreasing(int n){
//         if(n==1){
//             System.out.println(n);
//             return;
//         }
//         System.out.println(n);
//         printDecreasing(n-1);
//     }
//     public static void main(String[] args) {
//         int n;
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         n = sc.nextInt();
//         printDecreasing(n);


//     }
    
// }







//print number in increasing order
// import java.util.Scanner;
// public class basic {
//     public static void printIncreasing(int n){
//         if(n==1){
//             System.out.println(n);
//             return;
//         }
//         printIncreasing(n-1);
//         System.out.println(n);
//     }

//     public static void main(String[] args) {
//         int n;

//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         n = sc.nextInt();

//         printIncreasing(n);
//     }
// }







//factorial of a number 
// import java.util.Scanner;
// public class basic{
//     public static int factorial (int n){
//         if(n==0 || n==1){
//             
//             return 1;
//         }
//         else{
//             return n*factorial(n-1);
//         }

        
//     }
//     public static void main(String[] args) {
//         int n;
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         n = sc.nextInt();

//         int fact = factorial(n);
//         System.out.println("Factorial of "+n+" is: "+fact);
//     }
// }










//sum of first n natural numbers
// import java.util.Scanner;
// public class basic{
//     public static int sum(int n){
//         if(n==1){
//             return 1;
//         }
//         return n + sum(n-1);
//     }
//     public static void main(String[] args) {
//         int n;
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         n = sc.nextInt();

//         int result = sum(n);
//         System.out.println("Sum of first "+n+" natural numbers is: "+result);
//     }
// }











//print n th fibonacci number

// import java.util.Scanner;
// public class basic{
//     public static int fibonacci(int n){
//         if(n==0){
//             return 0;
//         }
//         else if(n==1){
//             return 1;
//         }
//         return fibonacci(n-1)+fibonacci(n-2);
//     }
//     public static void main(String[] args) {
//         int n;
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         n = sc.nextInt();

//         int result = fibonacci(n);
//         System.out.println("The "+n+"th fibonacci number is: "+result);
//     }
// }


// //fibonacci series
// import java.util.Scanner;

// public class basic {
//     static int fibonacci(int n) {
//         if (n == 0) return 0;
//         if (n == 1) return 1;
//         return fibonacci(n - 1) + fibonacci(n - 2);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number of terms: ");
//         int n = sc.nextInt();

//          FOR THE NTH FIBONACCI NUMBER TO PRINT

//         int nthFibo = fibonacci(n);
//         System.out.println("The " + n + "th Fibonacci number is: " + nthFibo);
// 
;
//       FOR SERIES TO PRINT
//         System.out.print("Fibonacci Series: ");
//         for (int i = 0; i < n; i++) {
//             System.out.print(fibonacci(i) + " ");
//         }
//     }
// }





//check if given array is sorted or not
// import java.util.Scanner;
// public class basic{
//     public static boolean isSorted(int arr[], int i){
//         if(i==arr.length-1){
//             return true;
//         }
//         if(arr[i]>arr[i+1]){
//             return false;
//         }
//         return isSorted(arr, i+1);
//     }
//     public static void main(String[] args) {
//         int n;
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size of array: ");
//         n = sc.nextInt();

//         int arr[] = new int[n];
//         System.out.println("Enter elements of array: ");
//         for(int i=0; i<n; i++){
//             arr[i] = sc.nextInt();
//         }

//         boolean result = isSorted(arr, 0);
//         System.out.println("Is array sorted? "+result);
//     }
// }



















//first and last occurrence of an element in an array
// import java.util.Scanner;
// public class basic{
//     public static int firstOccurence(int arr[], int key, int i){
//         if(i==arr.length){
//             return -1;
//         }
//         //incase element is found till length of array ie last element so retun -1 ie invalid index.
        
//         if(arr[i]==key){
//             return i;
//         }
//         //if element is found return index

//         //if element is not found keep searching in next index
//         return firstOccurence(arr, key, i+1);
//     }


     
//     public static void main(String[] args) {
//         int n, key;
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size of array: ");
//         n = sc.nextInt();

//         int arr[] = new int[n];
//         System.out.println("Enter elements of array: ");
//         for(int i=0; i<n; i++){
//             arr[i] = sc.nextInt();
//         }

//         System.out.print("Enter element to find: ");
//         key = sc.nextInt();

//         int first = firstOccurence(arr, key, 0);
//         int last = lastOccurence(arr, key, 0);

//         System.out.println("First Occurrence of "+key+" is at index: "+first);
//         System.out.println("Last Occurrence of "+key+" is at index: "+last);
//     }



// //
// import java.util.Scanner;
// public class basic{
//     public static int powerrr(int x, int n){
//         if(n==0){
//             return 1;
//         }
//         if(n==1){
//             return x;
//         }
//         return x  *  powerrr(x, n-1);// [x * x^n-1]
//     }
//     //int result2 = (int) Math.pow(3, 4); // cast to int → 81
//     public static void main(String[] args) {
//         int x, n;
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter base number: ");
//         x = sc.nextInt();
//         System.out.print("Enter power number: ");
//         n = sc.nextInt();

//         int result = powerrr(x, n);
//         System.out.println(x+" to the power "+n+" is: "+result);
//     }
    
// }



//optimized way to calculate x^n (log n)


//2^10   n = even       x^n/2  * x^n/2
//2^9    n = odd        x      * x^n/2 *   x^n/2
// import java.util.Scanner;
// public class basic{
//     public static int power(int x, int n){
//         if(n==0){
//             return 1;
//         }
//         if(n==1){
//             return x;
//        }
//         if(n%2==0){
//             return power(x, n/2)*power(x, n/2);
//         }
//         else{
//             return x*power(x, n/2)*power(x, n/2);
//         }
//     }
//     public static void main(String[] args) {
//         int x, n;
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter base number: ");
//         x = sc.nextInt();
//         System.out.print("Enter power number: ");
//         n = sc.nextInt();
//         int result = power(x, n);
//         System.out.println(x+" to the power "+n+" is: "+result);
//     }
// }
// }






//ARMSTRONG NUMBERpublic class ArmstrongNumber {
public class basic {
    public static void main(String[] args) {
        int num = 153;
        int original = num;
        int digits = 0;
        int sum = 0;

        // Count digits
        int temp = num;
        while (temp != 0) {
            digits++;
            temp /= 10;
        }

        // Calculate Armstrong sum
        temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        // Check
        if (sum == original) {
            System.out.println(original + " is an Armstrong number");
        } else {
            System.out.println(original + " is NOT an Armstrong number");
        }
    }
}
