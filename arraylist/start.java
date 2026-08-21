import java.util.*;


public class start {

    public static void main(String[] args) {

        //ArrayList<Type> listName = new ArrayList<>();


        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        //operations in arraylist

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);


        System.out.println(list1);

        //add a number at a index
        list1.add(3,9);
        System.out.println(list1);//[1, 2, 3, 9, 4]




        //what if that index is nor presnt liuke 1000? or -ve
       // list1.add(100,9);
        //System.out.println(list1);//

        //error =IndexOutOfBoundsException: Index: 100, Size: 5 



        //list1.add(-100,9);
        //System.out.println(list1);//
       
        //IndexOutOfBoundsException: Index: -100, Size: 5


        //so like we can only iterate till the last letter only
         list1.add(6);
         System.out.println(list1);
        
         //[1, 2, 3, 9, 4, 6]
        System.out.println(list1.size());//6


        list1.add(6,100);
         System.out.println(list1);//[1, 2, 3, 9, 4, 6, 100]
         //therefore iteration workls tll the next lasst digit



        // list1.add(8,100);
        // System.out.println(list1);//error as next element is 8th but it has to be put in 7th index 







        //to iterate or to get an elemsnt

        int elemsnt=list1.get(2);
        System.out.println(elemsnt);



        //removing

        list1.remove(2);
        System.out.println(list1);
        

        //set element at index
        list1.set(2, 10000);
        System.out.println(list1);

        list1.set(2, null);
        System.out.println(list1);//[1, 2, null]


        //so like cant we vanish that number like next numbers takes it place, like we want to remove that element only 
        //for that remove fxn is used


        //contains
        System.out.println(list1.contains(1));
        System.out.println(list1.contains(11));



        //size 
        int x =list1.size();
        System.out.println(x);//[1, 2, null, 4, 6, 100]


        for(int i=0;i<list1.size();i++){
            System.out.println(list1.get(i));//.This prints each element of the ArrayList — and each one goes to a new line automatically because println adds a newline after printing.
        }
        System.out.println();//This prints an empty line — just a blank newline.

        System.out.println("helllo");//just adds a new line of empyt space u can remove it no worrues

    }
}