//circular doubly
public class LinkedList14 {

    // ================= NODE =================
    static class Node {
        int data;        // stores value
        Node next;       // points to next node
        Node prev;       // points to previous node

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;

        }
    }

    Node head = null;    // starting node of list
    int size = 0;        // number of nodes

    // ================= ADD FIRST =================
    public void addFirst(int data) {
        Node newNode = new Node(data);   // create new node

        if (head == null) {              // if list is empty
            newNode.next = newNode;      // next points to itself
            newNode.prev = newNode;      // prev points to itself
            head = newNode;              // head is newNode
        } else {
            Node last = head.prev;       // last node (circular property)

            newNode.next = head;         // newNode → old head
            newNode.prev = last;         // newNode ← last

            last.next = newNode;         // last → newNode
            head.prev = newNode;         // head ← newNode

            head = newNode;              // update head
        }
        size++;                           // increase size
    }

    // ================= ADD LAST =================
    public void addLast(int data) {
        if (head == null) {              // if list empty
            addFirst(data);              // reuse addFirst
            return;
        } 

        
        Node newNode = new Node(data);   // create node
        Node last = head.prev;           // get last node

        newNode.next = head;             // newNode → head
        newNode.prev = last;             // newNode ← last

        last.next = newNode;             // last → newNode
        head.prev = newNode;             // head ← newNode

        size++;                           // increase size
    }

    // ================= ADD AT INDEX =================
    public void addAtIndex(int index, int data) {
        if (index < 0 || index > size) { // invalid index
            System.out.println("Invalid index");
            return;
        }

        if (index == 0) {                // insert at beginning
            addFirst(data);
            return;
        }

        if (index == size) {             // insert at end
            addLast(data);
            return;
        }

        Node newNode = new Node(data);   // new node
        Node temp = head;                // traversal pointer

        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;            // move to (index-1)
        }

        newNode.next = temp.next;        // newNode → next node
        newNode.prev = temp;             // newNode ← temp

        temp.next.prev = newNode;        // next node ← newNode
        temp.next = newNode;             // temp → newNode

        size++;                           // update size
    }

    // ================= REMOVE FIRST =================
    public void removeFirst() {
        if (head == null) return;        // empty list

        if (size == 1) {                // only one node
            head = null;                // list becomes empty
        } else {
            Node last = head.prev;      // last node
            head = head.next;           // move head forward

            head.prev = last;           // new head ← last
            last.next = head;           // last → new head
        }
        size--;                          // decrease size
    }

    // ================= REMOVE LAST =================
    public void removeLast() {
        if (head == null) return;        // empty list

        if (size == 1) {                // only one node
            head = null;
        } else {
            Node last = head.prev;      // last node
            Node secondLast = last.prev;// node before last

            secondLast.next = head;     // secondLast → head
            head.prev = secondLast;     // head ← secondLast
        }
        size--;                          // decrease size
    }

    //======================REMOVE AT INDEX=======================
    public void removeAtIndex(int index){
        if(index<0 || index>=size){
            System.out.println("Invalid index");
            return;
        }

        if(index==0){
            removeFirst();
            return;
        }

        if(index==size-1){
            removeLast();
            return;
        }

        Node temp=head;
        for(int i=0;i<index;i++){//temp at index that we have to delete not index-1
            temp=temp.next;
        }

        temp.prev.next=temp.next;//temp k pev wale node ka next(arrow) = temp ke next pe
        temp.next.prev=temp.prev;//temp k next wale node ka prev(arrow)= temp ke prev pe

        size--;
    }



    //or.
    //Node temp = head;
// for (int i = 0; i < index - 1; i++) {
//     temp = temp.next;
// }
// // temp == B

// Node del = temp.next;     // node to delete (C)

// temp.next = del.next;
// del.next.prev = temp;


    // ================= REVERSE =================
    public Node reverse() {
        if (head == null || head.next == head) return head; // empty or single node

        Node curr = head;
        Node temp ;

        do {
            // swap next and prev for current node
            temp = curr.next;      // store next    we can use next in place of temp ...as just name to find similarity  with other rev fxn
            curr.next = curr.prev;      // swap next
            curr.prev = temp;           // swap prev
            curr = temp;                // move forward
        } while (curr != head);

        head = head.next;               // update head
        return head;
    }


    // ================= REVERSE - 2nd METHOD =================
    //this is wrong for circular doubly.
    public Node reverse2method(Node head) {

    // empty or single node
    if (head == null || head.next == head) {
        return head;
    }

    Node curr = head;
    Node prev = null;
    Node next;

    do {
        next = curr.next;     // store next
        curr.next = prev;     // reverse next
        curr.prev = next;     // reverse prev
        prev = curr;          // move prev
        curr = next;          // move curr
    } while (curr != head);

    // fix circular links
    head.next = prev;   // old head becomes last
    head = prev;        // update head

    return head;
}

    

    // ================= DISPLAY =================
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        do { 
            System.out.print(temp.data + " ⇄ ");
            temp = temp.next;            // move forward
        } while (temp != head);

        System.out.println("(back to head)");
    }

    // ================= MAIN =================
    public static void main(String[] args) {
        LinkedList14 dll = new LinkedList14();

        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addLast(4);
        dll.addLast(5);

        dll.display();   // 1 ⇄ 2 ⇄ 3 ⇄ 4 ⇄ 5

        dll.addAtIndex(3, 99);
        dll.display();   // 1 ⇄ 2 ⇄ 3 ⇄ 99 ⇄ 4 ⇄ 5

        dll.removeFirst();
        dll.display();   // 2 ⇄ 3 ⇄ 99 ⇄ 4 ⇄ 5

        dll.removeLast();
        dll.display();   // 2 ⇄ 3 ⇄ 99 ⇄ 4

        dll.reverse();
        dll.display();   // 4 ⇄ 99 ⇄ 3 ⇄ 2


    }
}
