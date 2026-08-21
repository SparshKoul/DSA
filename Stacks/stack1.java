// // package zcourse.Stacks;
// // import java.util.*;

// // public class stack1 {
// //     public static class Stack{
// //         static ArrayList<Integer> list=new ArrayList<>();

// //         //is empty
// //         public boolean isEmpty(){
// //             return list.size()==0;
// //             //if stack is empty ie size is 0... return true else false
// //         } 


// //         //push
// //         public void push(int data){
// //             list.add(data);
// //             //array list ka add fxn se data end me add ho jayega ie automatically top for stack ban jayega.
// //         }

// //         //pop
// //         public int pop(){
// //             if(isEmpty()){
// //                 return -1;
// //             }
// //             int top=list.get(list.size()-1);
// //             list.remove(list.size()-1);
// //             return top;
// //         }


// //         //peek-- top element dekhne ke liye
// //         public int peek(){
// //             if(isEmpty()){
// //                 return -1;
// //             }
// //             return list.get(list.size()-1);
// //         }

// //     }
// //     public static void main(String[] args) {
// //         Stack s=new Stack();
// //         s.push(1);
// //         s.push(2);
// //         s.push(3);
// //         s.push(4);

// //         while(!s.isEmpty()){//jab thak stack empty na ho
// //             System.out.println(s.peek());//top element print karwao
// //             s.pop();//top element remove kar do
// //         }
        
// //     }
    
// // }




















// // //stack using linked list

// // package zcourse.Stacks;

// // public class stack1 {

// //     static class Node{
// //         int data;
// //         Node next;

// //         public Node(int data){
// //             this.data=data;
// //             this.next=null;
// //         }
// //     }

// //     public static class Stack{
// //         public  Node head;
// //         public int size;

// //         //is empty
// //         public boolean isEmpty(){
// //             return size==0;
// //         }

// //         //push
// //         public void push(int data){
// //             Node newNode=new Node(data);
// //             if(isEmpty()){//if stack is empty then direclly head will point to new node
// //                 head=newNode;
// //                 size++;
// //                 return;
// //             }
// //             newNode.next=head;
// //             head=newNode;
// //             size++;
// //         }

// //         //pop
// //         public int pop(){
// //             if(isEmpty()){
// //                 return -1;
// //             }
// //             int top=head.data;
// //             head=head.next;
// //             size--;
// //             return top;
// //         }

// //         //peek
// //         public int peek(){
// //             if(isEmpty()){
// //                 return -1;
// //             }
// //             return head.data;
// //         }
// //     }


// //     public static void main(String[] args) {
// //         Stack s=new Stack();
// //         s.push(1);
// //         s.push(2);
// //         s.push(3);
// //         s.push(4);

// //         while(!s.isEmpty()){//jab thak stack empty na ho
// //             System.out.println(s.peek());//top element print karwao
// //             s.pop();//top element remove kar do
// //         }
        
// //     }
// // }










      




// //stack using java collections


// //literally this works the same as previous one but using java collections stack class
// //as inbult fxns are already defined in stack class of java collections


// // package zcourse.Stacks;
// // import java.util.*;

// // public class stack1 {

// //     public static void main(String[] args) {
// //         Stack<Integer> s=new Stack<>();
// //         s.push(1);
// //         s.push(2);
// //         s.push(3);
// //         s.push(4);

// //         while(!s.isEmpty()){//jab thak stack empty na ho
// //             System.out.println(s.peek());//top element print karwao
// //             s.pop();//top element remove kar do
// //         }
// //     }
// // }




















// // //push at bottom of stack
// // package zcourse.Stacks;
// // import java.util.*;

// // public class stack1 {

// //     public static void pushAtBottom(Stack<Integer> s,int data){
//  //   approach- empty the stack then add the data then add the old elements back.
// //         //base case
// //         if(s.isEmpty()){
// //             s.push(data);
// //             return;
// //         }

// //         //recursion
// //         int top=s.pop();
// //         pushAtBottom(s, data);

// //         s.push(top);
// //     }


//here when in recusion pushatbottom is called it uses that fxn at that point only and moves ahead from that point rather then reading the code from ttop.

//"oh u mean it ata tha point it chek that fxn only rather gaoin gon the top and comming down"


//xxxxxxxxxxxx   when return is hit it goes back to wheer fxn was called ,possed ie pushaaatbottom therefore when reurn statemnt is hit it goes after the pushatbottom fxn call and executes the code after that which is s.push(top) and then it goes back to the previous call of pushatbottom and executes the code after that which is s.push(top) and this process continues until it goes back to the first call of pushatbottom and executes the code after that which is s.push(top) and then it goes back to main function and executes the code after that which is while loop to print the stack  


