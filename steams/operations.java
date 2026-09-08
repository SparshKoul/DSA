package steams;

import java.util.*;
import java.util.stream.Collectors;

public class operations {
    public static void main(String[] args) {
        //stream operation 1: intermediate operation

        //FILTER Used to select elements.

        List<Integer> list = Arrays.asList(1, 20, 30, 40, 50);
        list.stream().                   //"Create a stream of all the elements in the list."
        filter(x -> x >20).              //"For each element, call it x. Keep only those elements where x > 20 is true."
        forEach(System.out::println);    //"For each remaining element, print it."



        //Even numbers
        list.stream().filter(x -> x % 2 == 0).forEach(System.out::println);


        //filter strings
        List<String> list2 = Arrays.asList("Java", "Python", "C++", "JavaScript");
        list2.stream().filter(x -> x.startsWith("J")).forEach(System.out::println);




        //MAP : used to transfer elements
        List<Integer> arr =Arrays.asList(1,2,3,4);

        arr.stream().map(x->x*x).forEach(System.out::println);


        //Uppercase
        list2.stream().map(String::toUpperCase).forEach(System.out::println);



        //FILTER + MAP Together even nums and their dq

        arr.stream().filter(x -> x%2==0).map(x ->x*x).forEach(System.out::println);


        //SORTED
        List<Integer> sor =Arrays.asList(8,1,6,3,6,3,4);
        int[] sorr = {8, 1, 6, 3, 6, 3, 4};

        sor.stream().sorted().forEach(System.out::println);
        Arrays.stream(sorr).sorted().forEach(System.out::println);

        sor.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        Arrays.stream(sorr).boxed().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        // boxed int -> integer then this fxn of object type can be used 




        //DISTINCT Removes duplicates.
        sor.stream().distinct().forEach(System.out::println);
        Arrays.stream(sorr).distinct().forEach(System.out::println);

        // how to arr -> arraylist
        //ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));
        //only words in arr is integer


        // if arr is int 

        //ArrayList<Integer> list = new ArrayList<>();

            //for (int x : arr) {
            //   list.add(x);
            //}       





        //LIMIT first n elements
        sor.stream().limit(3).forEach(System.out::println);
        Arrays.stream(sorr).limit(3).forEach(System.out::println);





        //SKIP skip first n elemnst

        sor.stream().skip(3).forEach(System.out::println);
        Arrays.stream(sorr).skip(3).forEach(System.out::println);



        //COUNT count elements
        long c =sor.stream().count();
        System.out.println("no of elements "+c);


        //count even numbers

        long e =sor.stream().filter(x -> x %2 ==0).count();
        System.out.println("no of even elements "+e);




        //forEach printing
        sor.stream().forEach(System.out::println);
        sor.stream().forEach(x -> System.out.println(x));




        //COLLECT  Converts stream back into a collection.

        List<Integer> ans= sor.stream().filter( x-> x >3).collect(Collectors.toList());
        System.out.println(ans);



        List<Integer> z = Arrays.asList(10,15,20,25,30);

        List<Integer> result =z.stream().filter(x -> x > 15).map(x -> x * 2).sorted().collect(Collectors.toList());

        System.out.println(result);


        //Collectors help collect stream results into different forms.
        



    }
    
}
