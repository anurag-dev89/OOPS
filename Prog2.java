class stack{
    int[] stack = new int[10];
    int top = -1;

    // Method to push an element
    void push(int x) {
        if (top == 10-1) {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = x;
        System.out.println("Inserted: " + x);
    }

    // Method to pop an element
    int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top--];
    }
}

public class Prog2{
    public static void main(String[] args) {
        stack s = new stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);

        System.out.println("Popped: " + s.pop());
        System.out.println("Popped: " + s.pop());

        System.out.println("Remaining stack elements"); 
           
        for(int i=0;i<=s.top;i++) { 
           System.out.println(s.stack[i]); 
        } 
    }
}
