//DETECTING A LOOP/CYCLE IN A LINKED LIST
public class practice2 {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static boolean isCycle(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }



//REMOVE CYCLE IN A LINKED LIST
    
public static void removeCycle(Node head){
    Node slow=head;
    Node fast=head;
    boolean cycle=false;
    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
        if(slow==fast){
            cycle=true;
            break;//here we did break we want to preserve the position of slow and fast when they met.
        }
    }
    if(cycle==false){//no cycle
        return;
    }

    //IF CYCLE IS PRESENT
    slow=head;
    Node prev=null; //to keep track of the node before fast
    while(slow!=fast){
        prev=fast;
        slow=slow.next;
        fast=fast.next;
    }
  // after the loop prev k andr last node ka address hoga jo cycle ko point kar raha tha
    prev.next=null; //removing the cycle 
}




////// MERGE SORT IN LINKED LIST

   //     // MAIN MERGE SORT FUNCTION
    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;  // already sorted if 0 or 1 node
        }

        // 1️⃣ Split list into two halves
        Node mid = findMid(head);
        Node rightHead = mid.next;
        mid.next = null; // IMPORTANT: break into 2 lists

        // 2️⃣ Sort each half
        Node left = mergeSort(head);//left half
        Node right = mergeSort(rightHead);//right half

        // 3️⃣ Merge sorted halves
        return merge(left, right);
    }


//understanding merge sort .
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

   // mid finding
    public static Node findMid(Node head){
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow; //slow is mid
    }


    // MERGE TWO SORTED LL
    private Node merge(Node a, Node b) {
        Node dummy = new Node(-1);
        Node temp = dummy;//temp=tail..acc to gpt here

        while (a != null && b != null) {
            if (a.data <= b.data) {
                temp.next = a;
                a = a.next;
            } else {
                temp.next = b;
                b = b.next;
            }
            temp = temp.next;
        }

        // Attach remaining part
        temp.next = (a != null) ? a : b;

        return dummy.next;
    }
        // PRINT LL
    public void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
    






public static void main(String args[]) {
    practice2 list = new practice2();

    Node head = new Node(4);
    head.next = new Node(2);
    head.next.next = new Node(1);
    head.next.next.next = new Node(3);

    // create cycle
    head.next.next.next.next = head.next;

    System.out.println(isCycle(head)); // YES

    removeCycle(head);

    System.out.println(isCycle(head)); // NO

    System.out.println("Original List:");
    list.printList(head);

    head = list.mergeSort(head);

    System.out.println("Sorted List:");
    list.printList(head);
}
}