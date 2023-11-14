import java.util.Scanner;

public class Queue {
    public static void main(String[] args) {
        queue1 obj = new queue1(3);
        Scanner scan = new Scanner(System.in);
        while(true){
        System.out.println("1   enqueue");
        System.out.println("2   dequeue");
        System.out.println("3   peek");
        System.out.println("4   display");
        System.out.println("5   Exit");


        System.out.println("Enter the operation number :");
        int choice = scan.nextInt();
        switch(choice)
        {
            case 1:
            int number = scan.nextInt();
            obj.insertion(number);
            break;
            

            case 2:
            obj.deletion();
            break;

            case 3:
            System.out.println(" the peek element is"+obj.peek());
            break;

            case 4:
            obj.display();
            break;

            case 5:
            System.exit(1);


        }

    }
   
}
}

class queue1{
     int rear;
     int front;
     int a[];
     int n;
    public queue1( int n){
        
        a= new int[n];
        front=0;
        rear =-1;
        this.n=n;
    }

    void insertion(int num){
        if(rear==n-1){
            System.out.println("queue overflow");

        }
        else{
        rear=rear+1;
        a[rear]=num;
        System.out.println("insertion completed in the queue");
        }


        


    }
    void deletion(){
        if(front==rear+1){
            System.out.println("underflow");

        }
        else{
            int d=a[front];
            front=front+1;
            System.out.println("the element deleted is "+d);
        }
    }

    void display(){
        for (int i=front ;i<=rear;i++){
            System.out.println(i+"th elemrent of the queue is "+a[i]);
        }
    }

    int peek(){
        if((front>rear)||(front<0)){
            System.out.println("no element");
            return 0;

    }
    else{
        return a[front];
    }
}

}
