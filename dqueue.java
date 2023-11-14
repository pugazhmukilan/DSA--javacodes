public class dqueue {
    public static void main(String[] args) {
        queue q=new queue(4);
        q.enqueuefront(10);
        q.enqueueback(45);
        q.display();
    }
}


class queue{
    int n;
    int array[];
    int front,rear;
    public queue(int n){
        this.n=n;
        array=new int[n];
        front=-1;
        rear=-1;

    }

    void enqueuefront(int num){
        if ((front ==0 && rear==n-1)||(front ==rear+1)){
            System.out.println("the queue is full");
        }
        else if(front ==-1 && rear==-1){
            front = 0;
            rear = 0;
            array[front]=num;


        }
        else if (front ==0){
            front = n-1;
            array[front]=num;
        }
        else{
            front++;
            array[front]=num;
        }
    }
    void enqueueback(int num){
        if ((rear ==0 &&front== n-1)||(front==rear+1)){
            System.out.println("the quieue is full");
        }
        else if (front==-1 &&rear==-1){
            front=0;
            rear=0;
            array[rear]=num;
        }
        else if (rear ==n-1){
            rear=0;
            array[rear]=num;
        }
        else{
            rear++;
            array[rear]=num;
        }

    }
    void display(){
        int i=0;
        while(i!=rear){
            System.out.println(array[i]);
            i=(i+1)%n;
        }
    }

    void dequeuefront(){
        if(rear==-1 && front==-1){
            System.out.println("queue is empty");
        }
        else if(front==rear){
            front =rear=-1;
        }
        else if (front==n-1){
            front=n-1;
        }
        else{
            front++;
        }
    }

    void dequeuerear(){
        if (front ==-1 && rear ==-1){
            System.out.println("Queue is empty");
        }
        
        else if (front==rear){
            front=rear=-1;
        }
        else if(rear==0){
            rear=n-1;
        }
        else{
            rear--;
        }
    }
}