//NOT ARARY BUT PRACTICE QUESTIONS.



// public class arr {
//     public static void countodd(int arr[],int n){
    
//         for(int i=0;i<n;i++){
//             int count =0;
//             for(int j=0;j<n;j++){
//                 if(arr[i]==arr[j]){
//                     count++;
//                 }
//             }
//             if(count % 2 !=0){
//                 System.out.println(arr[i]); 
//             }
//         }

        
//     }
//     public static void main(String[] args) {
//         int arr[]={1,2,2,33,33,4,4};
//         int n=arr.length;
//         countodd(arr,n);
        
//     }

   
    
// }


// import java.util.*;
// public class arr {

//     static class Node {
//         int data;
//         Node next;
//         Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
    
        
//     }

//     public static Node rev(Node head){
//         Node prev=null;
//         Node next;
//         Node curr=head;
//         while(curr!=null){
//             next=curr.next;
//             curr.next=prev;
//             prev=curr;
//             curr=next;
//         }
//         return prev;
//     }
//     public static void main(String[] args) {
//         Node head=new Node(1);
//         head.next=new Node(2);
//         head.next.next=new Node(3);
//         head.next.next.next=new Node(4);
//         head.next.next.next.next=new Node(5);

//         Node newhead=rev(head);
//         Node temp=newhead;
//         while(temp!=null){
//             System.out.print(temp.data+" ");
//             temp=temp.next;
//         }
//     }

// }


//reRearrange the Even-Odd Nodes of Doubly Linked List acc to their pos 
//1 3 5 7 9 11 13 output 3 7 11 1 5 9 13



//   static Node rearrangeList(Node head) {

//         // If list is empty or has only one node, no rearrangement needed
//         if (head == null || head.next == null)
//             return head;

//         // Heads and tails for even and odd position  seperate lists
//         Node evenHead = null, evenTail = null;
//         Node oddHead = null, oddTail = null;

//         // Start traversal from head
//         Node curr = head;

//         // Position counter (head is position 1  odd)
//         int pos = 1;

//         // Traverse the entire doubly linked list
//         while (curr != null) {

//             // Store next node before detaching current
//             Node nextNode = curr.next;

//             // Detach current node from original list
//             curr.next = null;
//             curr.prev = null;

//             // If position is even
//             if (pos % 2 == 0) {

//                 // First even node
//                 if (evenHead == null) {
//                     evenHead = evenTail = curr;
//                 }
//                 // Append to even list
//                 else {
//                     evenTail.next = curr;
//                     curr.prev = evenTail;
//                     evenTail = curr;
//                 }

//             } 
//             // If position is odd
//             else {

//                 // First odd node
//                 if (oddHead == null) {
//                     oddHead = oddTail = curr;
//                 }
//                 // Append to odd list
//                 else {
//                     oddTail.next = curr;
//                     curr.prev = oddTail;
//                     oddTail = curr;
//                 }
//             }

//             // Move to next position and next node
//             pos++;
//             curr = nextNode;
//         }

//         // If there are no even nodes, return odd list
//         if (evenHead == null)
//             return oddHead;

//         // Join even list with odd list
//         evenTail.next = oddHead;
//         oddHead.prev = evenTail;

//         // New head will be evenHead
//         return evenHead;
//     }









    


//swapping nodes in doubly ll
// //this causes issue if x and y are adjacent

// class Result {

//     static class Node {
//         int data;
//         Node prev, next;

//         Node(int data) {
//             this.data = data;
//             this.prev = null;
//             this.next = null;
//         }
//     }

//     static Node swapNodes(Node head, int x, int y) {

//         // If list is empty or values are same, no swap
//         if (head == null || x == y)
//             return head;

//         Node nodeX = null, nodeY = null;
//         Node curr = head;

//         // Step 1: Find nodes with data x and y
//         while (curr != null) {
//             if (curr.data == x)
//                 nodeX = curr;
//             if (curr.data == y)
//                 nodeY = curr;
//             curr = curr.next;
//         }

//         // If either node not found, return original list
//         if (nodeX == null || nodeY == null)
//             return head;

//         // Step 2: Store previous and next nodes
//         Node prevX = nodeX.prev;
//         Node nextX = nodeX.next;

//         Node prevY = nodeY.prev;
//         Node nextY = nodeY.next;

//         // Step 3: Update previous pointers
//         if (prevX != null)
//             prevX.next = nodeY;
//         else
//             head = nodeY;   // nodeX was head

//         if (prevY != null)
//             prevY.next = nodeX;
//         else
//             head = nodeX;   // nodeY was head

//         // Step 4: Update next pointers
//         if (nextX != null)
//             nextX.prev = nodeY;

//         if (nextY != null)
//             nextY.prev = nodeX;

//         // Step 5: Swap prev pointers
//         nodeX.prev = prevY;
//         nodeY.prev = prevX;

//         // Step 6: Swap next pointers
//         nodeX.next = nextY;
//         nodeY.next = nextX;

//         // Step 7: Return updated head
//         return head;
//     }
// }




//way 2/3
// //corrected code for swapping nodes in doubly ll//but still haviing a minute issue for adjacent nodes but workds on testpad.


// Node swapNodes(Node head, int x, int y) {
//   // Write your code here
//     if(x == y || head == null){
//         return head;
//     }
//     Node nodeX= null, nodeY= null, curr=head;
//     while(curr!=null){
//         if(curr.data== x){
//             nodeX= curr;
//         }
//         else if(curr.data == y){
//             nodeY= curr;
//         }
//         if(nodeX!= null && nodeY!= null){
//             break;
//         }
//         curr= curr.next;
//     }
//     if(nodeX == null || nodeY == null){
//         return head;
//     }
//     Node prevX = nodeX.prev;
//     Node nextX = nodeX.next;
//     Node prevY = nodeY.prev;
//     Node nextY = nodeY.next;
    
