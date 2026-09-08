// //rev an arraylist
// import java.util.*;


// public class lec3 {

//     public static void main(String[] args) {
//         ArrayList<Integer> list =new ArrayList<>();
//         list.add(1);
//         list.add(2);
//         list.add(3);
//         list.add(4);
//         list.add(5);


//         for(int i=list.size()-1;i>=0;i--){
//             System.out.println(list.get(i)+ "");
//         }


//     }
// } 










//max in arraylist

// import java.util.ArrayList;

// public class lec3 {

//     public static void main(String[] args) {
//         ArrayList<Integer> list1 =new ArrayList<>();
//         list1.add(1);
//         list1.add(2);
//         list1.add(3);
//         list1.add(4);
//         list1.add(5);
//         list1.add(6);
//         list1.add(7);


//         //finding max

//         //int max=list1[0];
//         int  max =list1.get(0);

//         for(int i=0;i<list1.size();i++){
//             if(list1.get(i ) > max){
//                 max =list1.get(i);
//             }
//         }
//         System.out.println(max);
//     }
// }




// //swapping two numbers 
// import java.util.*;

// public class lec3 {
//     public static void main(String[] args) {
//         ArrayList<Integer> list2 = new ArrayList<>();
//         list2.add(2);
//         list2.add(1);
//         list2.add(3);
//         list2.add(4);
//         list2.add(5);
//         list2.add(6);
//         list2.add(7);

//         System.out.println("Before swapping: " + list2);

//         int idx1 = 0, idx2 = 5; // choose any indices
//         int temp = list2.get(idx1);
//         list2.set(idx1, list2.get(idx2));

//         //set(int index, E element)
        
//         list2.set(idx2, temp);

//         System.out.println("After swapping: " + list2);
//     }
// }





// //sorting an arraylist
// import java.util.*;
// public class lec3 {

//     public static void main(String[] args) {
//         ArrayList<Integer> list3 = new ArrayList<>();
//         list3.add(5);
//         list3.add(3);
//         list3.add(8);
//         list3.add(1);
//         list3.add(2);

//         System.out.println("Before sorting: " + list3);

//         Collections.sort(list3);

//         System.out.println("After sorting: " + list3);
//         //in rev order
//         Collections.sort(list3, Collections.reverseOrder());
//         System.out.println("After sorting in rev order: " + list3);
//     }
// }



import java.util.ArrayList;
import java.util.Scanner;

public class lec3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("Enter how many numbers you want to add: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();  // take input
            numbers.add(num);        // add to list
        }

        System.out.println("Your ArrayList is: " + numbers);
        System.out.println("Your ArrayList is: " + numbers.toString());//both priints same 

        
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }
        sc.close();
    }
}

