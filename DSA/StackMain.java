import java.util.Scanner;
class Stack{
    int[] stack;
    int top=-1;
    Stack(int size){
        stack=new int[size];
    }
    void push(int x){
        if(top==stack.length-1){
            System.out.println("The stack is full");
        }
        else{
            stack[++top]=x;
        }
    }
    int pop(){
        if(top==-1){
            return Integer.MIN_VALUE;
        }
        return stack[top--];
    }
    void peek(){
        if(top==-1){
            System.out.println("Stack is empty");
        }
        else{
            System.out.printf("\n %d ",stack[top]);
        }
    }
    int IsEmpty(){
        if(top==-1)
            return 1;
        else
            return 0;
    }
    void display(){
        if(top==-1)
            return;
        for(int i=0;i<=top;i++)
            System.out.printf(" %d ",stack[i]);
    }
}
class StackMain{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.printf("\nEnter the size of the stack: ");
        int n=sc.nextInt();
        Stack s=new Stack(n);
        while(true){
            System.out.println("\n1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.printf("\nEnter the choice: ");
            int x=sc.nextInt();
            switch(x){
                case 1:
                    System.out.printf("\nEnter the number: ");
                    int m=sc.nextInt();
                    s.push(m);
                    break;
                case 2:
                    int p=s.pop();
                    if(p==Integer.MIN_VALUE)
                        System.out.println("The stack is empty");
                    else
                        System.out.printf("The popped element is: %d\n",p);
                    break;
                case 3:
                    s.peek();
                    break;
                case 4:
                    s.display();
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }

}