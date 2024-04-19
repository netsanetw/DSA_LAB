import java.util.Stack;
public class QueueUsingStack {
        private Stack<Integer> inputStack;
        private Stack<Integer> outputStack;

        public QueueUsingStack() {
            inputStack = new Stack<>();
            outputStack = new Stack<>();
        }

        public void enqueue(int item) {
            inputStack.push(item);
        }

        public int dequeue() {
            if (outputStack.isEmpty()) {
                if (inputStack.isEmpty()) {
                    System.out.println("Queue is empty. Cannot dequeue.");
                    return -1; // Assuming -1 is not a valid element in the queue
                } else {
                    while (!inputStack.isEmpty()) {
                        outputStack.push(inputStack.pop());
                    }
                }
            }
            return outputStack.pop();
        }

        public static void main(String[] args) {
            QueueUsingStack queue = new QueueUsingStack();
            queue.enqueue(10);
            queue.enqueue(20);
            queue.enqueue(30);
            System.out.println("Dequeued: " + queue.dequeue());
            System.out.println("Dequeued: " + queue.dequeue());
            queue.enqueue(40);
            queue.enqueue(50);
            System.out.println("Dequeued: " + queue.dequeue());
            System.out.println("Dequeued: " + queue.dequeue());
            System.out.println("Dequeued: " + queue.dequeue());
        }
    }
