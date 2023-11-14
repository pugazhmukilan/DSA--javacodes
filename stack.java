import java.util.Scanner;


class stack{
    public static void main(String[] args) {
        Stack1 obj = new Stack1();
        Scanner scan = new Scanner(System.in);
        while(true){
        System.out.println("1   push");
        System.out.println("2   pop");
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
            System.out.println("the deleted element is"+obj.deletion());
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
class Stack1{
    
    int a[]= new int[3];
    int top= -1;

    void insertion(int n){
        if (top>n-1){
            System.out.println("overflow");
        }
        else{
            top=top+1;
            a[top]=n;

        }
    }

    int deletion(){
        if (top==-1){
            System.out.println("underflow");
            return 0;

        }
        else{
            int d= a[top];
            top=top-1;
            return d;
        }
    }

    void display(){
        for (int i=top;i>=0;i--){
            System.out.println(" the "+(i+1)+" th "+" element in the stack is "+a[i]);
        }
    }

    int  peek(){
        return(a[top]);
    }
}
