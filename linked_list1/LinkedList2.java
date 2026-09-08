// //remove firsrt in linked list

// public class LinkedList2 {

//     public static class   Node{
//         int data;
//         Node next;//refrence variable that points to nextvariable

//         public Node(int data){ //constructor
//             this.data=data;
//             this.next=null;
//         }
//     }
//     public static Node head;
//     public static Node tail;
//     public static int size;//0
//     //need not to write static because we r inside the class

//     //adding at first and making new head
//     public void addFirst(int data){
//         //step1-create new node
//         Node newNode=new Node(data);
//         size++;
//         if(head==null){//if linked list is empty
//             head=tail=newNode;
//             return;
//         }
//         //step2-newNo de ka next=head  (jo pehle tha)
//         newNode.next=head;//link
//         //step3-head=newNode
//         head=newNode;
//     }

//     //adding at last and making new tail
//     public void addLast(int data){
//         Node newNode=new Node(data);
//         size++;
//         if(head==null){//if linked list is empty
//             head=tail=newNode;
//             return;
//         }
//         tail.next=newNode;//link
//         tail=newNode;//update tail
//     }

//     //removing first node
//     public int removeFirst(){
//         //base case
//         if(size==0){
//             System.out.println("linked list is empty");
//             return Integer.MIN_VALUE;
//         }
//         else if(size==1){
//             int val=head.data;
//             //head=tail=null;
//             //or
//             head=null;
//             tail=null;
//             size=0;
//             return val;
//         }

//         //main operation

//         int val=head.data;//jo value delete karni hai uska data store karlo
//         head=head.next;
//         size--;
//         return val;
//     }

//     //remove last node
//     public int removeLast(){
//         //base case
//         if(size==0){
//             System.out.println("linked list is empty");
//             return Integer.MIN_VALUE;
//         }
//         else if(size==1){
//             int val=head.data;
//             head=tail=null;
//             size=0;
//             return val;
//         }

//         //main operation
//         //find second last node
//         Node prev=head;
//         for(int i=0;i<size-2;i++){
//             prev=prev.next;
//         }
//         int val=tail.data;
//         //tail=prev.data;
//         prev.next=null;
//         tail=prev;
//         size--;
//         return val;
//     }

//     //for printing the linked list

//     public void print(){
//         Node temp=head;
//         while(temp!=null){
//             System.out.print(temp.data+"->");
//             temp=temp.next;
//         }
//         System.out.println("null");
//     }

//     public static void main(String[] args) {
//         LinkedList2 ll=new LinkedList2();
//         // ll.head=new Node(1);
//         // ll.head.next=new Node(2);
//         //we cant do all this on main so we make methods in ll class

//         ll.addFirst(2);//sabse pehle call hoga ye or empty ll mai 2 dal dega
//         ll.addFirst(1);////pehle 2 ke aage 1 add karega
//         ll.addLast(3);//last mai 3 add karega
//         ll.addLast(4);//last mai 4 add karega

//         //print ll
//         ll.print();

//         System.out.println("removed "+ll.removeFirst());
//         ll.print();
//     }

// }





























// //search iterative  [linear search]
// public class LinkedList2 {

//     public static class   Node{
//         int data;
//         Node next;//refrence variable that points to nextvariable

//         public Node(int data){ //constructor
//             this.data=data;
//             this.next=null;
//         }
//     }
//     public static Node head;
//     public static Node tail;
//     public static int size;//0
//     //need not to write static because we r inside the class

//     //search iterative
//     public int search(int key){
//         Node temp=head;
//         int i=0;
//         while(temp!=null){
//             if(temp.data==key){
//                 return i;
//             }
//             temp=temp.next;
//             i++;
//         }
//         return -1;//key not found
//     }
//     public static void main(String[] args) {
//         LinkedList2 ll=new LinkedList2();
//         ll.head=new Node(1);
//         ll.head.next=new Node(2);
//         ll.head.next.next=new Node(3);
//         ll.head.next.next.next=new Node(4);

//         System.out.println(ll.search(3));
//         System.out.println(ll.search(10));
//     }
// }





// //reverse a linked list
// public class LinkedList2 {

//     public static class   Node{
//         int data;
//         Node next;//refrence variable that points to nextvariable

//         public Node(int data){ //constructor
//             this.data=data;
//             this.next=null;
//         }
//     }
//     public static Node head;
//     public static Node tail;
//     public static int size;//0
//     //need not to write static because we r inside the class

