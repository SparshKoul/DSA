// import java.util.*;


// public class practice {

//     public static class Node {
//         int data;
//         Node next;

//         public Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     } 







//     public static Node head;//these all are just refrence variables we can name them anything x,y,z...
//     public static Node tail;
//     public static int size;

//     // add at beginning
//     public void addfirst(int data) { 
//         Node newNode = new Node(data);

//         if (head == null) {
//             head = tail = newNode;
//             size++; // increment when first node is added
//             return;
//         }

//         newNode.next = head;
//         head = newNode;
//         size++;
//     }

//     // add at end
//     public void addlast(int data) {
//         Node newNode = new Node(data);
//         if (head == null) {
//             head = tail = newNode;
//             size++; // increment when first node is added
//             return;
//         }
//         tail.next = newNode;
//         tail = newNode;
//         size++;
//     }

//     // add in middle at index (0-based). If index == 0 -> addfirst. If index >= size -> addlast.
//     public void addinmiddle(int index, int data) {
//         if (index = 0) {
//             addfirst(data);
//             return;
//         } 
//         else if (index = size) {
//             addlast(data);
//             return;
//         }
//          else if(index < 0 || index > size) {
//              System.out.println("Invalid index");
//              return;
//            }

//         Node newNode = new Node(data);
//         Node temp = head;
//         int i = 0;
//         while (i < index - 1) {
//             temp = temp.next;
//             i++;
//         }
////         always remember-first save the next linnk,theb break/change the links.
///     
//         newNode.next = temp.next;//  new node ke next ko pt kro at temp.next p
//         temp.next = newNode;     // change the arrow of temp to newNode
//         size++;
//     }

//     //remove from beginning
//     public int  removefirst(){
//         if(head==null){//size=0
//             System.out.println("ll is empty");
//             return -1;
//         }

//         int variable=head.data;
//         if(head==tail){//single node size=1
//             head=tail=null;
           
//         }
//         else{
//             head=head.next;//give title of head to next node..
//         }
//         size--;
//         return variable;
//     }



//     //remove from last
//     public int removelast(){
//         if(head==null){//size=0
//             System.out.println("ll is empty");
//             return -1;
//         }

//         int variable=tail.data;
//         if(head==tail){//single node size=1
//             head=tail=null;
           
//         }
//         else{
//             Node temp=head;//for traversing
//             while(temp.next!=tail){//if we do ==null then we will reach  to tail but we need to stop one node before tail...
//                 temp=temp.next;
//             }
//             temp.next=null;
//             tail=temp;
//         }
//         size--;
//         return variable;
//     }




//     //remove from middle at index

//     public int removeinmiddle(int index) {
//         if (head == null) {
//             System.out.println("ll is empty");
//             return -1;
//         }
//         if (index < 0 || index >= size) {
//             System.out.println("Invalid index");
//             return -1;
//         }
//         if (index == 0) {
//             return removefirst();
//         }
//         if (index == size - 1) {
//             return removelast();
//         }

//         Node temp = head;
//         int i = 0;
//         while (i < index - 1) {
//             temp = temp.next;
//             i++;
//         }
//         int variable = temp.next.data;//JO NODE DELETE HOGA USKA DATA STORE KARLIYA
//         temp.next = temp.next.next;
//         size--;
//         return variable;
//     }

    






//     // printing
//     public void printfxn() {
//         if (head == null) {
//             System.out.println("ll is empty");
//             return;
//         }

//         Node temp = head;
//         while (temp != null) {
//             System.out.print(temp.data + " -> ");
//             temp = temp.next;
//         }
//         System.out.println("null");
//     }


//     //make fxn for size as well... we can use direcylt     .size as well we have used in main fxn as well

//     public int size() {
//         return size;
//     }




//     //searching an element fxn
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
//         practice ll = new practice();
//         //ll.head=new Node (1);
// 		//ll.head.next= new Node(2);

//         ll.addfirst(2);
//         ll.addfirst(1);
//         ll.addlast(3);
//         ll.addlast(4);
//         ll.addinmiddle(2, 9);

//         // printing
//         ll.printfxn();          // fixed method name
//         System.out.println("size of linked list is: " + size);



//         // remove first
//         int removed = ll.removefirst();
//         System.out.println("\nremoveFirst() returned: " + removed);
//         System.out.print("After removeFirst: ");
//         ll.printfxn();
//         System.out.println("size: " + ll.size());

//         // remove last
//         removed = ll.removelast();
//         System.out.println("\nremoveLast() returned: " + removed);
//         System.out.print("After removeLast: ");
//         ll.printfxn();
//         System.out.println("size: " + ll.size());

//         // remove at index 1
//         removed = ll.removeinmiddle(1);
//         System.out.println("\nremoveAtIndex(1) returned: " + removed);
//         System.out.print("After removeAtIndex(1): ");
//         ll.printfxn();
//         System.out.println("size: " + ll.size());



//         // searching for an element
//         int key = 9;
//         int index = ll.search(key);
//         if (index != -1) {
//             System.out.println("\nElement " + key + " found at index: " + index);
//         } else {
//             System.out.println("\nElement " + key + " not found in the list.");
//         }

//         //other way to call search

