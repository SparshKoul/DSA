//works on the principle of repeatedly swapping the adjacent elements if they are in wrong order


//time complex: O(n^2) in all cases
//space complexity: O(1)
import java.util.*;  
public class Bubble {
    public static void bubbleSort(int numbers[]){
        for(int i=0; i<numbers.length-1;i++){
            for(int j=0; j<numbers.length-1-i;j++){
                if(numbers[j]>numbers[j+1]){
                    //swap
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int numbers[] = {5,4,1,3,2};
        bubbleSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
    
}
