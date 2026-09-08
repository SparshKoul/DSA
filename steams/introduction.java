package steams;

//streams 1: A stream is a sequence of data. In Java, streams are used to read and write data to and from various sources, such as files, network connections, and memory. Streams can be classified into two main types: byte streams and character streams. Byte streams handle raw binary data, while character streams handle text data.
import java.util.*;

public class introduction {
    public static void main(String[] args) {

        // without stream.
        int arr[] = { 1, 2, 3, 4, 5, -4 };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum: " + sum);


        // with stream.
        int arr2[] = { 1, 2, 3, 4, 5, -4 };
        int sum2 = Arrays.stream(arr2).sum();
        // Arrays.stream() converts this array into an IntStream.
        System.out.println("Sum2: " + sum2);



        // ex2
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        list.stream().filter(n -> n % 2 == 0).forEach(System.out::println);



        
    }

}