//     if(prevX!=null){
//         prevX.next= nodeY;
//     }
//     else{
//         head= nodeY;
//     }
    
    
//     if(prevY!=null){
//         prevY.next = nodeX;
//     }
//     else{
//         head= nodeX;
//     }
    
    
//     if(nextX != null){
//         nextX.prev= nodeY;
//     }
//     if(nextY!=null){
//         nextY.prev= nodeX;
//     }
//     Node temp= nodeX.next;
//     nodeX.next= nodeY.next;
//     nodeY.next= temp;

//     temp = nodeX.prev;
//     nodeX.prev= nodeY.prev;
//     nodeY.prev= temp;
//     return head;
// }



//way 3/3
// // completely corrected code for swapping nodes in doubly ll
//longer  as made seperate cases for adjacent nodes
// Node swapNodes(Node head, int x, int y) {

//     // If list empty or values same, no swap
//     if (head == null || x == y)
//         return head;

//     Node nodeX = null, nodeY = null;
//     Node curr = head;

//     // Find nodes x and y
//     while (curr != null) {
//         if (curr.data == x)
//             nodeX = curr;
//         else if (curr.data == y)
//             nodeY = curr;
//         curr = curr.next;
//     }

//     // If either node not found
//     if (nodeX == null || nodeY == null)
//         return head;

//     /* -------- CASE 1: nodeX immediately before nodeY -------- */
//     if (nodeX.next == nodeY) {

//         Node prevX = nodeX.prev;
//         Node nextY = nodeY.next;

//         if (prevX != null)
//             prevX.next = nodeY;
//         else
//             head = nodeY;

//         if (nextY != null)
//             nextY.prev = nodeX;

//         nodeY.prev = prevX;
//         nodeY.next = nodeX;

//         nodeX.prev = nodeY;
//         nodeX.next = nextY;

//         return head;
//     }

//     /* -------- CASE 2: nodeY immediately before nodeX -------- */
//     if (nodeY.next == nodeX) {

//         Node prevY = nodeY.prev;
//         Node nextX = nodeX.next;

//         if (prevY != null)
//             prevY.next = nodeX;
//         else
//             head = nodeX;

//         if (nextX != null)
//             nextX.prev = nodeY;

//         nodeX.prev = prevY;
//         nodeX.next = nodeY;

//         nodeY.prev = nodeX;
//         nodeY.next = nextX;

//         return head;
//     }

//     /* -------- CASE 3: Non-adjacent nodes -------- */

//     Node prevX = nodeX.prev;
//     Node nextX = nodeX.next;
//     Node prevY = nodeY.prev;
//     Node nextY = nodeY.next;

//     if (prevX != null)
//         prevX.next = nodeY;
//     else
//         head = nodeY;

//     if (nextX != null)
//         nextX.prev = nodeY;

//     if (prevY != null)
//         prevY.next = nodeX;
//     else
//         head = nodeX;

//     if (nextY != null)
//         nextY.prev = nodeX;

//     nodeX.prev = prevY;
//     nodeX.next = nextY;

//     nodeY.prev = prevX;
//     nodeY.next = nextX;

//     return head;
// }









// //rotate doubly linked list by k nodes
// public class arr {
//     static class Node {
//         int data;
//         Node next;
//         Node prev;

//         Node(int data) {
//             this.data = data;
//             this.next = null;
//             this.prev = null;
//         }
//     }
//     public static Node head;
//     public static Node rotatebyk(Node head, int k){
//         if(head==null || head.next==null || k==0){
//             return head;
//         }
//         Node curr=head;
//         int length=1;
//         while(  curr.next!=null){
//             curr=curr.next;
//             length++;
//         }
//         k=k%length; 
//         if(k==0){
//             return head;
//         }

//         Node newTail=head;
//         for(int i=1;i<length-k;i++){
//             newTail=newTail.next;
//         }

//         Node newHead=newTail.next;
//         newTail.next=null;

//         newHead.prev=null;

       
//         //connect last to first curr is at last node of old list.
//         curr.next=head;//last node next of old to old head
//         head.prev=curr;//old head prev to last node of old list
//         return newHead;
       
//     }

    
// }



//SWAP 2 NODES IN DOUBLY LINKED LIST
Node swapNodes(Node head, int x, int y) {

    // If list empty or values same, no swap
    if (head == null || x == y)
        return head;

    Node nodeX = null, nodeY = null;
    Node curr = head;

    // Find nodes x and y
    while (curr != null) {
        if (curr.data == x)
            nodeX = curr;
        else if (curr.data == y)
            nodeY = curr;
        curr = curr.next;
    }

    // If either node not found
    if (nodeX == null || nodeY == null)
        return head;

    Node prevX=nodeX.prev;
    Node nextX=nodeX.next;
    Node prevY=nodeY.prev;
    Node nextY=nodeY.next;

    if(prevX!=null){
        prevX.next=nodeY;
    }
    else{
        head=nodeY;
    }


    if(prevY!=null){
        prevY.next=nodeX;
    }
    else{
        head=nodeX;
    }

    if(nextX != null){
        nextX.prev= nodeY;
    }
    if(nextY!=null){
        nextY.prev= nodeX;
    }

    Node temp= nodeX.next;
    nodeX.next= nodeY.next;
    nodeY.next= temp;

    temp = nodeX.prev;
    nodeX.prev= nodeY.prev;
    nodeY.prev= temp;
    return head;

}