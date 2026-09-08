package steams;

import java.util.*;
import java.util.stream.Collectors;

public class advance {
    public static void main(String[] args) {

        //reduce() is used to combine all elements of a stream into a single result.
        //stream.reduce(identity, accumulator)

        // identity → Starting value
        // accumulator → Function that combines values

        List<Integer> list = Arrays.asList(1,2,3,4,5);

        int sum = list.stream().reduce(0, (a, b) -> a + b);

        System.out.println(sum);


        int product = list.stream().reduce(1, (a,b) -> a*b);

        System.out.println(product);


        //maximum
        Optional<Integer> max = list.stream().reduce(Integer::max);

        System.out.println(max.get());


        //Collectors help collect stream results into different forms.


        //1. toList()
        List<Integer> ans =list.stream().filter(x -> x > 2).collect(Collectors.toList());

        System.out.println(ans);


        //2. toSet()

        Set<Integer> set =list.stream().collect(Collectors.toSet());
        System.out.println(set);    
        
        
        //3. joining() string join

        List<String> names =Arrays.asList("Java","Python","C++");

        String s =names.stream().collect(Collectors.joining(", "));

        System.out.println(s);



        int arr[] = {1,2,3,4};

        //sum
        long su =Arrays.stream(arr).sum();
        System.out.println(su);


        //average
        double avg =Arrays.stream(arr).average().orElse(0);

        System.out.println(avg);


        // max 
        int maax=Arrays.stream(arr).max().orElse(0);
        System.out.println(maax);



         List<Integer> listt =  Arrays.asList(1,2,3,4,5,6);

        int summ = listt.stream().filter(x -> x % 2 == 0).map(x -> x * x).reduce(0, Integer::sum);
        //int summ = listt.stream().filter(x -> x % 2 == 0)..mapToInt(x -> x * x).sum();


        System.out.println(summ);


    }
    
}
