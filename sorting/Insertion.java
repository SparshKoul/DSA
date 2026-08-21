
//works :pick an element (from the unsorted part) and insert it into its correct position in the sorted part.

//ex array 54132 assume 5 is sorted and 4132 is unsorted
//we pick 4 and compare it with 5 and since 4 is smaller than 5 we shift 5 to the right and insert 4 in its correct position.
//time complexity: O(n^2) in worst and average cases and O(n) in best case when the array is already sorted 
import java.util.*;
public class Insertion {

    public static void insertionSort(int numbers[]){
        for(int i=1; i<numbers.length;i++){
            int curr = numbers[i];
            int prev = i-1;

            //finding out the correct position to insert
            while(prev>=0 && numbers[prev]>curr){
                numbers[prev+1] = numbers[prev];
                prev--;
            }

            //insertion
            numbers[prev+1] = curr;
        }
    }
    public static void main(String[] args) {
        int numbers[] = {5,4,1,3,2};
        insertionSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
    
}
