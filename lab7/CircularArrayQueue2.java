package lab7;

import java.util.stream.IntStream;

public class CircularArrayQueue2 {
    private final int CAPACITY = 10;
    private int[] data;
    private int front = 0;
    private int size = 0;

    public CircularArrayQueue2(){
        data = new int[CAPACITY];
    }

    public CircularArrayQueue2(int capacity){
        data = new int[capacity];
    }

    public void enqueue(int element){
        if((size) == data.length){
            resize();
            data[(front + size) % data.length] = element;
            size++;
        }
        else{
            data[(front + size) % data.length] = element;
            size++;
        }
    }

    public void resize(){
        int[] a  = new int[2 * data.length];
        int b = 0;
        for(int i = front; i < front + size; i++){
            a[b] =  data[i % data.length];
            b++;
        }
        data = a;
        front = 0;
    }

    public int dequeue(){
        if(size == 0){
            return -999;
        }
        else{
            int value = data[front];
            data[front] = 0;
            front = (front+1) % data.length;
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
            System.out.println("Queue is empty");
        }
        else{
            System.out.print("Queue: ");
            for(int i = front; i < front + size; i++){
                System.out.print(data[i % data.length]+ " ");
            }
            System.out.println();
 
        }
    }

    public void printArray(){
        System.out.print("Array: ");
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public int sum(){
       int s = IntStream.of(data).sum();
       return s;
    }
}
