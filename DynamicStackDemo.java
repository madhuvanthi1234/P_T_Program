public class DynamicStackDemo {

   
    static class Stack {
        protected int[] data;
        protected int top = -1;
        private static final int DEFAULT_SIZE = 10;

        public Stack() {
            this(DEFAULT_SIZE);
        }

        public Stack(int size) {
            data = new int[size];
        }

        public boolean isEmpty() {
            return top == -1;
        }

        public boolean isFull() {
            return top == data.length - 1;
        }

        public void push(int value) throws Exception {
            if (isFull()) {
                throw new Exception("Stack is full");
            }
            data[++top] = value;
        }

        public int pop() throws Exception {
            if (isEmpty()) {
                throw new Exception("Stack is empty");
            }
            return data[top--];
        }

        public int peek() throws Exception {
            if (isEmpty()) {
                throw new Exception("Stack is empty");
            }
            return data[top];
        }
    }

   
    static class DynamicStack extends Stack {

        public DynamicStack() {
            super();
        }

        public DynamicStack(int size) {
            super(size);
        }

        @Override
        public void push(int value) {
            if (isFull()) {
               
                int[] newData = new int[data.length * 2];
                System.arraycopy(data, 0, newData, 0, data.length);
                data = newData;
            }
            data[++top] = value;
        }
    }

    
    public static void main(String[] args) throws Exception {
        DynamicStack ds = new DynamicStack(2);

        ds.push(10);
        ds.push(20);
        ds.push(30);

        System.out.println("Peek: " + ds.peek()); 
        System.out.println("Pop: " + ds.pop());   
        System.out.println("Pop: " + ds.pop());    
        System.out.println("Pop: " + ds.pop());   
    }
}
