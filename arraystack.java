package semester5;

public class arraystack<T> {

        private T[] stack;
        private int top;

        public arraystack() {
            stack = (T[]) new Object[2];
            top = -1;
        }

        public void push(T element) {

            if (top == stack.length - 1) {
                expandCapacity();
            }

            top++;
            stack[top] = element;
        }

        public T pop() {

            if (isEmpty()) {
                return null;
            }

            T element = stack[top];
            stack[top] = null;
            top--;

            return element;
        }

        public T peek() {

            if (isEmpty()) {
                return null;
            }

            return stack[top];
        }

        public boolean isEmpty() {
            return top == -1;
        }

        public int size() {
            return top + 1;
        }

        private void expandCapacity() {

            T[] newStack = (T[]) new Object[stack.length * 2];

            for (int i = 0; i < stack.length; i++) {
                newStack[i] = stack[i];
            }

            stack = newStack;
        }
    }




