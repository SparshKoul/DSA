package steams;

//file 1

//intermediate operations :filter(), map(), sorted(), distinct(), limit(), skip()

//terminal operations : forEach(), collect(), reduce(), count(), min(), max()

import java.util.*;

public class final1 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10, 35, 20, 25, 30);


        //filter() is an intermediate operation that selects elements based on a given condition. It takes a predicate (a function that returns a boolean value) as an argument and returns a new stream containing only the elements that satisfy the condition.
        nums.stream()
        .filter(n -> n > 20)
        .forEach(n -> System.out.println(n));



        //map() is an intermediate operation that transforms each element of a stream into another form. It takes a function as an argument and returns a new stream containing the transformed elements.
        nums.stream()
         .map(n -> n * 2)
         .forEach(n -> System.out.println(n));


        //sorted()  sorts the elements of a stream in natural order (ascending order for numbers and lexicographical order for strings).
        nums.stream()
        .sorted()
        .forEach(n -> System.out.println(n));


        //descending order
        nums.stream()
        .sorted(Comparator.reverseOrder())
        .forEach(n -> System.out.println(n));
    
        //or
        nums.stream()
        .sorted((a, b) -> b - a)
        .forEach(n -> System.out.println(n));


        //distinct() removes duplicate elements
        List<Integer> nums2 = Arrays.asList(10, 35, 20, 25, 30, 10, 20);
        nums2.stream()
        .distinct()
        .forEach(n -> System.out.println(n));





        //limit() keeps only the first N elements.
        nums.stream()
        .limit(3)
        .forEach(n -> System.out.println(n));



        //skip() skips the first N elements.
        nums.stream()
        .skip(3)
        .forEach(n -> System.out.println(n));











        //combining intermediate operations
        //ques:Find even numbers greater than 20, multiply them by 2, and print them.
        nums.stream()
        .filter(n -> n > 20 && n % 2 == 0)
        .map(n -> n * 2)
        .forEach(n -> System.out.println(n));




        //reduce() is a terminal operation that combines the elements of a stream into a single result. It takes an initial value and a binary operator (a function that takes two arguments and returns a single value) as arguments and returns the final result.
        int sum1 = nums.stream()
        .reduce(0, (a, b) -> a + b);
        System.out.println(sum1);
      
        int product1 = nums.stream()
        .reduce(1,(a,b) -> a * b);
        System.out.println(product1);


        //find maximum and minimum
        int max1 = nums.stream()
        .reduce(Integer.MIN_VALUE,(a,b) -> a > b ? a : b);
        System.out.println(max1);

        int min1 = nums.stream()
        .reduce(Integer.MAX_VALUE,(a,b) -> a < b ? a : b);
        System.out.println(min1);




        //count() how many elements
        long count =nums.stream().count();
        System.out.print(count);




        //collectors
        


    }


    
}