//         System.out.println(ll.search(3));
//         System.out.println(ll.search(10));





//     }
   


// }


































//REVERSE A LINKED LIST
// public class practice {

//     class Node {
//         int data;
//         Node next;

//         public Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }
//     public  Node head;
//     public  Node tail;
//     public  int size;



//     //reverse a linked list 
//     public void reverse(){
//         Node prev=null;
//         Node curr= head;
//         Node next;

//         while (curr != null) {
//             next = curr.next;    // store next
//             curr.next = prev;    // reverse
//             prev = curr;         // move prev FORWWARD
//             curr = next;         // move curr FORWARD
//         }

//         // swap head & tail
//         tail = head;
//         head = prev;
    
//     }




//     // printing
//     // PRINT LIST
//     public void printList() {
//         if (head == null) {
//             System.out.println("List is empty");
//             return;
//         }

//         Node temp = head;
//         while (temp != null) {
//             System.out.print(temp.data + " -> ");
//             temp = temp.next;
//         }
//         System.out.println("null");
//     }




//     public static void main(String[] args) {
//         practice ll = new practice();
//         ll.head=ll.new Node (1);
//         ll.head.next= ll.new Node(2);
//         ll.head.next.next= ll.new Node(3);
//         ll.head.next.next.next=ll. new Node(4);
//         System.out.println("Original List:");
//         ll.printList();
//         ll.reverse();
//         System.out.println("Reversed List:");
//         ll.printList();

//     }





// }





//FIND AND REMOVE THE NTH NODE FROM THE END OF THE LINKED LIST
// public class practice {

//     public static class Node{
//         int data;
//         Node next;
        
//         Node(int data){
//             this.data=data;
//             this.next=null;
//         }
//     }

//         public Node head;
//         public Node tail;

//         //remove nth node from end= size-n+1 from start
//         public void removeNthFromEnd(int n){
//             //approach 1: size find krke fir size-n+1 th node remove krdo
//             int size=0;
//             Node temp=head;

//             while(temp!=null){
//                 size++;
//                 temp=temp.next;
//             }

//             if(n>size || n<=0 || head==null){
//                 System.out.println("Invalid n");
//                 return;
//             }
//             int indexFromStart=size-n+1;

//             //from start remove krne ka code
//             if(indexFromStart==1){
//                 head=head.next;
//                 return;
//             }

//             Node prev=head;
//             for(int i=1;i<indexFromStart-1;i++){
//                 prev=prev.next;
//             }

//             prev.next=prev.next.next;

        
        

//     }
//     public static void main(String[] args) {
//         practice ll=new practice();
//         ll.head=new Node(1);
//         ll.head.next=new Node(2);
//         ll.head.next.next=new Node(3);
//         ll.head.next.next.next=new Node(4);
//         ll.head.next.next.next.next=new Node(5);
//         int n=2;
//         ll.removeNthFromEnd(n);
//         Node temp=ll.head;
//         while(temp!=null){
//             System.out.print(temp.data+"->");
//             temp=temp.next;
//         }
//         System.out.println("null");

//     }
// }














//find and replace nth node from end of linked list
// public class practice {

//     // Node class
//     static class Node {
//         int data;
//         Node next;

//         Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     Node head;

//     // Replace nth node from end with x
//     public void replaceNthFromEnd(int n, int x) {

//         if (head == null || n <= 0) {
//             System.out.println("Invalid n");
//             return;
//         }

//         // Step 1: find size
//         int size = 0;
//         Node temp = head;
//         while (temp != null) {
//             size++;
//             temp = temp.next;
//         }

//         if (n > size) {
//             System.out.println("Invalid n");
//             return;
//         }

//         // Step 2: find index from start
//         int indexFromStart = size - n + 1;

//         // Step 3: go to that node
//         Node curr = head;
//         for (int i = 1; i < indexFromStart; i++) {
//             curr = curr.next;
//         }

//         // Step 4: replace data
//         curr.data = x;
//     }

//     // Print list
//     public void printList() {
//         Node temp = head;
//         while (temp != null) {
//             System.out.print(temp.data + " -> ");
//             temp = temp.next;
//         }
//         System.out.println("null");
//     }

//     // MAIN
//     public static void main(String[] args) {

//         practice ll = new practice();

//         ll.head = new Node(1);
//         ll.head.next = new Node(2);
//         ll.head.next.next = new Node(3);
//         ll.head.next.next.next = new Node(4);
//         ll.head.next.next.next.next = new Node(5);

//         System.out.print("Original: ");
//         ll.printList();

//         int n = 2;
//         int x = 99;

//         ll.replaceNthFromEnd(n, x);

//         System.out.print("After replace: ");
//         ll.printList();
//     }
// }







//ll is palindrome or not
//approach-1: find mid,reverse 2nd half,compare both halves
public class practice {

    static class Node{

        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public Node head;
    public Node tail;

    public Node getMid(Node head){
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public boolean isPalindrome(){
        if(head==null || head.next==null){
            return true;
        }

        //find mid
        Node mid=getMid(head);

        //reverse 2nd half
        Node prev=null;
        Node curr=mid;//2nd half head
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        //compare both halves
        Node left=head;
        Node right=prev;//head of reversed 2nd half

        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }

        return true;
    }
}