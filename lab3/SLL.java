package lab3;

class SLL {

    private class Node{
        private int element;
        private Node next;

        public Node(int data){
            element = data;
            next = null;
        }

        public void link(Node newNode){
            next = newNode;
        }

        public Node getNextNode(){
            return next;
        }

        public int getElement(){
            return element;
        }
    }

    private Node head = null;
    private Node tail = null;
    private int size = 0;

    public void addLast(int data){
        Node newNode = new Node(data);
        if(size == 0){
            head = newNode;
        }
        else{
            tail.link(newNode);
        }
        tail = newNode;
        size++;
    }

    public void addFirst(int data){
        Node newNode = new Node(data);

        if(size == 0){
            tail = newNode;
        }
        else{
            newNode.link(head);
        }
        head = newNode;
        size++;
    }

    public void removeFirst(){
        if(size == 1){
            head = null;
            tail = null;
        }
        else{
            head = head.getNextNode();
        }
        size--;
    }

    public void removeLast(){
        if(size == 1){
            head = null;
            tail = null;
            size--;
        }
        else if (size > 1){
            Node p = head;
            while(p.getNextNode() != tail){
                p = p.getNextNode();
            }
            tail = p;
            tail.link(null);
            size--;
        }
    }
    
    public void print(){
        if(size == 0){
            System.out.println("Empty linked list");
        }
        else{
            for (Node p = head; p != null; p = p.getNextNode()){
                System.out.print(p.getElement() + "->");
            }
            System.out.println("null");
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

    public int get(int index){
        int value = -999;
        if(size > 0 && index < size){
            Node p = head;

            for(int i = 0; i < index; i++) {
                p = p.getNextNode();
            }
            value = p.getElement();
        }else{
            System.out.println("Error, index is out of bounds");
        }
        return value;
    }
    void clear(){
        head = null;
        tail = null;
        size = 0;
    }

    public boolean findElement(int data){
        boolean x = false;
        Node p = head;
        p = head;

        for(int i = 0; i < size; i++){
            if(data == p.getElement()){
                x = true;
            }else{
                p = p.getNextNode();
            }
        }
        return x;
    }

    public int countElement(int data){
        int count = 0;

        Node p;
        p = head;

        for(int i = 0; i < size; i++){
            if(data == p.getElement()){
                count++;
            }
            p = p.getNextNode();
        }
        return count;
    }

    public int sumElement(){
        int sum = 0;
        Node p;
        p = head;

        for(int i = 0; i < size; i++){
            sum = sum + p.getElement();
            p = p.getNextNode();
        }
        return sum;
    }
}
