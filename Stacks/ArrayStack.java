public class ArrayStack {

    public static void main(String[] args) {

        ArrayStackDemo arrayStackDemo = new ArrayStackDemo(5);

        arrayStackDemo.pushStack(0);
        arrayStackDemo.pushStack(1);
        arrayStackDemo.pushStack(2);
        arrayStackDemo.pushStack(3);
        arrayStackDemo.pushStack(4);
        arrayStackDemo.popStack();
        arrayStackDemo.pushStack(5);

        arrayStackDemo.showArrayStack();

        System.out.println();

        arrayStackDemo.showArrayStack();

    }

    static class ArrayStackDemo {
        private int maxSize; // Maximum capacity
        private int[] data; // Stack data
        private int top; // Stack top, initialized to -1

        public ArrayStackDemo(int maxSize) {
            this.maxSize = maxSize;
            this.data = new int[maxSize];
            this.top = -1;
        }

        /**
         * Check if the stack is full
         */
        public Boolean isMaxSize() {
            if (this.top == this.maxSize - 1) { // Full
                return true;
            } else if (this.top < this.maxSize - 1) { // Not full
                return false;
            } else { // Out of bounds
                System.out.println("Exceeded the maximum array length");
            }
            return null;
        }

        /**
         * Check if the stack is empty
         */
        public Boolean isEmpty() {
            return this.top == -1;
        }

        /**
         * Push data onto the stack
         *
         * @param data Stack data
         */
        public void pushStack(int data) {
            // Check if the stack is full
            if (this.isMaxSize()) {
                System.out.println("Stack is full");
                return;
            }

            this.top++;
            this.data[top] = data;
        }

        /**
         * Pop data from the stack
         */
        public int popStack() {
            // Check if the stack is empty
            if (isEmpty()) {
                throw new RuntimeException("Stack is empty");
            }
            int value = this.data[this.top];
            this.top--;
            return value;
        }

        /**
         * Traverse and display stack elements
         */
        public void showArrayStack() {
            if (this.isEmpty()) {
                System.out.println("Stack is empty");
                return;
            }
            // Traverse based on the position of the stack top
            for (int i = this.top; i >= 0; i--) {
                System.out.println(this.data[i]);
            }
        }
    }
}
