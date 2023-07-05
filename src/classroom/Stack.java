package classroom;

public class Stack {
    int stack[] = new int[10];
    int top;
    Stack(){
        top = -1;
    }

    void push(int item){
        if(top == 9){
            System.out.println("Stack is full");
        }
        else{
            stack[++top] = item;
        }
    }

    int pop(){
        if(top < 0){
            System.out.println("Stack is not loaded");
            return 0;
        }
        else{
            return stack[top--];
        }

    }
}
