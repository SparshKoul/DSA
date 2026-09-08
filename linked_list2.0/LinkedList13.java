//circular ll

//singly

public class LinkedList13{   

    static class Node{
        int data;
        Node next;
    
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        Node newNode=new Node(data);


        // Case 1: Empty list
        if (head == null) {
            head = newNode;
            newNode.next = head;   // point to itself
            return;
        }

       // //dont do this mistake.
    ////     newNode.next = head;   // head is null
   // //      head = newNode;
   // //      return newNode;



        // Case 2: Non-empty list
        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;   // go to last node
        }

        temp.next = newNode;    // last -> new node
        newNode.next = head;    // new node -> old head
        head = newNode;         // update head
        return;
    }


    // ================= INSERT AT TAIL =================
    public void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = head;
        tail = newNode; 
    }

    //=================== INSERT AT INDEX =================
    public void addAtIndex(int index, int data) {
        if (index == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;

        while (i < index - 1) {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }


    // ================= DELETE FIRST =================
    public void removeFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // Only one node
        if (head.next == head) {
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;   // go to last node
        }

        head = head.next;       // move head
        temp.next = head;       // last -> new head
    }

////  or    temp.next= head.next;
////        head=head.next;


    // ================= DELETE LAST =================
    public void removeLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // Only one node
        if (head.next == head) {
            head = null;
            return;
        }

        Node prev = null;
        Node curr = head;

        while (curr.next != head) {
            prev = curr;
            curr = curr.next;
        }

        prev.next = head;   // second last -> head
    }


    //or
//Node temp = head;

    // move to second last node
//     while (temp.next.next != head) {
//         temp = temp.next;
//     }

//     // temp is second last, temp.next is last
//     temp.next = head;   // remove last by changing link temp ka arrow head ko point karega.
// }

    






    //-----------------------------------------------
    //--------------------REVERSE--------------------
    //----------------------------------------------

    public Node reverse(Node head) {
        if (head == null || head.next == head) {
            return head; // empty or single node
        }

        Node prev = null;
        Node curr = head;
        Node next;

        do {
            next = curr.next;   // store next
            curr.next = prev;   // reverse link
            prev = curr;        // move prev
            curr = next;        // move curr
        } while (curr != head);

        // Fix circular links
        head.next = prev;  // old head -> new last
        head = prev;       // update head

        return head;
    }



    // ================= PRINT CIRCULAR LL =================
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        //we dont use while here as no null...and if we start with it condition is false aat immediate.
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(back to head)");
    }


    // ================= MAIN =================
    public static void main(String[] args) {
        LinkedList13 cll = new LinkedList13();

        cll.addFirst(3);
        cll.addFirst(2);
        cll.addFirst(1);
        cll.printList();

        cll.addLast(4);
        cll.addLast(5);
        cll.printList();

        cll.removeFirst();
        cll.printList();

        cll.removeLast();
        cll.printList();

        cll.reverse(head);
        cll.printList();
    }



}