// //     public static void main(String[] args) {
// //         Stack<Integer> s=new Stack<>();
// //         s.push(1);
// //         s.push(2);
// //         s.push(3);
// //         s.push(4);

// //         pushAtBottom(s,0);

// //         while(!s.isEmpty()){//jab thak stack empty na ho
// //             System.out.println(s.peek());//top element print karwao
// //             s.pop();//top element remove kar do
// //         }
        
// //     }
// // }














// // //REVERSE A STRING USING STACK

// // package zcourse.Stacks;
// // import java.util.*;
// // public class stack1 {

// //     public static String reverseString(String str){
// //         Stack<Character> s=new Stack<>();

// //         //push all characters of string into stack
// //         for(int i=0;i<str.length();i++){
// //             s.push(str.charAt(i));
// //         }

// //         StringBuilder sb=new StringBuilder("");

// //         //pop all characters from stack and add to string builder
// //         while(!s.isEmpty()){
// //             sb.append(s.pop());
// //         }

// //         return sb.toString();
// //     }
// //     public static void main(String[] args) {
// //         String str="Hello World";
// //         String reversed=reverseString(str);
// //         System.out.println("Reversed String: "+reversed);
// //     }
// // }






















// // //reverse a stack using recursion  by java collections stack class

//working:pop from one stack and push at bottom of another stack using recursion. but this uses more memory as we are using 2 stacks. so we can do this using only one stack and recursion without using another stack. but this is for understanding the concept of recursion in stacks.


//working:empty a stack and then add the elements back in reverse order using recursion. this is the most optimised way to reverse a stack using only one stack and recursion without using another stack. this is for understanding the concept of recursion in stacks.
//like empty stacl then use pushatbottom fxn to add the elements back in reverse order..
 
// // package zcourse.Stacks;
// // import java.util.*;

// // public class stack1 {
// //     public static void pushAtBottom(Stack<Integer> s,int data){
// //         //base case
// //         if(s.isEmpty()){
// //             s.push(data);
// //             return;
// //         }  

// //         //recursion
// //         int top=s.pop();
// //         pushAtBottom(s, data);

// //         s.push(top);
// //     }
// //     public static void reverseStack(Stack<Integer> s){
// //         //base case
// //         if(s.isEmpty()){
// //             return;
// //         }

// //         //recursion
// //         int top=s.pop();
// //         reverseStack(s);

// //         pushAtBottom(s, top);
// //     }
// //     public static void main(String[] args) {
// //         Stack<Integer> s=new Stack<>();
// //         s.push(1);
// //         s.push(2);
// //         s.push(3);
// //         s.push(4);

// //         reverseStack(s);

// //         while(!s.isEmpty()){//jab thak stack empty na ho
// //             System.out.println(s.peek());//top element print karwao
// //             s.pop();//top element remove kar do
// //         }
        
// //     }
// // }




// other way using 2 stacks
import java.util.*;

public class stack1 {

    // reverse using another stack
    public static Stack<Integer> reverseStack(Stack<Integer> s) {
        Stack<Integer> rev = new Stack<>();

        while (!s.isEmpty()) {
            rev.push(s.pop());
        }

        return rev;
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        System.out.println("Original Stack: " + s);//[1,2,3,4]

        Stack<Integer> reversed = reverseStack(s);

        System.out.println("Reversed Stack: " + reversed);//[4,3,2,1]


        //how actually to print stack elements

        while (!reversed.isEmpty()) {
            System.out.println(reversed.peek()+" ");//1    2    3   4 in veritcal like actual stack
            reversed.pop();
        }
    }
}













// //completelt same as previous one but using linked list instead of java collections stack class


// // package zcourse.Stacks;
// // public class stack1 {

// //     // ------------------- NODE CLASS -------------------
// //     static class Node {
// //         int data;
// //         Node next;

// //         Node(int data) {
// //             this.data = data;
// //             this.next = null;
// //         }
// //     }

// //     // ------------------- STACK CLASS -------------------
// //     public static class Stack {
// //         private Node head;
// //         private int size;

// //         // is empty
// //         public boolean isEmpty() {
// //             return size == 0;
// //         }

// //         // push
// //         public void push(int data) {
// //             Node newNode = new Node(data);
// //             newNode.next = head;
// //             head = newNode;
// //             size++;
// //         }

// //         // pop
// //         public int pop() {
// //             if (isEmpty()) return -1;

// //             int top = head.data;
// //             head = head.next;
// //             size--;
// //             return top;
// //         }

// //         // peek
// //         public int peek() {
// //             if (isEmpty()) return -1;
// //             return head.data;
// //         }

// //         // --------------------------------------------
// //         // PUSH AT BOTTOM USING RECURSION
// //         // --------------------------------------------
// //         public void pushAtBottom(int data) {
// //             if (isEmpty()) {
// //                 push(data);
// //                 return;
// //             }

