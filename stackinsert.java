public class stackinsert {
    private int maxSize;
    private int top;
    private int[] stackArray;

   
    public stackinsert(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1; 
    }

   
    public boolean isEmpty() {
        return top == -1;
    }
 
    public boolean isFull() {
        return top == maxSize - 1;
    }

    
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + value);
        } else {
            stackArray[++top] = value;
            System.out.println("Pushed " + value);
        }
    }

   
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;
        } else {
            return stackArray[top--];
        }
    }

   
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        } else {
            return stackArray[top];
        }
    }

    

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        }
    }

    
    public static void main(String[] args) {
        stackinsert stack = new stackinsert(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();

        System.out.println("Top element: " + stack.peek());

        stack.pop();
        stack.display();

        System.out.println("Is stack empty? " + stack.isEmpty());
        System.out.println("Is stack full? " + stack.isFull());
    }
}
