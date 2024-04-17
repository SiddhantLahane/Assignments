package assignment6;

class Deque {
    int[] arr;
    int front;
    int rear;
    int size;
    
    public Deque(int size) {
        arr = new int[size];
        front = -1;
        rear = 0;
        this.size = size;
    }

    
    boolean isFull() {
        return ((front == 0 && rear == size - 1) || front == rear + 1);
    }

    
    boolean isEmpty() {
        return (front == -1);
    }

    
    void insertFront(int key) {
        if (isFull()) {
            System.out.println("Overflow");
            return;
        }
        if (front == -1) { 
            front = 0;
            rear = 0;
        } else if (front == 0) { 
            front = size - 1;
        } else { 
            front = front - 1;
        }
        arr[front] = key;
    }

    
    void insertRear(int key) {
        if (isFull()) {
            System.out.println("Overflow");
            return;
        }
        if (front == -1) { 
            front = 0;
            rear = 0;
        } else if (rear == size - 1) { 
            rear = 0;
        } else { 
            rear = rear + 1;
        }
        arr[rear] = key;
    }

    
    int deleteFront() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }
        int data = arr[front];
        if (front == rear) { 
            front = -1;
            rear = -1;
        } else if (front == size - 1) { 
            front = 0;
        } else { 
            front = front + 1;
        }
        return data;
    }

   
    int deleteRear() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }
        int data = arr[rear];
        if (front == rear) { 
            front = -1;
            rear = -1;
        } else if (rear == 0) { 
            rear = size - 1;
        } else { // Decrement rear
            rear = rear - 1;
        }
        return data;
    }

    
    int getFront() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }
        return arr[front];
    }

    
    int getRear() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }
        return arr[rear];
    }
}

 class Main1 {
    public static void main(String[] args) {
        Deque dq = new Deque(5);
        
        System.out.println("Insert element at rear end : 5 ");
        dq.insertRear(5);
        
        System.out.println("insert element at front end : 3 ");
        dq.insertFront(3);
        
        System.out.println("Front element: " + dq.getFront());
        System.out.println("Rear element: " + dq.getRear());
        
        dq.deleteFront();
        System.out.println("After deleting front element, new front is: " + dq.getFront());
        
        dq.insertRear(7);
        System.out.println("After inserting element at rear, new rear is: " + dq.getRear());
        
        dq.deleteRear();
        System.out.println("After deleting rear element, new rear is: " + dq.getRear());
    }
}
