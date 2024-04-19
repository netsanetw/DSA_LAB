public class LinearQueue {
    private int capacity;
        private int[] queueArray;
        private int front;
        private int rear;
        private int currentSize;

        public LinearQueue(int capacity) {
            this.capacity = capacity;
            this.queueArray = new int[capacity];
            this.front = 0;
            this.rear = -1;
            this.currentSize = 0;
        }

        public boolean isFull() {
            return currentSize == capacity;
        }

        public boolean isEmpty() {
            return currentSize == 0;
        }

        public void enqueue(int item) {
            if (isFull()) {
                System.out.println("Queue is full. Cannot enqueue " + item);
            } else {
                rear = (rear + 1) % capacity;
                queueArray[rear] = item;
                currentSize++;
                System.out.println(item + " enqueued to the queue");
            }
        }

        public int dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is empty. Cannot dequeue.");
                return -1; // Assuming -1 is not a valid element in the queue
            } else {
                int dequeuedItem = queueArray[front];
                front = (front + 1) % capacity;
                currentSize--;
                return dequeuedItem;
            }
        }

        public static void main(String[] args) {
            LinearQueue queue = new LinearQueue(5);
            queue.enqueue(10);
            queue.enqueue(20);
            queue.enqueue(30);
            queue.enqueue(40);
            queue.enqueue(50);
            queue.enqueue(60); // Attempt to enqueue when the queue is full
            System.out.println("Dequeued: " + queue.dequeue());
            System.out.println("Dequeued: " + queue.dequeue());
            System.out.println("Dequeued: " + queue.dequeue());
            System.out.println("Dequeued: " + queue.dequeue());
            System.out.println("Dequeued: " + queue.dequeue());
            System.out.println("Dequeued: " + queue.dequeue()); // Attempt to dequeue when the queue is empty
        }
    }
