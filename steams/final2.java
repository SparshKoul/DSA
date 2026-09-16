package steams;
import java.util.*;
//import java.util.stream.*;
import java.util.stream.Collectors;

//file 2

public class final2 {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(10, 35, 20, 25, 30));
        int count = (int) nums.stream().count(); // int data type is used to store the count of elements in the stream. The count() method returns a long value, so we need to cast it to int to store it in an int variable.
        System.out.println(count);

        long count2 =nums.stream()
        .collect(Collectors.counting());
        System.out.println(count2);


        //same output.





        //groupingBy() is: Group elements according to some property..

        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry", "fig", "grape");
        Map<Integer, List<String>> groupedWords = words.stream()
        .collect(Collectors.groupingBy(s-> s.length()));
        System.out.println(groupedWords);
        //output: {3=[fig], 4=[date], 5=[apple, grape], 6=[banana, cherry], 10=[elderberry]}




        //partitioningBy() is: Partition elements into two groups based on a predicate. true or false

        Map<Boolean, List<String>> partitionedWords = words.stream()
        .collect(Collectors.partitioningBy(s -> s.length() > 5));
        System.out.println(partitionedWords);
        //output: {false=[fig, date, apple, grape], true=[banana, cherry, elderberry]}













        //mix of everything file 1 and file 2
        List<Integer> nums3 = Arrays.asList(10, 35, 20, 25, 30, 10, 20);
        Map<Integer, Long> groupedCount = nums3.stream()
        .collect(Collectors.groupingBy(n -> n, Collectors.counting()));
        System.out.println(groupedCount);



        List<Integer> result =
         nums.stream()
        .filter(n -> n > 20)
        .distinct()
        .sorted()
        .map(n -> n * 2)
        .collect(Collectors.toList());
        System.out.println(result);
    }
    
}
