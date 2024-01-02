import java.util.NoSuchElementException;

public class LinkedListMovie {

    private Node head;

    public LinkedListMovie() {
        head = null;
    }
    public boolean isEmpty() {
        return head == null;
    }

    public Node getHeadNode(){
        return head;
    }

    public void setHeadNode(Node node){
        head = node;
    }

    public void addNewHead (Object obj) {
        if (isEmpty()) {
            head = new Node(obj,null);
        } else {
            //remember right side evaluates first
            head = new Node(obj, head);
        }
    }

    public void addNewTail(Object obj){
        if(isEmpty()) {
            throw new NoSuchElementException("Cannot add item from empty list");
        }
        //need current and previous Nodes to help with pointer adjustment when needed
        Node currentNode = head;

        //need to loop if two or more nodes exist
        while (currentNode.getNext()!= null) {
            currentNode = currentNode.getNext();
        }

        Node tail = new Node(obj, null);
        currentNode.setNext(tail);

    }

    public void addNewNode(Object obj, int index){
        Node currentNode = head;
        int currentIndex = 0;
        while(currentIndex != index){
            currentNode = currentNode.getNext();
            currentIndex++;
        }

            Node newNode = new Node(obj, currentNode.getNext());
            currentNode.setNext(newNode);

    }

    public Object removeHead(){
        Node temp = head;

        head = head.getNext();

            return temp;
    }

    public Object removeTail(){
        Node currentNode = head.getNext();

        while(currentNode.getNext() != null){
            currentNode = currentNode.getNext();
        }



        Node temp = currentNode;

        currentNode.setNext(null);

        return temp.getData();
    }

    //could code remove from the front
    //could code adding somewhere else



    public String toString() {
        //if you toString using array or arraylist usually use StringBuilder
        StringBuilder out = new StringBuilder();
        Node current = head;
        while (current != null) {
            out.append(current.getData());
            out.append("\n\n");
            current = current.getNext();
        }
        return out.toString();
    }
}
