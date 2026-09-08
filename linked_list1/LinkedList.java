   

// public class LinkedList {
//     public static class   Node{
//     int data;
//     Node next;//refrence variable that points to nextvariable

//     public Node(int data){ //constructor
//         this.data=data;
//         this.next=null;//  assuming next node is null, we will update it later
//     }
// }
//     public static Node head;           

//     public static Node tail;



//     //need not to write static because we r inside the class  
//     //adding at first and making new head
//     public void addFirst(int data){

//         //step1-create new node
//         Node newNode=new Node(data);


//          checking base case
//         if(head==null){//if linked list is empty 
//             head=tail=newNode;
//              //head =newNode;
//              //tail=newNode; 
//             return;
//         }

//           // 
//         //step2-newNode ka next=head  (jo pehle tha)
//         newNode.next=head;//link
//         //step3-head=newNode
//         head=newNode;
//     }


//     //adding at last and making new tail
//     public void addLast(int data){
//         Node newNode=new Node(data);
//         if(head==null){//if linked list is empty
//             head=tail=newNode;
//             return;
//         }
//         tail.next=newNode;//as pointer aab null ko nahi point karega balki newNode ko karega.
//         tail=newNode;
//          //tail.next = null; //COMPLETELY UNNECESSARY AS IT IS ALREADY NULL IN CONSTRUCTOR
//          //JUST FOR THE SAKE OF LOGIC.
    
//     }

//     //for printing the linked list
//     public void print(){
//         if(head==null){
//             System.out.println("Linked List is empty");
//             return;
//         }
//         Node temp=head;
//         while(temp!=null){
//             System.out.print(temp.data+"->");
//             temp=temp.next;
//         }
//         System.out.println("null");
//     }


       

//     public static void main(String[] args) {
//         LinkedList ll=new LinkedList();
//         // ll.head=new Node(1);
//         // ll.head.next=new Node(2);
//         //we cant do all this on main so we make methods in ll class

//         ll.addFirst(2);//sabse pehle call hoga ye or empty ll mai 2 dal dega
//         ll.addFirst(1);////pehle 2 ke aage 1 add karega
//         ll.addLast(3);//last mai 3 add karega
//         ll.addLast(4);//last mai 4 add karega

//         //print ll
//         ll.print();
        
        
 
//     }
    
// }










// //add in the middle at index
// public class LinkedList {
//     public static class   Node{
//     int data;
//     Node next;//refrence variable that points to nextvariable

//     public Node(int data){ //constructor
//         this.data=data;
//         this.next=null;
//     }
// }
//     public static Node head;
//     public static Node tail;
//     public static int size;

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
//         tail.next=newNode;//as pointer aab null ko nahi point karega balki newNode ko karega.
//         tail=newNode;
//     }





//     //adding in the middle at index
//     public void addInMiddle(int idx,int data){
//         if (idxx < 0 || idx > size) {
//            System.out.println("Invalid index");
//            return;
//        }


//         if(idx==0){
//             addFirst(data);
//             return;
//         }
//         if(idx==size){
//             addLast(data);
//             return;
//         }
//         //step1-create new node
//         Node newNode=new Node(data);
//         size++;
//         //step2-traverse till idx-1 because we have to change the next of idx-1 node to newNode 
//         Node temp=head; //
//         int i=0;
//         while(i<idx-1){//why? because we have to stop at idx-1 node matlab temp aab previous node pe hoga
//             temp=temp.next;
//             i++;
//         }
//         //step3-newNode ka next=temp.next
//         newNode.next=temp.next;
//         
//         temp.next=newNode;
//     }
//     //for printing the linked list
//     public void print(){
//         if(head==null){
//             System.out.println("Linked List is empty");
//             return;
//         }
//         Node temp=head;
//         while(temp!=null){
//             System.out.print(temp.data+"->");
//             temp=temp.next;
//         }
//         System.out.println("null");
//     }

//     public

//  static void main(String[] args) {
//         LinkedList ll=new LinkedList();
//         // ll.head=new Node(1);
//         // ll.head.next=new Node(2);
//         //we cant do all this on main so we make methods in ll class

//         ll.addFirst(2);//sabse pehle call hoga ye or empty ll mai 2 dal dega
//         ll.addFirst(1);////pehle 2 ke aage 1 add karega
//         ll.addLast(4);//last mai 4 add karega
//         ll.addLast(5);//last mai 5 add karega
//         ll.addInMiddle(2,3);//2nd index pe 3 add karega
//         ll.addInMiddle(4,9);//4th index pe 9 add karega

//         //print ll
//         ll.print();
//     }
// }










//size of linked list
//logic : we will maintain a size variable and increase it whenever we add a node
//decrease it whenever we remove a node
//return it whenever we want to know the size of linked list


public class LinkedList {
    public static class   Node{
    int data;
    Node next;//refrence variable that points to nextvariable

    public Node(int data){ //constructor
        this.data=data;
        this.next=null;
    }
}
    public static Node head;
    public static Node tail;
    public static int size;

    //need not to write static because we r inside the class

    //adding at first and making new head
    public void addFirst(int data){
        //step1-create new node
        Node newNode=new Node(data);
        size++;
        if(head==null){//if linked list is empty
            head=tail=newNode;
            return;
        }
        //step2-newNode ka next=head  (jo pehle tha)
        newNode.next=head;//link
        //step3-head=newNode
        head=newNode;
    }
    //adding at last and making new tail
    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){//if linked list is empty
            head=tail=newNode;
            return;
        }
        tail.next=newNode;//as pointer aab null ko nahi point karega balki newNode ko karega.
        tail=newNode;
    }
    public void addInMiddle(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        if(idx==size){
            addLast(data);
            return;
        }
        //step1-create new node
        Node newNode=new Node(data);
        size++;
        //step2-traverse till idx-1 because we have to change the next of idx-1 node to newNode 
        Node temp=head; //
        int i=0;
        while(i<idx-1){//why? because we have to stop at idx-1 node matlab temp aab previous node pe hoga
            temp=temp.next;
            i++;
        }
        //step3-newNode ka next=temp.next
        newNode.next=temp.next;
        //step4-temp.next=newNode
        temp.next=newNode;
    }








    //for printing the linked list
    public void print(){
        if(head==null){
            System.out.println("Linked List is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        // ll.head=new Node(1);
        // ll.head.next=new Node(2);
        //we cant do all this on main so we make methods in ll class

        ll.addFirst(2);//sabse pehle call hoga ye or empty ll mai 2 dal dega
        ll.addFirst(1);////pehle 2 ke aage 1 add kare
        ll.addLast(4);//last mai 4 add karega
        ll.addLast(5);//last mai 5 add karega
        ll.addInMiddle(2,3);//2nd index pe 3 add karega
        ll.addInMiddle(4,9);//4th index pe 9 add karega

        System.out.println("Size of linked list: "+size);
        //print ll
        ll.print();
    }
}






  