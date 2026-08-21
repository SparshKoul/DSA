//works on pick the smallest element from the unsorted array and swap it with the first element of the unsorted array

//timre complexity: O(n^2) in all cases
//space complexity: O(1)

import java.util.Arrays;

public class Selection {
    public static void selectionSort(int numbers[]){
        for(int i=0; i<numbers.length-1;i++){
            int minIndex = i;
            for(int j=i+1; j<numbers.length;j++){
                if(numbers[j]<numbers[minIndex]){
                    minIndex = j;
                }
            }
            //swap
            int temp = numbers[minIndex];
            numbers[minIndex] = numbers[i];
            numbers[i] = temp;
        }
    }
    public static void main(String[] args) {
        int numbers[] = {5,4,1,3,2};
        selectionSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
    
}
