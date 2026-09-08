// arrays



// arrayname.length ==  gives size of the aray
//int[] numbers = {10, 20, 30, 40, 50};
//System.out.println(numbers.length);  // Output: 5


//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
//searching an element


// import java.util.Scanner;
// public class arrays {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt()   ;
//         int numbers[] = new int[size];

//         for(int i=0; i<size; i++){ 
//             numbers[i] = sc.nextInt();
//         }

//         System.out.println("num to be found:");
//         int x = sc.nextInt();

//         for(int i=0; i<numbers.length; i++){
//             if(numbers[i] == x){
//                 System.out.println("x found at index " + i);
//             }
//             else{
//                 System.out.println("no num found");
//             }
//         }
//     }
    
// }

// this is correct and wrong as well as the output prints, manyb  llines
//not found 
//not found 
//found at index: 2
//not found 
//not found 


// more corrected code



// class array {
//     public static void main(String[] args)  {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();

//         int array[] = new int[size];

//         for (int i = 0; i < size; i++) {
//             array[i] = sc.nextInt();
//         }

//         int x = sc.nextInt();
//         boolean found = false;

//         for (int i = 0; i < array.length; i++) {
//             if (array[i] == x) {
//                 System.out.println("found at index: " + i);
//                 found = true;
//                 break; // stop after finding
//             }
//         }

//         if (!found) {
//             System.out.println("not found");
//         }
//     }
// }





//class arrays {

//public static int linearsearch(int arr[], int key) {
//    for (int i = 0; i < arr.length; i++) {
//        if (arr[i] == key) {
//            return i; // Return index if key is found
//        }
//    }
//    return -1; // Return -1 if key is not found
//}


//public static void main(String[] args) {
//int arr[] = {1,2,3,4,5};
//int key = 3;
//int result = linearsearch(arr, key);
//if (result != -1) {
//    System.out.println("Key found at index: " + result);
//} else {
//    System.out.println("Key not found");
//}
//}








//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx




// largest number and smallest method 1 



// import java.util.Scanner;

// public class arrays {

//     public static int gettinglargest(int aray[]){
//         int largest = Integer.MIN_VALUE;
//         // this will initilize an largest num setting to -infinity 


//         int smallest = Integer.MAX_VALUE;
//         // this will initilize ansmallest num setting to +infinity 

//         for(int i =0;i<aray.length;i++){
//             if(largest<aray[i]){
//                 largest = aray[i];
//             }

//             if(smallest>aray[i]){
//                 smallest = aray[i];
//             }
            
//         }

//         //If you put System.out.println() or return inside the if blocks, they will execute immediately — even before the loop finishes scanning the whole array.


//         System.out.println("smallest value is :"+ smallest);//gives smallest
//         return largest;//gives largest
//     }
//         // we used one sout and one return as , only one retutn is possible in one loop , so now we have to use sout.

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int array[]= new int [size]; 

//         for(int i=0;i<size;i++){
//             array[i] = sc.nextInt();
//         }


//         System.out.println("largest num in array is  "+ gettinglargest(array));


//     }
// }



// we can make 2 diff loops as well , rather then one , methhod 2

// import java.util.Scanner;
// public class arrays {

//     public static int getLargest(int[] aray) {
//         int largest = Integer.MIN_VALUE;

//         // First loop: Find the largest value
//         for (int i = 0; i < aray.length; i++) {
//             if (largest < aray[i]) {
//                 largest = aray[i];
//             }
//         }

//         return largest;
//     }

//     public static int getSmallest(int[] aray) {
//         int smallest = Integer.MAX_VALUE;

//         // Second loop: Find the smallest value
//         for (int i = 0; i < aray.length; i++) {
//             if (smallest > aray[i]) {
//                 smallest = aray[i];
//             }
//         }

//         return smallest;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter array size: ");
//         int size = sc.nextInt();
//         int[] array = new int[size];

//         System.out.println("Enter " + size + " elements:");
//         for (int i = 0; i < size; i++) {
//             array[i] = sc.nextInt();
//         }

//         // Call both methods
//         int largest = getLargest(array);
//         int smallest = getSmallest(array);

//         System.out.println("Largest number in array is: " + largest);
//         System.out.println("Smallest number in array is: " + smallest);
//     }
// }




