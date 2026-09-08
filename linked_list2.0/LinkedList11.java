//DETECTING A LOOP/CYCLE IN A LINKED LIST
// public class LinkedList11 {
//     static class Node{
//         int data;
//         Node next;
//         Node(int data){
//             this.data=data;
//             this.next=null;
//         }
//     }
//     public static boolean isCycle(Node head){
//         Node slow=head;
//         Node fast=head;
//         while(fast!=null && fast.next!=null){
//             slow=slow.next;
//             fast=fast.next.next;
//             if(slow==fast){
//                 return true;
//             }
//         }
//         return false;
//     }









// //REMOVE CYCLE IN A LINKED LIST
    
// // public static void removeCycle(Node head){
// //     Node slow=head;
// //     Node fast=head;
// //     boolean cycle=false;
// //     while(fast!=null && fast.next!=null){
// //         slow=slow.next;
// //         fast=fast.next.next;
// //         if(slow==fast){
// //             cycle=true;
// //             break;//here we did break we want to preserve the position of slow and fast when they met.
// //         }
// //     }
// //     if(cycle==false){//no cycle
// //         return;
// //     }

// //     //IF CYCLE IS PRESENT
// //     slow=head;
// //     Node prev=null; //to keep track of the node before fast
// //     while(slow!=fast){
// //         prev=fast;
// //         slow=slow.next;
// //         fast=fast.next;
// //     }
//  //  // after the loop prev k andr last node ka address hoga jo cycle ko point kar raha tha
// //     prev.next=null; //removing the cycle 
// // }

//     public static void main(String args[]){
//         Node head=new Node(1);
//         head.next=new Node(2);
//         head.next.next=new Node(3);
//         head.next.next.next=new Node(4);
//         head.next.next.next.next=head.next; //creating a cycle here
//         System.out.println(isCycle(head)); //true

        
//         //removeCycle(head);
//         //System.out.println(isCycle(head)); //false

//     }
    
// }

















// //java colleections framework

// import java.util.Collection;
// import java.util.Collections;

// public class LinkedList11 {

//     public static void main(String[] args) {
//         //LinkedList<Integer> list=new LinkedList<>();
//         //both work same  i can wrigte 2nd if  u did not import 
//         java.util.LinkedList<Integer> list=new java.util.LinkedList<>();
//         list.addLast(1);
//         list.addLast(2);
//         list.addLast(3);
//         System.out.println(list);//[1, 2, 3]
//         for (int x : list) {
//             System.out.print(x + " ");// 1 2 3 
//             }
//         System.out.println();

//         list.addFirst(0);
//         System.out.println(list);//[0, 1, 2, 3]

//         list.removeLast();
//         System.out.println(list);//[0, 1, 2]

//         list.removeFirst();
//         System.out.println(list);//[1, 2]

//         System.out.println(list.getFirst());//1
//         System.out.println(list.getLast());//2
//         System.out.println(list.get(0));//1
//         System.out.println(list.get(1));//2


//         list.clear();
//         list.addFirst(1);
//         list.addLast(2);
//         list.addLast(3);
//         list.addLast(4);
//         //list.reverse();
//         Collections.reverse(list);
//         System.out.println(list);//[4, 3, 2, 1]

//         Collections.sort(list);
//         System.out.println(list);//[1, 2, 3, 4]
///// TO PRINT IN OTHER WAY RATHER THEN THIS ARRAY WAY.... WE NEED TO USE LOOP
//// WRITTEN BELOW IN MERGE QUES
        
//     }


// }








//by jcf we get inbuilt fxns like addFirst , addLast , addAtIndex,
// removeFirst , removeLast ,removeAtIndex, removeNthFromEnd,  printList,    
//search(int key),  recursiveSearch(Node head,int key).
// size() ,   reverse,  findMiddle(), isPalindrome(), isCycle(), removeCycle(),..




//for advaced linked list problems
//merge(Node head1,Node head2), Node mergeSort(Node head),  zigZag(), swapPairs(Node head),  cloneLinkedList(Node head), reverseKGroup(Node head, int k),..
//Convert to Array= int[] toArray(),  Convert to Linked List= Node toLinkedList(int[] arr),..
// to empty the linked list = clear() ,..
   

















