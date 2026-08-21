

// //by array implementation of queue- size is fixed
// package zcourse.queues;

// public class queue1 {
//     static class Queue{
//         static int arr[];
//         static int size;
//         static int rear;

//         Queue(int n){
//             arr = new int[n];
//             size = n;
//             rear = -1;//we dont knoe where rear is...so we initialize it to -1 and then increment it when we add elements
//             // means "no element in queue"
            
//         }


//         //isempty
//         public boolean isEmpty(){
//             return rear== -1 ;//if rear is -1 then queue is empty return true
//         }

//         //enqueue
//         public void add(int data){
//             if(rear == size - 1){
//                 System.out.println("Queue is full");
//                 return;
//             }
//             rear++;//increment rear earier it was -1 means no element now it will be 0 means first element will be added at index 0
//             arr[rear] = data;
            
//         }

//         //dequeue
//         public int remove(){
//             if(isEmpty()){
//                 System.out.println("Queue is empty");
//                 return -1;
//             }
            

//             int front=arr[0];
//             for(int i=0;i<rear;i++){
//                 arr[i]=arr[i+1];
//             }
//             rear--;//shifting is done so decrement rear
//             return front;//jo pehle element tha wo return kar do font=arr[0]

//         }

//         //peek
//         public int peek(){
//             if(isEmpty()){
//                 System.out.println("Queue is empty");
//                 return -1;
//             }
//             return arr[0];
//         }
//     }

//     public static void main(String[] args) {
//         Queue q = new Queue(5);
//         q.add(10);
//         q.add(20);
//         q.add(30);
//         //System.out.println(q.peek()); // 10
//         //System.out.println(q.remove()); // 10
//         //System.out.println(q.peek()); // 20
//         while (!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove();
            
//         }
//     }
    
// }












// //queue using linked list- size is dynamic
// package zcourse.queues;
// public class queue1 {

//     static class Node{
//         int data;
//         Node next;

//         Node(int data){
//             this.data=data;
//             this.next=null;
//         }
//     }

//     static class Queue{
//         static Node head = null;
//         static Node tail = null;

//         //isempty
//         public boolean isEmpty(){
//             return head==null && tail==null;
//         }

//         //enqueue
//         public void add(int data){
//             Node newNode = new Node(data);
//             if(head==null){
//                 head=tail=newNode;
//                 return;
//             }
//             tail.next=newNode;
//             tail=newNode;
//         }

//         //dequeue
//         public int remove(){
//             if(isEmpty()){
//                 System.out.println("Queue is empty");
//                 return -1;
//             }
//             int front = head.data;
//             //if only one element is present
//             if(tail==head){
//                 head=tail=null;
//             }else{
//                 head=head.next;
//             }
//             return front;
//         }

//         //peek
//         public int peek(){
//             if(isEmpty()){
//                 System.out.println("Queue is empty");
//                 return -1;
//             }
//             return head.data;
//         }
//     }

//     public static void main(String[] args) {
//         Queue q = new Queue();
//         q.add(10);
//         q.add(20);
//         q.add(30);
//         while (!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove();
            
//         }
//     }
// }






// //using java collections framework
// package zcourse.queues;
// import java.util.*;

// public class queue1 {

//     public static void main(String[] args) {
//         Queue <Integer> q = new LinkedList<>();
//         // or // Queue<Integer> p = new ArrayDeque<>();
//         // as jcf me linkedlist or arraydeque dono queue implement karte hai
//         q.add(10);
//         q.add(20);
//         q.add(30);
//         while (!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove();
            
//         }
//     }
    
    
// }








// //queue using 2 stacks
// package zcourse.queues;
// import java.util.*;

// public class queue1 {

//     static class Queue{
//         static Stack<Integer> s1 = new Stack<>();
//         static Stack<Integer> s2 = new Stack<>();

//         //isempty
//         public boolean isEmpty(){
//             return s1.isEmpty();
//         }

//         //enqueue
//         public void add(int data){
//             while (!s1.isEmpty()) {
//                     s2.push(s1.pop());
//             }
//             s1.push(data);

//             while (!s2.isEmpty()) {
//                 s1.push(s2.pop());
//             }
            
//         }

//         //dequeue
//         public int remove(){
//             if(isEmpty()){//s1
//                 System.out.println("Queue is empty");
//                 return -1;
//             }
            
//             return s1.pop();
//         }

//         //peek
//         public int peek(){
//             if(isEmpty()){
//                 System.out.println("Queue is empty");
//                 return -1;
//             }
//             return s1.peek();
//         }
//     }
//     public static void main(String[] args) {
//         Queue q = new Queue();
//         q.add(10);
//         q.add(20);
//         q.add(30);
//         while (!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove();
            
//         }
//     }
// }






//first non repeating character in a stream;
package queues;
import java.util.*;
public class queue1 {

        public static void firstNonRepeating(String stream) {
            int freq[] = new int[26];
            Queue<Character> q = new LinkedList<>();
            for (int i = 0; i < stream.length(); i++) {
                char ch = stream.charAt(i);
                // increase frequency
                freq[ch - 'a']++;

                // add to queue
                q.add(ch);

                // remove all repeating characters from the front of the queue
                while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
                    q.remove();
                }

                // print first non-repeating character
                if (!q.isEmpty()) {
                    System.out.print(q.peek() + " ");
                } else {
                    System.out.print(-1 + " ");
                }
            }
    }
    public static void main(String[] args) {
        String stream = "aabccxb"; //output:  a -1 b b b b x
        firstNonRepeating(stream);
    }
}