//     //reverse linked list
//     public void reverse(){
//         Node prev=null;
//         //Node curr=tail=head;
//         Node curr=head;
//         Node tail=head;
//         Node next;

//         while(curr!=null){
//             //next node store
//             next=curr.next;
//             //link change
//             curr.next=prev;
//             //update
//             prev=curr;
//             curr=next;
//         }
//         head=prev;
//     }
//     public void print(){
//         Node temp=head;
//         while(temp!=null){
//             System.out.print(temp.data+"->");
//             temp=temp.next;
//         }
//         System.out.println("null");
//     }
//     public static void main(String[] args) {
//         LinkedList2 ll=new LinkedList2();
//         ll.head=new Node(1);
//         ll.head.next=new Node(2);
//         ll.head.next.next=new Node(3);
//         ll.head.next.next.next=new Node(4);

//         ll.print();
//         ll.reverse();
//         ll.print();
//     }
// }





// //find and remove nth node from end
// public class LinkedList2 {

//     public static class   Node{
//         int data;
//         Node next;//refrence variable that points to nextvariable

//         public Node(int data){ //constructor
//             this.data=data;
//             this.next=null;
//         }
//     }
//     public static Node head;
//     public static Node tail;
//     public static int size;//0
//     //need not to write static because we r inside the class

//     //find and remove nth node from end
//     public void removeNthFromEnd(int n){
//         //size-n th node from start
//         int size=0;
//         Node temp=head;
//         while(temp!=null){
//             temp=temp.next;
//             size++;
//         }
//         //this was for calculating size

//         if(n==size){//if we have to remove head
//             head=head.next;
//             return;
//         }

//         //for other nodes size-n th node
//         int i=1;
//         int idx=size-n;
//         Node prev=head;
//         while(i<idx){
//             prev=prev.next;
//             i++;
//         }
//         prev.next=prev.next.next;
//         return;
//     }
//     public void print(){
//         Node temp=head;
//         while(temp!=null){
//             System.out.print(temp.data+"->");
//             temp=temp.next;
//         }
//         System.out.println("null");
//     }
//     public static void main(String[] args) {
//         LinkedList2 ll=new LinkedList2();
//         ll.head=new Node(1);
//         ll.head.next=new Node(2);
//         ll.head.next.next=new Node(3);
//         ll.head.next.next.next=new Node(4);
//         ll.head.next.next.next.next=new Node(5);

//         ll.print();
//         ll.removeNthFromEnd(2);
//         ll.print();
//     } 
// }
















//check if linked list is palindrome 1st approach

// public class LinkedList2 {
//     public static class ListNode {
//         int val;
//         ListNode next;

//         public ListNode(int val) {
//             this.val = val;
//             this.next = null;
//         }
//     }

//     public boolean isPalindrome(ListNode head) {
//         // Step 1: Put all values in array
//         java.util.ArrayList<Integer> arr = new java.util.ArrayList<>();
//         ListNode curr = head;

//         while (curr != null) {
//             arr.add(curr.val);
//             curr = curr.next;
//         }

//         // Step 2: Use two pointers to check palindrome
//         int i = 0;
//         int j = arr.size() - 1;

//         while (i < j) {
//             if ( !arr.get(i).equals(arr.get(j))) {
//                 return false; // mismatch
//             }
//             i++;
//             j--;
//         }

//         return true; // all matched

//     }

//     public static void main(String[] args) {
//         LinkedList2 ll = new LinkedList2();
//         ListNode head = new ListNode(1);
//         head.next = new ListNode(2);
//         head.next.next = new ListNode(2);
//         head.next.next.next = new ListNode(1);
//         System.out.println(ll.isPalindrome(head));

//     }

// }












//second approach for palindrome using reverse of 2nd half and comparing both halves

public class LinkedList2 {

    public static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
    public boolean isPalindrome(ListNode head) {
        //base case
        if (head == null || head.next == null) {
            return true; // empty list or single node is palindrome
        }

        // Step 1: Find middle using slow and fast pointers
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        //slow is mid node

        // Step 2: Reverse second half
        ListNode prev = null;
        ListNode curr = slow;
        ListNode next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Step 3: Compare both halves
        ListNode left = head;
        ListNode right = prev; // head of reversed second half

        while (right != null) {
            if (left.val != right.val) {
                return false; // mismatch
            }
            left = left.next;
            right = right.next;
        }

        return true; // all matched
    }
    public static void main(String[] args) {
        LinkedList2 ll = new LinkedList2();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        System.out.println(ll.isPalindrome(head));

    }
}

