// //interleave 2 halves of a queue

// package zcourse.queues;
// import java.util.*;

// public class queue2 {
//     public static void interleaveQueue(Queue<Integer> q) {
//         if (q.size() % 2 != 0) {
//             System.out.println("Queue has odd number of elements, cannot interleave.");
//             return;
//         }

//         Queue<Integer> firstHalf = new LinkedList<>();
//         int halfSize = q.size() / 2;

//         // Step 1: Dequeue first half into firstHalf queue
//         for (int i = 0; i < halfSize; i++) {
//             firstHalf.add(q.remove());
//         }
//first half contains 1 2 3 4. original queue contains 5 6 7 8

//         // Step 2: Interleave the two halves
//         while (!firstHalf.isEmpty()) {
//             q.add(firstHalf.remove()); // Add from first half
//             q.add(q.remove());         // Add from second half
//         }
//     }

//     public static void main(String[] args) {
//         Queue<Integer> q = new LinkedList<>();
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);
//         q.add(6);
//         q.add(7);
//         q.add(8);

//         System.out.println("Original Queue: " + q);
//         interleaveQueue(q);
//         System.out.println("Interleaved Queue: " + q);
//     }
//output:
 // Original Queue: [1, 2, 3, 4, 5, 6, 7, 8]
 // Interleaved Queue: [1, 5, 2, 6, 3, 7, 4, 8]
    
    
// }















//reverse a queue
package queues;
import java.util.*;

public class queue2 {

    public static void reverseQueue(Queue<Integer> q) {
        Stack<Integer> stack = new Stack<>();

        // Step 1: Dequeue all elements from the queue and push them onto the stack
        while (!q.isEmpty()) {
            stack.push(q.remove());
        }

        // Step 2: Pop all elements from the stack and enqueue them back to the queue
        while (!stack.isEmpty()) {
            q.add(stack.pop());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println("Original Queue: " + q);
        // while (!q.isEmpty()) {
        //     System.out.println(q.peek());
        //     q.remove();
        // }




        reverseQueue(q);
        System.out.println("Reversed Queue: " + q);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}