
import java.util.*;
public class Inbuilt {

    public static void main(String[] args) {
        int numbers[] = {5,4,1,3,2};
        Arrays.sort(numbers);
        //without using inbuilt function
        for(int i=0; i<numbers.length;i++){
            System.out.println(+ numbers[i]);
        }

        System.out.println("sorted: " + Arrays.toString(numbers));

        

        //if we want to sort in descending order
        //we cannot use primitive data type array for sorting in descending order because it does not support comparator.
        //therefore used Integer arr instead of int arr
        
        Integer numbers2[] = {5,4,1,3,2};
        Arrays.sort(numbers2, Collections.reverseOrder());
        System.out.println("descending: " + Arrays.toString(numbers2));

        //if we want in particular range sort
        int numbers3[] = {5,4,1,3,2};
        Arrays.sort(numbers3, 1, 4);
        System.out.println("in range: " + Arrays.toString(numbers3)); //sorts from index 1 to index 3 (4 is exclusive if we want to include 4 then we have to write 5)


        //if we want to sort in descending order in particular range
        Integer numbers4[] = {5,4,1,3,2};
        Arrays.sort(numbers4, 1, 3, Collections.reverseOrder());
        System.out.println("descending in range: " + Arrays.toString(numbers4));


    }
}