//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx




//binary search works  on sorted array only


// public class arrays {

//     public static int binarysearcj(int numbers[] ,int key) {
//         int start = 0 , end = numbers.length - 1;

//         while (start<=end) {
//             int mid = (start+end) /2;

//             if(numbers[mid] == key){
//                 return mid;
//             }
//             if (numbers[mid] < key) {
//                 start =mid+1;
                
//             }else{
//                 end = mid-1;
//             }
            
//         }

//         return -1;
        
//     }
//     public static void main(String[] args) {
//         int numbers[] = {2,4,6,8,10,12,14};
//         int key = 10 ;

//         System.out.println("index for key is : "+ binarysearcj(numbers, key));
//     }

    
// }

////reversing array using  reversed loop
// public class arrays {
//     public static void reverse(int arr[]){
//         int n=arr.length;
//         for(int i=n-1;i>=0;i--){
//             System.out.print(arr[i]+" ");
//         }
//     }
//     public static void main(String[] args) {
//         int arr[]={1,2,3,4,5};
//         reverse(arr);    
//     }

// }





//swapping method to reverse an array important.
//reversing an array   with fxn
// public class arrays {

//     public static void reverse(int numbers[]) {
//         int first = 0, last = numbers.length-1;


// //he start < end condition is not comparing values in the array.
// //It's comparing positions (indexes) only — not arr[start] < arr[end], just start < end


//         while (first<last) {
//             int temp = numbers[last];
//             numbers[last] =numbers[first];
//             numbers[first] =temp;

//             first++;
//             last--;

//         }
        
//     }
//not used <= here as it would lead to unnecessary swap when first and last point to the same middle element in case of odd length arrays, which is not needed and can be inefficient. Using < ensures we only swap pairs of elements without touching the middle one when they meet.

//     public static void main(String[] args) {
//         int numbers[] ={2,4,6,8,10};

//         reverse(numbers);
//         for(int i=0 ; i<numbers.length;i++){
//             System.out.println(numbers[i] + " ");
//         }

//         System.out.println();
//     }
// }


















//reversing with for loop



// import java.util.Scanner;
// public class arrays {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Input array size
//         System.out.print("Enter size of array: ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];

//         // Input elements
//         System.out.println("Enter array elements:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         // Reverse using for loop
//         for (int i = 0; i < n / 2; i++) {
//             // Swap arr[i] with arr[n - i - 1]
//             int temp = arr[i];
//             arr[i] = arr[n - i - 1];
//             arr[n - i - 1] = temp;
//         }

//         // Print reversed array
//         System.out.println("Reversed array:");
//         for (int num : arr) {
//             System.out.print(num + " ");
//         }
//     }
// }





// reversing without fxn
// import java.util.Scanner;

// public class arrays {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Input array
//         System.out.print("Enter size of array: ");
//         int size = sc.nextInt();
//         int[] arr = new int[size];

//         System.out.println("Enter " + size + " elements:");
//         for (int i = 0; i < size; i++) {
//             arr[i] = sc.nextInt();
//         }

//         // Reverse using swap
//         int start = 0, end = size - 1;
//         while (start <= end) {

// //           // If you allow start == end (i.e., use start <= end), it means you're trying to swap an element with itself in the middle of the array — which is unnecessary and sometimes wasteful.
// //           // it mwould still give correct output but effeciency woulkd be less, (slow process).

//             // Swap
//             int temp = arr[start];
//             arr[start] = arr[end];
//             arr[end] = temp;

//             start++;
//             end--;
//         }

//         // Output reversed array
//         System.out.println("Reversed array:");
//         for (int i = 0; i < size; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }





//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx




// pairs n array
//2looops would be used, one selects the num, and one selects the numbers after that num on array so we can make pairs


// public class arrays {
//     public static void printpairs(int numbers[] ){
//         for(int i =0 ;i<numbers.length; i++){
//             int curr=numbers[i];
//             for(int j=i+1; j<numbers.length; j++){
//                 System.out.println("("+ curr+ ","+ numbers[j]+")");
//             }
//             System.out.println();
//         }
//     }


//     public static void main(String[] args) {

