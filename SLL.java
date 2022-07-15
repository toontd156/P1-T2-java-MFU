class SLL {
	// ----------------------- Node --------------------
	private class Node {
		private int element;
		private Node next;
        

		// constructor
		public Node(int data) {
			element = data; // set element to data
			next = null; // set next to null
		}

		// link a new node to this node
		public void link(Node newNode) {
			next = newNode; // if use link var next data = newNode
		}

		// return next node
		public Node getNextNode() {
			return next;
		}

		// return element of this node
		public int getElement() {
			return element;
		}

        
	}
	// --------------------- End Node --------------------

	// SLL properties and methods
	private Node head = null;
	private Node tail = null;
	private int size = 0; // SLL's size

	public void addLast(int data) { //// if use methods addLast var will be at the end  box
		// create new node
		Node newNode = new Node(data);
		if (size == 0) { ///if size is 0 addLast will at the first box
			head = newNode;
		} else {
			tail.link(newNode); ///if size > 1 use link for data added soon to (newNode) var will be at the next box or end of box
		}
        
		tail = newNode;
		size++; /// box name size ++ var to box
	}

	public void addFirst(int data) { /// if u use method addFirst will at the first box
		Node newNode = new Node(data);

        if (size == 0) {
            tail = newNode; // if size is 0 then will at the end  box
        } else {
            newNode.link(head); // if size > 1 then use link method data added soon to (head) and var will at the first box
        }
        head = newNode;
        size++; /// box name size ++ var to box
	}

	public void removeFirst() { //if u use method removeFirst will remove var at the first box
        if (size == 1){ /// if size > 1 then head = null and tail = null
            head = null;
            tail = null;

        }else{
            head = head.getNextNode();// if size != 1 than head next node 
        }
        size--;// box name size -- var to box
	}

	public void removeLast() { // if u use method removeLast will remove var at the last box
        if (size == 1){ /// size == 1 same removeFirst then
            head = null;
            tail = null;
        }else if (size > 1){/// but else if size > 1 use loop next node condition next node != tail will loop if node == tail loop stop
            Node p = head;
            while (p.getNextNode() != tail){
                p=p.getNextNode();
            }
            tail = p;/// tail = head
            tail.link(null);/// use link but var null or var not found
        }
        size--;/// size --
	}

	public void print() { // method print is method set condition in print 
		if (size == 0) { ///  size = 0 method will print " Empty linked list"
			System.out.println("Empty linked list");
		} else {
			for (Node p = head; p != null; p = p.getNextNode()) { ///use forloop to print condition node p = head is p == next node and p != var not data condition in loop p.getNextNode() is move data in node
				System.out.print(p.getElement() + "->");
			}
			System.out.println("null"); /// if print finish code will print null
		}
	}   

    public int getSize() { /// get var all size and send or return size to code other
        return size;
    }

    public boolean isEmpty() {/// the method idEmpty this a work check var size if size == 0 method return true and size != 0 method return false
        if (size == 0) {
            return true;
        }else {
            return false;
        }
    }
    public int get(int index) { ///the method get all int index this method get value all code for check value at value set value = -999 the method will check value if size > 0 or size > index and < size the method will for loop for next node in box until the end
        int value = -999;
        if(size > 0 && index < size) {
            Node p = head;
            
            for(int i = 0; i < index; i++) {
                p = p.getNextNode();
            }
            value=p.getElement(); /// if finish loop code set value = p.getElement
        }else{
            System.out.println("Error, index is out of bounds"); ///  method check != code set function code print error
        }
        return value;/// code finish return value to code other
    }
    

    public void clear() {/// the method clear this method clear everything box
        head = null;
        tail = null;
        size = 0;
    }

    public boolean findElement(int data){/// the method findElement this method same isEmpty but findElement this find in the int data use loop int i < size i++ check in loop use if set if = data = p.getElement and return true or else p = p .getNextNode() and finish code return val x to code other
        boolean x = false;

        Node p;
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

    public int countElement(int data){/// the method countElement this method check value in data if number == data code will print No.1 No.2 No.3 No.4 No.5 No.6 
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

    public int sumElement(){ ///the method sumElement this method get all number value ++ and return sum
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
