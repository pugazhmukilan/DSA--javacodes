public class prefixcal {
    public static void main(String[] args) {
        System.out.println(postfixcalcualtion("+3*+592"));
        
    }
    public static  int postfixcalcualtion(String expression){
        int length = expression.length();
        Stack1 l = new Stack1(length);
        for (int i = (length -1);i>=0;i--){
            char c =expression.charAt(i);
            if (Character.isDigit(c)){
                l.insertion(Character.getNumericValue(c));

            }
            else{
                int  operand1= l.deletion();
                int operand2 = l.deletion();
                switch (c) {
                    case '+':
                    
                        l.insertion(operand1+operand2);
                    
                    
                        break;
                    case '-':
                        l.insertion(operand1-operand2);
                        break;
                    case '*':
                        l.insertion(operand1*operand2);
                        break;
                    case '/':
                        l.insertion(operand1 / operand2);
                        break;
                    default:
                        break;
                }
            }
    }
    return l.deletion();
}
}
class Stack1{
    
    int a[];
    int len;
    int top= -1;
    public Stack1(int len){
        this.len=len;
        a=new int[len];

    }

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
