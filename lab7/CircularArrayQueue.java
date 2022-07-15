package lab7;

/**
 * ArrayQueue
 */
public class CircularArrayQueue {
    private final int CAPACITY = 10;
    private int[] data;
    private int front = 0;
    private int size = 0;

    public CircularArrayQueue(){
        data = new int[CAPACITY];
    }

    public CircularArrayQueue(int capacity) {
        data = new int[capacity];
    }

    public void enqueue(int element) {
        if (size == data.length){
            System.out.print("queue is full ");
        }
        else{
            data[(front + size) % data.length] = element;
            size++;
        }
    }

    public int dequeue() {
        if(size == 0){
            return -999;
        }
        else{
            int value = data[front];
            front = (front + 1) % data.length;
            size--;
            return value;
        }
    }

    public int peek(){
        if(size == 0){
            return -999;
        }
        else{
            return data[front];
        }
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        if(size == 0){
            return true;
        }
        else{
            return false;
        }

    }
    
    public void printQueue(){
       if(size == 0){
           System.out.println("Queue is empty!! Cannot display the data.");
       }
       else{
           System.out.print("Queue: ");
           for(int i = front; i < front + size; i++){
               System.out.print(data[i % data.length]+" ");
           }
           System.out.println();

       }
    }
    
}