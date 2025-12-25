public class TreatmentQueue {
    private class Node{
        TreatmentRequest data;
        Node next;
        public Node(TreatmentRequest data) {
            this.data = data;
            this.next = null;
        }
    }
    private Node front = null;
    private Node rear = null;
    private int size = 0;

    public void enqueue(TreatmentRequest data) {
        Node newNode = new Node(data);
        if(front == null){
            front = newNode;
            rear = newNode;
        }
        else{
            rear.next = newNode;
            rear = newNode;
        }
     size++;
    }
    public TreatmentRequest dequeue(){
        if(front == null){
            return null;
        }
        TreatmentRequest removedData=front.data;
        front = front.next;
        if(front == null){
            rear = null;
        }
        size--;
        return removedData;
    }
    //returns the current size of the queue.
    public int size(){
        return size;
    }
    //prints all treatment requests in the queue.
    public void printQueue(){
        Node current = front;
        if (current == null){
            System.out.println("Queue is empty");
            return;
        }
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }



}