//         int numbers[] ={1,2,3,4,5,6,7,8,9,10};
//         printpairs(numbers);
        
//     }
// }






//subarray
//continous elements form sub arrays only


//pehla ek number uthao or fir end k liye ek number ,or unke beeech ke sare print kr do.
// array of n elements has n(n+1)/2  sub arrays
// public class arrays {

//     public static void printsubarray(int numbers[]){
//         for(int i=0; i<numbers.length;i++){
//             int start = i;
//             for(int j=i ; j<numbers.length;j++){
//                 int end = j;
//                 for(int k=start;k<=end;k++){
//                     System.out.println(numbers[k] + "");
//                 }
//                 System.out.println();
//             }
//             System.out.println();
//         }
//     }


//if we do j=i+1  then for {1,2,3}     output would be for i=0  j will be 1,2(indx) so = (1,2) (1,3)  for i=1 (2,3)  and for i=2 no pair would be there.  
//therefore  if j=i is done it includes all subarrays ,but for j=i+1 it skips single element subarray . like above for i-0 {1} is not included as j starts from i+1, so it would be 2 and 3 only, but if j=i is done then for i=0 it would be (1) (1,2) (1,2,3) and for i=1 (2) (2,3) and for i=2 (3)  so all sub arrays are included.


 
//     public static void main(String[] args) {
//         int numbers[] ={2,4,6,8,10};
//         printsubarray(numbers);
        
//     }
// }



//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx



//max sub array sum(brute force)   time complexity bad hai on^3   as 3 loops nested wale


//sub arrays k sum un mai se bhi max print krna
// public class arrays {

//     public static void maxsubarrayprint(int numbers[]){

//         int cursum = 0;//currentsum
//         int maxsum=Integer.MIN_VALUE;
//         for(int i=0; i<numbers.length;i++){
//             int start = i;
//             for(int j=i; j<numbers.length;j++){
//                 int end = j;
//                 cursum=0;
//                 for(int k=start;k<=end;k++){
//                     //csub array sum
//                     cursum+=numbers[k];
//                 }
//                 System.out.println(cursum);// prints each sub arrays sum
//                 if(maxsum<cursum){
//                     maxsum = cursum;
//                 }
                
//             }
            
//         }
//         System.out.println("max sum is: "+maxsum);// prints biggest sum of sub array
//     }

//     public static void main(String[] args) {
//         int numbers[] ={2,4,6,8,10};
//         maxsubarrayprint(numbers);
        
//     }
// }



// xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx




//method 2 (prefix way) 2loops on^2 time compix as 2 nested loops

// public class arrays {

//     public static void maxsubarrayprint(int numbers[]){

//         int cursum = 0;//currentsum
//         int maxsum=Integer.MIN_VALUE;

//         int prefix[] = new int [numbers.length];
//         prefix[0] = numbers[0];
//         // call prefix array
//         // loop 1 se start kre as prefix of 0 is same as that of number
//         //0th index tak sirf 0th wale elemnt ka sum hai 

//         for(int i =1;i<prefix.length;i++){
//             prefix[i] = prefix[i-1] +numbers[i];
//         }



//         for(int i=0; i<numbers.length;i++){
//             int start = i;
//             for(int j=i; j<numbers.length;j++){
//                 int end = j;


//                 cursum = start ==0 ? prefix[end] : prefix[end] - prefix[start-1];
                
//                 System.out.println(cursum);// prints sub arrays
//                 if(maxsum<cursum){
//                     maxsum = cursum;
//                 }
                
//             }
            
//         }
//         System.out.println("max sum is: "+maxsum);// prints biggest sum of sub array
//     }

//     public static void main(String[] args) {
//         int numbers[] ={2,4,6,8,10};
//         maxsubarrayprint(numbers);
        
//     }
// }







//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx


//method3    kedans algorithm
// he considers agr koi sum negative ho gye to usko zero onsider kro

//maximum sum to hum starting mai 0 comsider krte haifit har index p comparea krke change
//current sum ko hum o consider krte hai fir nusme har index k elemnt ko add, here agr vo <0 aagya so   ham usko 0 likhemge


//as isme ek he loop  hai  so time compilixity 0n

