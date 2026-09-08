//multidim arraylist
import java.util.*;
public class multidim {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainlist =new ArrayList<>();

        //create 1st list
        ArrayList<Integer> list1 =new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        //create 2nd list
        ArrayList<Integer> list2 =new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);

        //create 3rd list
        ArrayList<Integer> list3 =new ArrayList<>();
        list3.add(7);
        list3.add(8);
        list3.add(9);

        //adding to mainlist
        mainlist.add(list1);
        mainlist.add(list2);
        mainlist.add(list3);

        System.out.println(mainlist);

        //prin element at index 2 of 3rd list
        System.out.println(mainlist.get(1).get(2));
        //output:6, how ?
        //mainlist.get(1) = list2
        //list2.get(2)=6
}
}