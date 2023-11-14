public class DoubleLinkedList {
    public static void main(String[] args) {
        DoubleLinked l= new  DoubleLinked();
        l.insertionAtBegin(1);
        l.insertionAtBegin(2);
        l.insertionAtBegin(3);
        l.insertionAtMiddle(2,89);
        l.insertionAtEnd(45);
        l.display();
        l.deletionAtbegin();
        l.display();
    }
    
}

class node{
    int data;
    node  next,prev;
    public node ( int data){
        this.data=data;
        this.next=null;
        this.prev=null;
        System.out.println("node is created");

    }

}

class DoubleLinked{
    public node start;
    public DoubleLinked(){
        start =null;

    }


    void insertionAtBegin( int n){
        node p=start;
        node temp = new node(n);
        if (start ==null){
            start=temp;
            System.out.println("address of this node is "+start);
        }
        else{
            start.prev=temp;
            
            temp.next=start;
            start= temp;
            System.out.println("insterted the element at the begin"+ temp);
        }
    }
    void insertionAtMiddle(int loc,int n){
        node p =start;
        node temp = new node (n);
        if (start ==null){
            insertionAtBegin(n);
            System.out.println("list is empty and element inserted at bbegin");
        }
        else{
            for (int i = 0;i<loc-2;i++){
                    p=p.next;
            }
            node a=p.next;
            temp.next=p.next;
            temp.prev=p;
            p.next=temp;
            a.prev=temp;

        }
    }
    void insertionAtEnd(int n){
     node temp = new node (n);
     node p =start;
     if (start==null){
        start=temp;
       System.out.println("element inserted in the beginnning of the list as the lis is empty"); 
     }
     else{
        while(p.next != null){
            p=p.next;

        }
        p.next=temp;
        temp.prev=p;
        System.out.println("element inserted in the end of the list");
     }
    }

    void deletionAtbegin(){
        node p=start;
        if (start==null){
            System.out.println("the list is empty");
        }
        else{
            if (start.next != null){
                node a=start.next;
                start=a;
                a.prev=null;
            }
            else{
                start=null;
            }
        }
    }

    void display(){
        node p=start;
        while(p != null){
            System.out.println(p.prev+" "+p.data+" "+p.next);
            p=p.next;
        }
    }
}