// //             int top = pop();              // STEP 1
// //             pushAtBottom(data);           // STEP 2 (recursive)
// //             push(top);                    // STEP 3
// //         }

// //         // --------------------------------------------
// //         // REVERSE USING RECURSION
// //         // --------------------------------------------
// //         public void reverse() {
// //             if (isEmpty()) return;

// //             int top = pop();      // remove top
// //             reverse();            // reverse remaining stack
// //             pushAtBottom(top);    // insert removed item at bottom
// //         }
// //     }

// //     // ------------------- MAIN -------------------
// //     public static void main(String[] args) {

// //         Stack s = new Stack();
// //         s.push(1);
// //         s.push(2);
// //         s.push(3);
// //         s.push(4);

// //         System.out.println("Original Stack (top to bottom):");
// //         printStack(s);

// //         s.reverse();

// //         System.out.println("\nReversed Stack (top to bottom):");
// //         printStack(s);
// //     }

// //     // helper (not modifying original)
// //     public static void printStack(Stack s) {
// //         Stack temp = new Stack();

// //         while (!s.isEmpty()) {
// //             int val = s.pop();
// //             System.out.println(val);
// //             temp.push(val);
// //         }

// //         while (!temp.isEmpty()) { // restore original stack
// //             s.push(temp.pop());
// //         }
// //     }
// // }









// //stock span problem using brute force for understanding




//same as above but with condition in for loop

// public static int[] stockSpanBrute(int[] prices) {
//     int n = prices.length;
//     int span[] = new int[n];

//     for (int i = 0; i < n; i++) {
//         span[i] = 1;
//         for (int j = i - 1; j >= 0 && prices[j] <= prices[i]; j--) {
//             span[i]++;
//         }
//     }
//     return span;
// }















// //STOCK SPAN PROBLEM USING STACK
// package zcourse.Stacks;
// import java.util.*;

// public class stack1 {
//     public static void stockspan(int stocks[],int span[]){
//         Stack<Integer> s=new Stack<>();
//         span[0]=1;
//         s.push(0); //push index of first day

//         for(int i=1;i<stocks.length;i++){
//             int currPrice=stocks[i];

//             //pop smaller prices
//             while(!s.isEmpty() && currPrice>stocks[s.peek()]){
//                 s.pop();
//             }

//             //span calculation
//             if(s.isEmpty()){
//                 span[i]=i+1;
//             }else{
//                 int prevHighIndex=s.peek();
//                 span[i]=i-prevHighIndex;
//             }

//             //push current index
//             s.push(i);
//         }
//     }

//     public static void main(String[] args) {
//         int stocks[]={100,80,60,70,60,85,100};
//         int span[]=new int[stocks.length];

//         stockspan( stocks, span);
//         for(int i=0;i<span.length;i++){
//             System.out.println(span[i]+" ");
//         }


//     }
// }
























//next greater element 


// //using brute force for understanding
 
// package zcourse.Stacks;
// public class stack1 {

//     public static int[] wGreater(int[] arr) {
//         int n = arr.length;
//         int[] nge = new int[n];

//         for (int i = 0; i < n; i++) {
//             int next = -1;

//             // Check all elements on the right
//             for (int j = i + 1; j < n; j++) {
//                 if (arr[j] > arr[i]) {
//                     next = arr[j];
//                     break; // stop at first greater
//                 }
//             }

//             nge[i] = next;
//         }

//         return nge;
//     }

//     public static void main(String[] args) {
//         int[] arr = {4, 5, 2, 25};
//         int[] result = nextGreater(arr);

//         for (int x : result) {
//             System.out.print(x + " ");
//         }
//     }
// }


 



// // //next greater element using stack optimised
// import java.util.*;

// public class stack1 {

//     // Function to find Next Greater Element
//     public static int[] nextGreater(int[] arr) {
//         int n = arr.length;
//         int[] nge = new int[n];
//         Stack<Integer> s = new Stack<>();

//         // Traverse from right to left
//         for (int i = n - 1; i >= 0; i--) {

//             // Remove elements smaller or equal to current
//             while (!s.isEmpty() && s.peek() <= arr[i]{
//                 
//                 s.pop();
//             }
 
//             // If stack empty → no greater element
//            

////             // Alternative using if-else for understanding
//              if (s.isEmpty()) {
//                nge[i] = -1;        // no greater element on the right
//                  } else {
//                  nge[i] = s.peek(); // top of stack is next greater element
//                  }


//             // Push current element
//             s.push(arr[i]);
//         }

//         return nge;
//     }

//     public static void main(String[] args) {
//         int[] arr = {6, 8, 0, 1, 3};

//         int[] result = nextGreater(arr);

//         // Print result
//         for (int x : result) {
//             System.out.print(x + " ");
//         }
//     }
// }
