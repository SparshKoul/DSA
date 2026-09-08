// //zig zag linked list
// public class LinkedList12 {
//     static class Node{
//         int data;
//         Node next;
//         Node(int data){
//             this.data=data;
//             this.next=null;
//         }
//     }

//     public static Node zigZag(Node head){
//         //find mid
//         Node slow=head;
//         Node fast=head.next;
//         while(fast!=null && fast.next!=null){
//             slow=slow.next;
//             fast=fast.next.next;
//         }
//         Node mid=slow;

//         //reverse second half
//         Node curr=mid.next;
//         mid.next=null;//break ll into 2 peaces
//         Node prev=null;
//         Node next;

//         while(curr!=null){
//             next=curr.next;
//             curr.next=prev;
//             prev=curr;
//             curr=next;
//         }

//         //alternate merge [zig zag merge]
//         Node left=head;
//         Node right=prev;
//         Node nextL, nextR;//STORES VALUE OF NEXT NODES

//         while(left!=null && right!=null){
//             nextL=left.next;
//             nextR=right.next;

//             left.next=right;
//             right.next=nextL;

//             left=nextL;
//             right=nextR;
//         }
//         return head;
//     }
//     public static void printList(Node head){
//         Node temp=head;
//         while(temp!=null){
//             System.out.print(temp.data+" ");
//             temp=temp.next;
//         }
//         System.out.println();

    
// }
//    public static void main(String[] args) {
//         LinkedList12 list=new LinkedList12();
//         Node head=new Node(1);
//         head.next=new Node(2);
//         head.next.next=new Node(3);
//         head.next.next.next=new Node(4);
//         head.next.next.next.next=new Node(5);
//         head.next.next.next.next.next=new Node(6);

//         System.out.println("Original List:");
//         printList(head);

//         head=zigZag(head);

//         System.out.println("ZigZag List:");
//         printList(head);
//     }
// }   













































//============================================================//
//======================DOUBLY LINKED LIST====================//
//============================================================//



//doubly linked list

// public class LinkedList12 {

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
//     public static Node tail;
//     public int size;


//     // INSERT AT HEAD
//     public Node insertAtHead(Node head, int data) {
//         Node newNode = new Node(data);
//         if (head == null) {
//             return newNode;
//         }
//         newNode.next = head;
//         head.prev = newNode;
//         head=newNode;
//         return newNode;  
//     }
//     // INSERT AT TAIL
//     public Node insertAtTail(Node head, int data) {
//         Node newNode = new Node(data);
//         // Case 1: Empty List
//     if (head == null) {
//         head = tail = newNode;
//         return head;
//     }

//     // Case 2: Non-empty list
//     tail.next = newNode;   // connect old tail → newNode
//     newNode.prev = tail;   // connect newNode → old tail
//     tail = newNode;        // update tail


//     return head;
// }


//// ========== ADD AT INDEX ==========
//    public void addAtIndex(int index, int data) {
//        if (index == 0) {
//            addFirst(data);
//            return;
//        }
//        if (index == size) {
//            addLast(data);
//            return;
//        }
//
//        Node newNode = new Node(data);
//        Node temp = head;     
//
//        for (int i = 0; i < index - 1; i++) {
//            temp = temp.next;
//        }
//
//        newNode.next = temp.next;
//        newNode.prev = temp;
//        temp.next.prev = newNode;
//        temp.next = newNode;
//
//        size++;
//    }


//     //remove first
//     public Node removeFirst(Node head) {
//         if (head == null) {
//             return null; // List is empty
//         }
//         if (head.next == null) {
//             return null; // List has only one node
//         }
//         head = head.next; // Move head to the next node
//         head.prev = null; // Set the previous of new head to null
//         return head;
//     }



//     //remove last
//     public Node removeLast(Node head) {
//         if (head == null) {
//             return null; // List is empty
//         }
//         if (head.next == null) {
//             return null; // List has only one node
//         }
//         Node temp = head;
//         while (temp.next != null) {
//             temp = temp.next; // Traverse to the last node   TEMP =TAIL
//         }
//         temp.prev.next = null; // Remove the last node   TEMP.PREV= SECOND LAST....TEMP.PREV.NEXT=ARROW.
//         return head;
//     }

//     //remove at a given index
//     public Node removeAtIndex(Node head, int index) {
//         if (head == null || index < 0) {
//             return head; // List is empty or invalid index
//         }
//         if (index == 0) {
//             return removeFirst(head); // Remove first node
//         }
//         Node curr = head;
//         for (int i = 0; i < index; i++) {
//             if (curr == null) {
//                 return head; // Index out of bounds
//             }
//             curr = curr.next;
//         }
//         if (curr == null) {
//             return head; // Index out of bounds
//         }
//         if (curr.next != null) {
//             curr.next.prev = curr.prev; // Bypass current node
//         }
//         
//             curr.prev.next = curr.next; // Bypass current node
//         
//         return head;
//     }


//     // PRINT DOUBLY LINKED LIST
//     public void printList(Node head) {
//         Node curr = head;
//         while (curr != null) {
//             System.out.print(curr.data + " ");
//             curr = curr.next;
//         }
//         System.out.println();
//     }
//     public static void main(String[] args) {
//         LinkedList12 list = new LinkedList12();
//         Node head = null;

//         head = list.insertAtHead(head, 10);
//         head = list.insertAtHead(head, 20);
//         head = list.insertAtTail(head, 30);
//         head = list.insertAtTail(head, 40);

//         System.out.println("Doubly Linked List:");
//         list.printList(head);
//         head = list.removeFirst(head);
//         System.out.println("After removing first:");
//         list.printList(head);
//         head = list.removeLast(head);
//         System.out.println("After removing last:");
//         list.printList(head);
        
//     }
// }























//reverse a doubly linked list
public class LinkedList12 {

    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node reverseDoublyLinkedList(Node head) {
        Node curr = head;
        Node prev = null;//prev=temp variable to store previous
        Node next;   

        while (curr != null) {
            next = curr.next; // Store next node
            curr.next = prev; // Reverse next pointer
            curr.prev = next; // Reverse prev pointer
            prev = curr;      // Move prev to current node
            curr = next;     // Move to next node
        }
        return prev; // New head of the reversed list
    }
    public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }   
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.prev = head;
        head.next.next = new Node(30);
        head.next.next.prev = head.next;
        head.next.next.next = new Node(40);
        head.next.next.next.prev = head.next.next;

        System.out.println("Original Doubly Linked List:");
        printList(head);

        head = reverseDoublyLinkedList(head);

        System.out.println("Reversed Doubly Linked List:");
        printList(head);
    }   
}
    