// public class arrays {

    
//this code is wrong as it gives 0 as max sum when all numbers are negative
//     public static void kadans(int numbers[]){
//         int ms = Integer.MIN_VALUE;
//         int cs = 0;

//         for(int i=0;i<numbers.length;i++){
//             cs= cs+numbers[i];
//             if(cs<0){
//                 cs=0;
//             }
//             ms =Math.max(cs, ms);
//         }
//         System.out.println("our max sum is:" + ms);

//     }

//it has some issue as it gives 0 as max sum when all numbers are negative


//corrected way
//public static void kadans(int numbers[]){
//  int ms = Integer.MIN_VALUE;
//   int cs = 0;

 //   for(int i = 0; i < numbers.length; i++){
//        cs = cs + numbers[i];
//
//        ms = Math.max(ms, cs);   // update first
//
//        if(cs < 0){
//            cs = 0;
//        }
//    }
//
//    System.out.println("our max sum is: " + ms);
//}



// corrected code below
// public static void kadans(int numbers[]) {
//     int cs = numbers[0];
//     int ms = numbers[0];

//     for (int i = 1; i < numbers.length; i++) {
//         cs = Math.max(numbers[i], cs + numbers[i]);
//         ms = Math.max(ms, cs);
//     }

//     System.out.println("our max sum is: " + ms);
// }


//     public static void main(String[] args) {
//         int numbers[] ={-2,-3,4,-1,-2,1,5,-3};
//         kadans(numbers);
        
//     }
// }








// trapping rain water


// public class arrays {
//     public static int trappedwater(int height[]){
//         //calc left n  right max boundry(auxaliry array)

//         //loop
//         //water level =min(leftmax bound, rightmax bound)
//         //trapped water = waterlevel -height[i]

//         int n = height.length;// usefulll aheasd
        
        
//         int leftmax[] = new int[n];
//         leftmax[0] = height[0];// as uske left mai kuch nahi hai jius se compare ho vo particular elemnt of that index

//         //bake sab k liye loop lagane padegeto find left max elemsnts

//         for(int i=1;i<height.length;i++){//loop started from 1 as , 0 p already defined hai uoer wale step mai 
//             leftmax[i]= Math.max(height[i], leftmax[i-1]);
//         }
//         //current height  is getting compare to previous max height thats of previous




//         //calc right max(remember right max start from right side unline left max that was stareted from left)


//         int rightmax[]= new int [n];
//         rightmax[n-1] =height[n-1];
//         //right most(last elemsnt of array) ke right mai or kuch nahi hai compare hone k liye so vo same aayaga as it itself

//         for(int i=n-2;i>=0;i--){// n-1k liye jo last elemnt hai vo already defined hai

//             rightmax[i] = Math.max(height[i], rightmax[i+1]);
//             //getting compared from right side of particular height with one next to it 

//         }


//         //loop
//         int trappedWater = 0;
//         for(int i =0;i<n;i++){
//            int waterlevel = Math.min(leftmax[i], rightmax[i]);
//            trappedWater += waterlevel-height[i]; 
//         }

//         return trappedWater;


//     }

//     public static void main(String[] args) {

//         int height[] ={4,2,0,6,3,2,5};
//         System.out.println(trappedwater(height));

        
//     }
// }



//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx






//best tiime to buy and sell stcks

// public class arrays {
//     public static int besttime(int prices[]) {
//         int maxprofit = 0;
//         int buyprice = Integer.MAX_VALUE;

//         for (int i = 0; i < prices.length; i++) {
//             if (prices[i] > buyprice) {//sp>bp
//                 int profit = prices[i] - buyprice;//sp-bp
//                 maxprofit = Math.max(maxprofit, profit);//compare honge profit or jo bda uske value sace
//             } 
//             else   {
//                 buyprice = prices[i];
//                 //as buy price >sp  so we can buy and keep it for future
                
//             }
//         }

//         return maxprofit;
//     } 

//     public static void main(String[] args) {
//         int prices[] = {7, 1, 5, 3, 6, 4};
//         System.out.println("Max profit is: " + besttime(prices));
//     }

    
// }

// import java.util.*;
// public class arrays {

//     public static void main(String[] args) {
//         int arr[] = {10,6,8,4,12,16,3};
//         Arrays.sort(arr);