// //merge sorted on linked lists

//// use direct java collections framework -- Collections.sort(list); or actual method-- below



  
// class Node {
//     int data;
//     Node next;
//     Node(int d) {
//         data = d;
//         next = null;
//     }
// }
// //WE CAN WRITE THIS IS LINKLIST11 CLASS ALSO BUT WITH STATIC KEYWORD

// class LinkedList11 {

//     // MAIN MERGE SORT FUNCTION
//     public Node mergeSort(Node head) {
//         if (head == null || head.next == null) {
//             return head;  // already sorted if 0 or 1 node
//         }

//         // 1️⃣ Split list into two halves
//         Node mid = getMid(head);
//         Node rightHead = mid.next;
//         mid.next = null; // IMPORTANT: break into 2 lists

//         // 2️⃣ Sort each half
//         Node left = mergeSort(head);//left half
//         Node right = mergeSort(rightHead);//right half

//         // 3️⃣ Merge sorted halves
//         return merge(left, right);
//     }



//understanding merge sort

 //dry run of merge sortat steo 2 written above
// mergeSort(4 2 1 3)
//  ├─ mergeSort(4 2)
//  │   ├─ mergeSort(4)
//  │   │   → base case → return 4
//  │   ├─ mergeSort(2)
//  │   │   → base case → return 2
//  │   └─ merge(4, 2) → returns 2 4
//  │
//  ├─ mergeSort(1 3)
//  │   ├─ mergeSort(1)
//  │   │   → base case → return 1
//  │   ├─ mergeSort(3)
//  │   │   → base case → return 3
//  │   └─ merge(1, 3) → returns 1 3
//  │
//  └─ merge(2 4, 1 3) → returns 1 2 3 4








//     // MID FINDER
//     private Node getMid(Node head) {
//         Node slow = head, fast = head.next;

//// we did head.next as we want mid to be at 1st half end .. and when we want to break kit we would be able to break ll in 2 peaces by mid.next=null;

//         while (fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;
//         }
//         return slow;
//     }

//     // MERGE TWO SORTED LL
//     private Node merge(Node a, Node b) {
//         Node dummy = new Node(-1);
//         Node temp = dummy;//temp=tail..acc to gpt here

//         while (a != null && b != null) {
//             if (a.data <= b.data) {
//                 temp.next = a;
//                 a = a.next;
//             } else {
//                 temp.next = b;
//                 b = b.next;
//             }
//             temp = temp.next;
//         }

//         // Attach remaining part
//         temp.next = (a != null) ? a : b;

//         return dummy.next;
//     }
    
//     // PRINT LL
//     public void printList(Node head) {
//         Node curr = head;
//         while (curr != null) {
//             System.out.print(curr.data + " ");
//             curr = curr.next;
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         LinkedList11 list = new LinkedList11();
//         Node head = new Node(4);
//         head.next = new Node(2);
//         head.next.next = new Node(1);
//         head.next.next.next = new Node(3);

//         System.out.println("Original List:");
//         list.printList(head);

//         head = list.mergeSort(head);

//         System.out.println("Sorted List:");
//         list.printList(head);
//     }
// }








// //using jcf
import java.util.*;


public class LinkedList11 {
    public static void main(String[] args) {

        java.util.LinkedList<Integer> l1 = new java.util.LinkedList<>(Arrays.asList(1, 3, 5));
        java.util.LinkedList<Integer> l2 = new java.util.LinkedList<>(Arrays.asList(2, 4, 6));

        l1.addAll(l2);            // merge
        Collections.sort(l1);     // merge sort internally

        System.out.println(l1);   // [1, 2, 3, 4, 5, 6]
        for (int x:l1){
            System.out.print(x+"-> ");//1-> 2-> 3-> 4-> 5-> 6-> 
        }

        //TO EAT SPACE
        System.out.println();


        //OTHER WAY
        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i));
        if (i < l1.size() - 1) {
           System.out.print("-> ");//1-> 2-> 3-> 4-> 5-> 6
                                    // RATHER THEN 1-> 2-> 3-> 4-> 5-> 6->
        }
        }

    }
}
