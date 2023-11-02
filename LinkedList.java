public class LinkedList {
    public static void main(String[] args) {
        Linkedlist1 l = new Linkedlist1();
        l.insertionAtBegin(1);
        l.insertAtEnd(2);
        l.insertAtEnd(3);

        l.insertAtEnd(4);
        l.insertAtEnd(5);
        l.insertAtEnd(6);
        l.insertAtEnd(7);
        System.out.println("insertion at middle");
        l.insertAtMiddle(2, 120);
        System.out.println("diaplying");
        l.display();
        l.deletionAtbegin();
        l.display();
        l.deleteAtMiddle(2);
        l.display();


        }
        
}
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
        System.out.println("Node Created");
    }
}
class Linkedlist1{
    public Node start;
    public Linkedlist1(){
        start=null;

    }

    void insertionAtBegin(int n){
        System.out.println("inserting at begin");
        Node temp= new Node(n);
        if (start==null){
            start=temp;
            System.out.println(temp);
        }
        else{
            temp.next=start;
            start=temp;
            System.out.println("entered at begin");
        }
    }

    void insertAtEnd(int n){
        System.out.println("insertion at end");
        Node p=start;
        Node temp= new Node(n);
        
        
            while(p.next !=null){
                p=p.next;
            }
            p.next=temp;
            System.out.println(temp);

        

    }

    void insertAtMiddle(int loc, int n){
        System.out.println("insertion at middle");
        Node p=start;
     
        Node temp = new Node(n);
       
        

            for (int i=0;i<loc-2;i++){
                p=p.next;
            }
            Node q= p.next;
            p.next=temp;
            temp.next=q;
            System.out.println(temp);
        
        
    }

    void deletionAtbegin(){
        if (start==null){
            System.out.println("the linked list is empty");
        }
        else{
            int d= start.data;
            start=start.next;
            System.out.println("the element "+d+"is deleted from the linked list");
        }
    }
    void deleteAtend(){
        if (start == null) {
            System.out.println("the linked list is empty");
        }
        else {
        Node p = start;
        Node prev = null;
        while (p.next != null) {
            prev = p;
            p = p.next;
        }
        prev.next = null;
    }
        }
    void deleteAtMiddle(int loc){
        Node p=start;
        
        
        
        
       

            for (int i=0;i<loc-2;i++){
                p=p.next;
            }
            Node prev=p;
            Node del=p.next;
            int data= del.data;
            prev.next=p.next.next;
            
            System.out.println("the deleted element is"+data);

        
        
    }
    void display(){
        Node p = start;
        System.out.println("displaying");
        while(p.next != null){
            System.out.println(p.data+" "+p.next);
            p=p.next;
        }
        

    }
    }