//         System.out.println(Arrays.toString(arr));
//         //or
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }

















// //import java.util.Arrays;
// import java.util.Collections;

// public class arrays {

//     public static void main(String[] args) {

//         // --- Original Array ---
//         // For reverse sorting, we must use an object array (Integer) instead of a primitive array (int)
//         Integer[] numbers = {4, 1, 9, 5, 3, 8, 2, 7};
//         System.out.println("Original array: " + Arrays.toString(numbers));


//      //--normal revering of array--
//         // // Reversing the array using Collections.reverse() ..fxn does not work directly on primitive arrays so we have  to convert it to list
//         // Collections.reverse(Arrays.asList(numbers));
//         // System.out.println("Reversed array: " + Arrays.toString(numbers));




//         // --- Normal (Ascending) Sort ---
//         // The array is sorted in ascending (natural) order.
//         Integer[] normalSortArray = numbers.clone(); // Create a copy to preserve the original
//         Arrays.sort(normalSortArray);
//         System.out.println("Normal sort (ascending): " + Arrays.toString(normalSortArray));




//         // --- Partial Sort ---
//         // Sorts only a specified range. In this case, indices 2 (inclusive) to 6 (exclusive).
//         Integer[] partialSortArray = numbers.clone(); // Create a copy
//         Arrays.sort(partialSortArray, 2, 6);
//         System.out.println("Partial sort (indices 2 to 5): " + Arrays.toString(partialSortArray));




//         // --- Reverse (Descending) Sort ---
//         // Requires an object array (Integer[]) and Collections.reverseOrder()
//         Integer[] reverseSortArray = numbers.clone(); // Create a copy
//         Arrays.sort(reverseSortArray, Collections.reverseOrder());
//         System.out.println("Reverse sort (descending): " + Arrays.toString(reverseSortArray));
//     }
// }


//Original array: [4, 1, 9, 5, 3, 8, 2, 7]
//Normal sort (ascending): [1, 2, 3, 4, 5, 7, 8, 9]
//Partial sort (indices 2 to 5): [4, 1, 3, 5, 8, 9, 2, 7]
//Reverse sort (descending): [9, 8, 7, 5, 4, 3, 2, 1]





//rotating array by k to right
// import java.util.*;

// public class arrays {

//     public static void rotate(int arr[],int k){
//         for(int i=arr.length-k;i<arr.length;i++){
//             System.out.println(arr[i]);
//         }
//         for(int i=0;i<arr.length-k;i++){
//             System.out.println(arr[i]);
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int k = sc.nextInt(); //2
//         int arr[] = {1,2,3,4,5,6};
//         rotate(arr, k);
        
//     }
// }














// wrong ans in functionsfile line  258,   ques, given aarray with pos, neg integres in it move the array's elemesnts of array in such  way that all negative elements are moved to the end of the array without using any extra space, in same order that they apppear in the original array.


// import java.util.Scanner;
// import java .util.*;

// public class arrays {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int arr[] = new int[n];

//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         int count = 0;
//         for (int i = 0; i < n; i++) {
//             if (arr[i] < 0) {
//                 count++;
//             }
//         }

//         int k = count;  // number of negatives

//         // Bubble negatives to the end
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n - i - k; j++) {
//                 if (arr[j] < 0) {
//                     int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                 }
//             }
//         }

//         // Print result
//         for (int i = 0; i < n; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }
// // this some time gives wrong answer as the order is not presenrved ,,May leave some negatives not fully at the end


// //correctv way
// import java.util.Scanner;

// public class arrays {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int arr[] = new int[n];

//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         // Bubble negatives to the end
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n - 1; j++) {
//                 if (arr[j] < 0 && arr[j + 1] >= 0) {
//                     // swap
//                     int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                 }
//             }
//         }

//         // Print result
//         for (int i = 0; i < n; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }



//second largest in an array
public class arrays {
    public static void secondmax(int arr[]){
        int max =arr[0];
        int secondmaxnum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];

            }
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]>secondmaxnum && arr[i]!=max){
                secondmaxnum=arr[i];
            }
        }
        System.out.println("second max num is: "+ secondmaxnum);
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        
        System.out.println();
        secondmax(arr);
        sc.close();


    }
}