
class sooo1 {

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
        }else{
            tail.link(newNode);
        }
        tail = newNode;
        size++;
    }

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(size == 0){
            tail = newNode;
        }else{
            head.link(newNode);
        }
        head = newNode;
        size++;
    }

    public void removeFirst(){
        if(size == 1){
            head = null;
            tail = null;
        }else{
            head = head.getNextNode();
        }
        size--;
    }

    public void removeLast(){
        if(size == 1){
            head = null;
            tail = null;
        }
        if(size > 1){
            Node p = head;
            while(p.getNextNode() != tail){
                p = p.getNextNode();
            }
            tail = p.getNextNode();
            tail.link(null);
        }
        size--;
    }

    public void print(){
        if(size == 0){
            System.out.println("Empty linked list");
        }else{
            for(Node p = head; p != null; p = p.getNextNode()) {
                System.out.print(p.getElement() + "->>");
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
        }else{
            return false;
        }
    }

    public int get(int index){

    }


}